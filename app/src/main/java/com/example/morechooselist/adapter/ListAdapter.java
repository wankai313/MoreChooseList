package com.example.morechooselist.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.morechooselist.R;
import com.example.morechooselist.activity.ErrorListActivity;
import com.example.morechooselist.activity.ListDemo2Activity;
import com.example.morechooselist.activity.ListDemoActivity;

import java.util.List;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> {

    public List<String> dataList;
    public Context context;

    public ListAdapter( Context context,List<String> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_list, null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        holder.tvTitle.setText(dataList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                if (position == 0) {
                    intent = new Intent(holder.itemView.getContext(), ErrorListActivity.class);
                } else if (position == 1) {
                    intent = new Intent(holder.itemView.getContext(), ListDemoActivity.class);
                } else {
                    intent = new Intent(holder.itemView.getContext(), ListDemo2Activity.class);
                }
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (dataList == null) ? 0 : dataList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
        }
    }

}
