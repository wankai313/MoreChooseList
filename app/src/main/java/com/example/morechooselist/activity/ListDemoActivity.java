package com.example.morechooselist.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.morechooselist.R;
import com.example.morechooselist.adapter.ListAdapter;
import com.example.morechooselist.adapter.ListDemoAdapter;
import com.example.morechooselist.bean.ListBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ListDemoActivity extends AppCompatActivity {


    private RecyclerView rvInfo;
    private List<ListBean> list = new ArrayList<ListBean>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvInfo = findViewById(R.id.rvInfo);
        for (int i = 0; i < 50; i++) {
            list.add(new ListBean("栏目" + i));
        }

        rvInfo.setAdapter(new ListDemoAdapter(this,list));
        rvInfo.setLayoutManager(new LinearLayoutManager(this));
    }
}
