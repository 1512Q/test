package com.example.administrator.day14;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/5/24 0024.
 */

public class TitleActivity extends LinearLayout {

    private TextView fanhui;
    private TextView commit;

    public TitleActivity(Context context) {
        this(context,null);
    }

    public TitleActivity(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TitleActivity(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initview(context);

    }
    //1定义一个接口
    public interface OnItemClickListener{
        void onClickLeft(View v);
        void onClickRigth(View v);
    }
    //2.声明一个接口对象
    private OnItemClickListener listener;
    //3.给外部提供一个设置接口对象的方法
    public void setOnItemClickListener(OnItemClickListener listener){
        this.listener=listener;

    }
    private void initview(Context context) {
        View view = View.inflate(context, R.layout.title_item, this);
        fanhui = view.findViewById(R.id.fanhui);
        commit = view.findViewById(R.id.commit);
        fanhui.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClickLeft(view);
            }
        });

        commit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClickRigth(view);
            }
        });
    }
}
