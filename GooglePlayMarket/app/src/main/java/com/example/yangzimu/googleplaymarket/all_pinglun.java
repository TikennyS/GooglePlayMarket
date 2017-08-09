package com.example.yangzimu.googleplaymarket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hmd on 2017/6/2.
 */

public class all_pinglun extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.all_pinglun);
        final ImageView fanhui = (ImageView)findViewById(R.id.button_fanhui2);
        fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(all_pinglun.this,zhihu_app.class);
                startActivity(intent);
            }
        });
    }
}
