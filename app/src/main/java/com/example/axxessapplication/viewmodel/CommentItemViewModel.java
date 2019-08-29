package com.example.axxessapplication.viewmodel;

import androidx.lifecycle.ViewModel;

public class CommentItemViewModel extends ViewModel {
    private String commentText;

    public CommentItemViewModel(String commentText){
        this.commentText = commentText;
    }

    public String getCommentText() {
        return commentText;
    }
}
