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
import com.example.morechooselist.bean.ListBean2;

import java.util.List;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ListDemo2Adapter extends RecyclerView.Adapter<ListDemo2Adapter.ListViewHolder> {

    public List<ListBean2> dataList;// 数据源
    public Context context;

    public ListDemo2Adapter(Context context, List<ListBean2> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.item_list_view, null);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, final int position) {
        holder.tvTitle.setText(dataList.get(position).getTitle());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 把选中状态存到数据源类
                ListBean2 data = dataList.get(position);
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

        holder.tvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListBean2 data = dataList.get(position);
                // 取反状态值，赋值
                data.setViewShowStatus(!data.isViewShowStatus());
                // 刷新当前item
                notifyItemChanged(position);
            }
        });

        if (dataList.get(position).isViewShowStatus()) {
            holder.vBg.setVisibility(View.VISIBLE);
            holder.tvShow.setText("隐藏");
        } else {
            holder.vBg.setVisibility(View.GONE);
            holder.tvShow.setText("显示");
        }
    }

    @Override
    public int getItemCount() {
        return (dataList == null) ? 0 : dataList.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        public TextView tvTitle;
        public ImageView ivChoose;
        public TextView tvShow;
        public View vBg;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            ivChoose = itemView.findViewById(R.id.ivChoose);
            tvShow = itemView.findViewById(R.id.tvShow);
            vBg = itemView.findViewById(R.id.vBg);
        }
    }

}
