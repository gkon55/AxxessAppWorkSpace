package com.example.axxessapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.example.axxessapplication.R;
import com.example.axxessapplication.model.Result;

public class DetailActivity extends AppCompatActivity {
    private static final String EXTRA_ITEM = "EXTRA_ITEM";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }

    public static Intent launchDetail(Context context, Result proposalsItem) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra(EXTRA_ITEM, proposalsItem);
        return intent;
    }

}
