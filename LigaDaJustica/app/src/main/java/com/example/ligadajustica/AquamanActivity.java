package com.example.ligadajustica;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AquamanActivity extends AppCompatActivity {
    TextView txtrobinname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robin);
        txtrobinname = (TextView) findViewById(R.id.txtrobinname);
        Intent intent = getIntent();
        String Nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        txtrobinname.setText(Nome);

    }
}