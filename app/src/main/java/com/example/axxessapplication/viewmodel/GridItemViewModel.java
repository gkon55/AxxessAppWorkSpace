package com.example.axxessapplication.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;
import androidx.lifecycle.ViewModel;

import com.bumptech.glide.Glide;
import com.example.axxessapplication.model.Result;
import com.example.axxessapplication.view.DetailActivity;

public class GridItemViewModel extends ViewModel {
    private static final String EXTRA_ITEM = "EXTRA_ITEM";

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

    public void onItemClicked(){
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_ITEM, result);
        context.startActivity(intent);
    }
}
