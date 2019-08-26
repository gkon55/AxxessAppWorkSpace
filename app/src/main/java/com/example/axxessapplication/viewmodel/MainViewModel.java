package com.example.axxessapplication.viewmodel;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.axxessapplication.AxxessApplication;
import com.example.axxessapplication.R;
import com.example.axxessapplication.data.DataService;
import com.example.axxessapplication.model.Data;
import com.example.axxessapplication.model.Images;
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
  private final CompositeDisposable compositeDisposable = new CompositeDisposable();
  private static final String CLIENT_KEY = "Client-ID 137cda6b5008a7c";

  public MainViewModel(@NonNull Context context){
      this.context = context;
  }

  public void fetchData( String searchText){
    AxxessApplication axxessApplication = AxxessApplication.create(context);
      DataService dataService = axxessApplication.getDataService();

      Disposable disposable = dataService.fetchResult(CLIENT_KEY, searchText)
              .subscribeOn(axxessApplication.subscribeScheduler())
              .observeOn(AndroidSchedulers.mainThread())
              .subscribe(new Consumer<Root>() {
                  @Override
                  public void accept(Root root) throws Exception {
                      changeSearchItems(root.getData());
                      showProgressBar.set(false);
                  }
              }, new Consumer<Throwable>() {
                  @Override
                  public void accept(Throwable throwable) throws Exception {
                     // Log.d(TAG, throwable.getMessage());
                      Toast.makeText(context,"Error Loading Data", Toast.LENGTH_SHORT).show();
                      showProgressBar.set(false);
                  }
              });

      compositeDisposable.add(disposable);
  }

  private void changeSearchItems(List<Data> dataArrayList){
      Result result;
      GridItemViewModel gridItemViewModel;
      ArrayList<GridItemViewModel> gridItemViewModelArrayList = new ArrayList<>();

      for (Data data: dataArrayList) {
        result = new Result(data.getImages().get(0).getTitle(), data.getTitle());
          gridItemViewModel = new GridItemViewModel(result, context);
          gridItemViewModelArrayList.add(gridItemViewModel);
      }
      arrayListMutableLiveData.setValue(gridItemViewModelArrayList);
  }
}
