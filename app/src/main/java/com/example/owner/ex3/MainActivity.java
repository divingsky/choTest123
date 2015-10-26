package com.example.owner.ex3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("시작","시작");



        init();
    }

    public void init(){
        Log.e("123","123");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("온스타트","온스타트");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("일시정지","일시정지");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("멈춤", "멈춤");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("온스탑", "온스탑");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("끝남", "끝남");
    }
}
