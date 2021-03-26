package com.example.kopihawa;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Target(View view) {
        Intent intent = new Intent(MainActivity.this, TargetActivity.class);
        startActivity(intent);
    }

    public void Achivement(View view){
        Intent intent = new Intent(MainActivity.this, AchivementActivity.class);
        startActivity(intent);
    }

    public void WorkDay(View view){
        Intent intent = new Intent(MainActivity.this, WorkDayActivity.class);
        startActivity(intent);
    }

    public void Gape(View view){
        Intent intent = new Intent(MainActivity.this, GapeActivity.class);
        startActivity(intent);
    }
}

