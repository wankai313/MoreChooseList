package com.example.morechooselist.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.morechooselist.R;
import com.example.morechooselist.adapter.ListAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvInfo;
    private List<String> list = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvInfo = findViewById(R.id.rvInfo);
        list.add("错误列表");
        list.add("多选列表");
        list.add("显示/隐藏列表");
        rvInfo.setAdapter(new ListAdapter(this,list));
        rvInfo.setLayoutManager(new LinearLayoutManager(this));
    }
}
