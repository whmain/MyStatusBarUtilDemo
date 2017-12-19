package com.topsun.tyrelifemanagerv3.mystatusbarutildemo;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

import com.wh.mystatusbarutil.MyStatusBarUtil;

public class MainActivity extends AppCompatActivity {

    private LinearLayout titleLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        setGradient();
    }

    private void init(){
        titleLayout = (LinearLayout) findViewById(R.id.linearlayout);
        Toolbar toolbar =  (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("tab1"));
        tabLayout.addTab(tabLayout.newTab().setText("tab2"));
        tabLayout.addTab(tabLayout.newTab().setText("tab3"));
        tabLayout.addTab(tabLayout.newTab().setText("tab4"));
    }
    private void setGradient() {
        //      设置渐变色头部
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BL_TR,
                new int[]{Color.parseColor("#FF4081"),Color.parseColor("#FF4081"),Color.parseColor("#FF4081"),Color.parseColor("#FFA081")});
        MyStatusBarUtil.setGradientDrawableForViewGroup(this,titleLayout,gradientDrawable,0);
    }


    public void clickToSkip(View view){
        startActivity(new Intent(this,DrawerTestActivity.class));
    }

}
