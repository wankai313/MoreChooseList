package com.example.morechooselist.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.morechooselist.R;
import com.example.morechooselist.activity.ErrorListActivity;
import com.example.morechooselist.bean.ListBean;
import com.example.morechooselist.bean.ListBean2;

import java.util.List;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ListDemoAdapter extends RecyclerView.Adapter<ListDemoAdapter.ListViewHolder> {

    public List<ListBean> dataList;// 数据源
    public Context context;


    public ListDemoAdapter(Context context, List<ListBean> dataList) {
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
        holder.tvTitle.setText(dataList.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 把选中状态存到数据源类
                ListBean data = dataList.get(position);
                // 取反状态值，赋值
                data.setBtnStatus(!data.isBtnStatus());
                // 刷新当前item
                notifyItemChanged(position);
            }
        });
        if (dataList.get(position).isBtnStatus()) {
            holder.ivChoose.setImageResource(R.mipmap.ic_choose);
        } else {
            holder.ivChoose.setImageResource(R.mipmap.ic_un_choose);

        }
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
