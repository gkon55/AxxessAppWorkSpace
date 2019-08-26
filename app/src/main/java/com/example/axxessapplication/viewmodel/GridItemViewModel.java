package com.example.axxessapplication.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.bumptech.glide.Glide;
import com.example.axxessapplication.model.Result;
import com.example.axxessapplication.view.DetailActivity;

import java.util.ArrayList;

public class GridItemViewModel extends ViewModel {

    private Result result;
    private Context context;

    public GridItemViewModel(Result result, Context context){
        this.result = result;
        this.context = context;
    }

    public String getTitle() {
        return result.getTitle();
    }

    public String getImageUrl() {
        return result.getImageUrl();
    }

    @BindingAdapter("imageUrl")
    public static  void setImageUrl(ImageView imageView, String imageUrl){
        Glide.with(imageView.getContext()).load(imageUrl).into(imageView);
    }

    public void onItemClicked(View view){
        context.startActivity(DetailActivity.launchDetail(view.getContext(), result));
    }
}
