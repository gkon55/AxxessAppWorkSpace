package com.example.axxessapplication.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;

import com.example.axxessapplication.R;
import com.example.axxessapplication.databinding.GridItemBinding;
import com.example.axxessapplication.viewmodel.GridItemViewModel;

import java.util.ArrayList;

import javax.inject.Inject;

public class GridViewAdapter extends BaseAdapter {
   @Inject
   public Context context;

   private ArrayList<GridItemViewModel> gridItemArrayList;

   public GridViewAdapter(Context context, ArrayList<GridItemViewModel> gridItemArrayList){
       this.context = context;
       this.gridItemArrayList = gridItemArrayList;
   }

    @Override
    public int getCount() {
        return gridItemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return gridItemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup paxrent) {
        GridItemBinding gridItemBinding;
       if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_grid_view, null);
            gridItemBinding = DataBindingUtil.bind(convertView);
            convertView.setTag(gridItemBinding);

       } else {
            gridItemBinding = (GridItemBinding)convertView.getTag();
       }

        gridItemBinding.setGridItemViewModel(gridItemArrayList.get(position));
        return gridItemBinding.getRoot();
    }
}
