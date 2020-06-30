package com.example.tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleActivity extends AppCompatActivity {
    private Button snake;
    private Button Mine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
        snake=(Button) findViewById(R.id.snake);
        Mine=(Button) findViewById(R.id.Mine);
        snake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitleActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        Mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TitleActivity.this, com.example.tutorial.com.luoye.mine.MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
