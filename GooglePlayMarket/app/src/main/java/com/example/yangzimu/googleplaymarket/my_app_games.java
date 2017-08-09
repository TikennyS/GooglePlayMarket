package com.example.yangzimu.googleplaymarket;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ScrollView;

public class my_app_games extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_app_games);
        //final TabLayout tabLayout=(TableLayout)findViewById(R.id.tabs);

        final ScrollView scrollingView1=(ScrollView) findViewById(R.id.ScrollView1);
        final ScrollView scrollingView2=(ScrollView) findViewById(R.id.ScrollView2);


    }
}
