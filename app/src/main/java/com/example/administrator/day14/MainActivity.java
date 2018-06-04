package com.example.administrator.day14;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TitleActivity mTa;
    /**
     * Hello World!
     */
    private TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTa = (TitleActivity) findViewById(R.id.ta);
        mTv = (TextView) findViewById(R.id.tv);
        mTa.setOnItemClickListener(new TitleActivity.OnItemClickListener() {
            @Override
            public void onClickLeft(View v) {
                Toast.makeText(MainActivity.this, "点击了返回按钮", Toast.LENGTH_LONG).show();
                mTv.setText("点击了返回按钮");
            }

            @Override
            public void onClickRigth(View v) {
                Toast.makeText(MainActivity.this, "点击了提交按钮", Toast.LENGTH_LONG).show();
                mTv.setText("点击了提交按钮");
            }
        });

    }
}
