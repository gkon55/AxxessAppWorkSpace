package com.example.axxessapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.axxessapplication.R;
import com.example.axxessapplication.databinding.ActivityMainBinding;
import com.example.axxessapplication.viewmodel.GridItemViewModel;
import com.example.axxessapplication.viewmodel.MainViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    private MutableLiveData<ArrayList<GridItemViewModel>> arrayListMutableLiveData;
    private GridViewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        mainViewModel = new MainViewModel(this);//ViewModelProviders.of(this).get(MainViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setMainViewModel(mainViewModel);
        binding.setLifecycleOwner(this);

        mainViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<GridItemViewModel>>() {
            @Override
            public void onChanged(ArrayList<GridItemViewModel> gridItemViewModels) {
                gridViewAdapter = new GridViewAdapter(MainActivity.this, gridItemViewModels);
                binding.gridViewId.setAdapter(gridViewAdapter);
            }
        });
    }
}
