package com.example.axxessapplication.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import com.example.axxessapplication.R;
import com.example.axxessapplication.databinding.ActivityMainBinding;
import com.example.axxessapplication.viewmodel.GridItemViewModel;
import com.example.axxessapplication.viewmodel.MainViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;
    private GridViewAdapter gridViewAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainViewModel = new MainViewModel(this);
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
