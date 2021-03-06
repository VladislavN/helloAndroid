package com.vladnechaev.myapp;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtnClick;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String newString = getString(R.string.new_text);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            getColor(R.color.red);
        }
        ContextCompat.getColor(this, R.color.red);

        mText = findViewById(R.id.tv_text);
        mBtnClick = findViewById(R.id.btn_click);
        mBtnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mText.setText(newString);
                Toast.makeText(MainActivity.this, "Кстати ты пидор", Toast.LENGTH_LONG).show();
            }
        });

        Toast.makeText(this, "Lol kek cheburek", Toast.LENGTH_LONG).show();
    }
}