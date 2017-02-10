package com.example.evasaifa.constraints;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mButtonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonNext = (Button) findViewById(R.id.btn_next);
        mButtonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_next: {
                Intent intent = new Intent(this, ScrollViewActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
