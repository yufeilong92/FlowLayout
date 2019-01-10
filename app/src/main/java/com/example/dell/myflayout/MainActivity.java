package com.example.dell.myflayout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements KingoitFlowLayout.ItemClickListener  {

    private KingoitFlowLayout mKingoitFlowLayout;
    private ArrayList<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        mList = initData();
        initEvent();
    }

    private void initEvent() {
        mKingoitFlowLayout.showTag(mList,this);
    }

    private ArrayList<String> initData() {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 300; i++) {
            if (i%2==0) {
                list.add("这是个偶数");
            }else {
                list.add("这是个奇数");
            }
        }
        return list;
    }

    private void initView() {
        mKingoitFlowLayout = (KingoitFlowLayout) findViewById(R.id.kingoit_flow_layout);
    }

    @Override
    public void onClick(String currentSelectedkeywords, List<String> allSelectedKeywords) {

    }
}
