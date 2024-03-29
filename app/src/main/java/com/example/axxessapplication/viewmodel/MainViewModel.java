package com.example.axxessapplication.viewmodel;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.axxessapplication.AxxessApplication;
import com.example.axxessapplication.data.DataService;
import com.example.axxessapplication.model.Data;
import com.example.axxessapplication.model.Result;
import com.example.axxessapplication.model.Root;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class MainViewModel extends ViewModel {

    public ObservableField<Boolean> showProgressBar = new ObservableField<>(false);
    public ObservableField<String> searchText = new ObservableField<>("");

    public MutableLiveData<ArrayList<GridItemViewModel>> arrayListMutableLiveData = new MutableLiveData<>();

    private Context context;
    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public MainViewModel(@NonNull Context context) {
        this.context = context;
    }

    public MutableLiveData<ArrayList<GridItemViewModel>> getArrayListMutableLiveData() {
        return arrayListMutableLiveData;
    }

    private void fetchData(String searchText) {
        AxxessApplication axxessApplication = AxxessApplication.create(context);
        DataService dataService = axxessApplication.getDataService();
        Disposable disposable = dataService.fetchResult(searchText.trim())
                .subscribeOn(axxessApplication.subscribeScheduler())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Root>() {
                    @Override
                    public void accept(Root root) throws Exception {
                        Log.d("GIRISH", root.getData().toString());
                        changeSearchItems(root.getData());
                        showProgressBar.set(false);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        Log.d("GIRISH", throwable.getMessage());
                        Toast.makeText(context, "Error Loading Data", Toast.LENGTH_SHORT).show();
                        showProgressBar.set(false);
                    }
                });

        compositeDisposable.add(disposable);
    }

    private void changeSearchItems(List<Data> dataArrayList) {
        Result result;
        GridItemViewModel gridItemViewModel;
        ArrayList<GridItemViewModel> gridItemViewModelArrayList = new ArrayList<>();

        if (!dataArrayList.isEmpty()) {
            for (Data data : dataArrayList) {
                String id = data.getId() != null ? data.getId() : "1";
                String title = data.getTitle() != null ? data.getTitle() : "No Title";
                String urlLink = data.getImages() != null ? (data.getImages().get(0).getLink() != null ? data.getImages().get(0).getLink() : "") : "";
                result = new Result(id, title, urlLink);
                gridItemViewModel = new GridItemViewModel(result, context);
                gridItemViewModelArrayList.add(gridItemViewModel);
            }
            arrayListMutableLiveData.setValue(gridItemViewModelArrayList);
        }
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            compositeDisposable.dispose();
        }
        compositeDisposable = null;
        context = null;
    }

    public void onClickSearch(View view) {
        if (!searchText.get().isEmpty()) {
            showProgressBar.set(true);
            fetchData(searchText.get());
        }
    }
}
