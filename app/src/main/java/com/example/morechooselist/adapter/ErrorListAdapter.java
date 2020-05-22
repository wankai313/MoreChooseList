package com.example.morechooselist.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.morechooselist.R;

import java.util.List;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ErrorListAdapter extends RecyclerView.Adapter<ErrorListAdapter.ListViewHolder> {

    public List<String> dataList;
    public Context context;

    public ErrorListAdapter( Context context,List<String> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_list_error, null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        holder.tvTitle.setText(dataList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.ivChoose.setImageResource(R.mipmap.ic_choose);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList == null) ? 0 : dataList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public ImageView ivChoose;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitleError);
            ivChoose = itemView.findViewById(R.id.ivTitleError);
        }
    }

}
