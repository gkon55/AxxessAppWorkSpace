package com.example.axxessapplication.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.axxessapplication.R;
import com.example.axxessapplication.databinding.CommentItemBinding;
import com.example.axxessapplication.viewmodel.CommentItemViewModel;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.CommentAdapterViewHolder> {
    private ArrayList<CommentItemViewModel> commentItemViewModelList;
    public CommentAdapter(ArrayList<CommentItemViewModel> commentItemViewModelList){
        this.commentItemViewModelList = commentItemViewModelList;
    }

    @NonNull
    @Override
    public CommentAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          CommentItemBinding commentItemBinding =  DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_comment, parent, false);
        return new CommentAdapterViewHolder(commentItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CommentAdapterViewHolder holder, int position) {
        holder.onBind(commentItemViewModelList.get(position));
    }

    @Override
    public int getItemCount() {
        return commentItemViewModelList.size();
    }

    public static class CommentAdapterViewHolder extends RecyclerView.ViewHolder{
        CommentItemBinding commentItemBinding;

        public CommentAdapterViewHolder(CommentItemBinding commentItemBinding){
            super(commentItemBinding.commentId);
            this.commentItemBinding = commentItemBinding;
        }

        private void onBind(CommentItemViewModel commentItemViewModel) {
            commentItemBinding.setCommentItemViewModel(commentItemViewModel);
            commentItemBinding.executePendingBindings();
        }
    }
}
