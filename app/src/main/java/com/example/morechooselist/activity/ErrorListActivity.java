package com.example.morechooselist.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.morechooselist.R;
import com.example.morechooselist.adapter.ErrorListAdapter;
import com.example.morechooselist.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Date:2020/5/22
 * des:
 * author:wankai
 **/
public class ErrorListActivity extends AppCompatActivity {


    private RecyclerView rvInfo;
    private List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvInfo = findViewById(R.id.rvInfo);
        for (int i = 0; i < 50; i++) {
            list.add("错误item" + i);
        }

        rvInfo.setAdapter(new ErrorListAdapter(this,list));
        rvInfo.setLayoutManager(new LinearLayoutManager(this));
    }
}
