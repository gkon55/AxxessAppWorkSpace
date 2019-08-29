package com.example.axxessapplication.viewmodel;

import android.content.Context;
import android.content.SharedPreferences;

import androidx.databinding.ObservableField;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.axxessapplication.model.Result;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class DetailViewModel extends ViewModel {
    private Result result;
    private Context context;
    private static Gson gson = new Gson();
    private SharedPreferences sharedPreferences;
    private ArrayList<String> commentList;
    public ObservableField<String> commentText = new ObservableField<>("");
    public MutableLiveData<ArrayList<CommentItemViewModel>> arrayListMutableLiveData = new MutableLiveData<>();
    private static  final String COMMENT_SHARED_PREF = "COMMENT_SHARED_PREF";

    public DetailViewModel(Result result, Context context) {
        this.result = result;
        this.context = context;
        sharedPreferences = context.getSharedPreferences(COMMENT_SHARED_PREF, Context.MODE_PRIVATE);
        updateComments();
    }

    public MutableLiveData<ArrayList<CommentItemViewModel>> getArrayListMutableLiveData() {
        return arrayListMutableLiveData;
    }

    public String getTitle() {
        return result.getTitle();
    }

    public String getImageUrl() {
        return result.getImageUrl();
    }

    private void updateComments() {
        ArrayList<CommentItemViewModel> commentItemViewModelArrayList = new ArrayList<>();
        commentList = new ArrayList<>();
        if ( getCommentsList()!= null) {
            commentList.size();
            commentList.addAll(getCommentsList());
            for (String comment : commentList) {
                commentItemViewModelArrayList.add(new CommentItemViewModel(comment));
            }
            arrayListMutableLiveData.setValue(commentItemViewModelArrayList);
        }
    }

    public void saveCommentToSharedPref() {
        if(!commentText.get().isEmpty()) {
            commentList.add(commentText.get());
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString(result.getId(),ListToString(commentList));
            editor.apply();
        }
        updateComments();
    }

    private ArrayList<String> getCommentsList(){
        return fromString(sharedPreferences.getString(result.getId(),""));
    }

    private static ArrayList<String> fromString(String data) {
        Type listType = new TypeToken<ArrayList<String>>() {}.getType();
        return gson.fromJson(data, listType);
    }

    private static String ListToString(ArrayList<String> someObjects) {
        return gson.toJson(someObjects);
    }
}

