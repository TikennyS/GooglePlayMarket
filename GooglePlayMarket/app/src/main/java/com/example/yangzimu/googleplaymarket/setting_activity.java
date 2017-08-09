package com.example.yangzimu.googleplaymarket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by hmd on 2017/5/24.
 */

public class setting_activity extends AppCompatActivity {
    private ImageView button_fanhui;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        button_fanhui  = (ImageView)findViewById(R.id.setting_button_fanhui1);
        button_fanhui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(setting_activity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
