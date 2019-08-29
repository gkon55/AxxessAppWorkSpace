package com.example.axxessapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import com.example.axxessapplication.R;
import com.example.axxessapplication.databinding.ActivityDetailBinding;
import com.example.axxessapplication.model.Result;
import com.example.axxessapplication.viewmodel.CommentItemViewModel;
import com.example.axxessapplication.viewmodel.DetailViewModel;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {
    private DetailViewModel detailViewModel;
    private ActivityDetailBinding binding;
    private CommentAdapter commentAdapter;
    private static final String EXTRA_ITEM = "EXTRA_ITEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        Result result = (Result) getIntent().getParcelableExtra(EXTRA_ITEM);
        detailViewModel = new DetailViewModel(result, this);
        binding.setDetailViewModel(detailViewModel);
        binding.setLifecycleOwner(this);
        detailViewModel.getArrayListMutableLiveData().observe(this, new Observer<ArrayList<CommentItemViewModel>>() {
            @Override
            public void onChanged(ArrayList<CommentItemViewModel> commentItemViewModels) {
                commentAdapter = new CommentAdapter(commentItemViewModels);
                binding.recyclerviewId.setAdapter(commentAdapter);
            }
        });
    }
}
