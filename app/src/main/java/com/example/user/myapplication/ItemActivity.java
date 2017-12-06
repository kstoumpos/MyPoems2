package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {

    TextView positionText, valueText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        positionText = findViewById(R.id.position);
        valueText = findViewById(R.id.value);

        Intent intent = getIntent();
        String itemPosition = intent.getStringExtra("Position");
        String itemValue = intent.getStringExtra("ItemValue");

        positionText.setText(itemPosition);
        valueText.setText(itemValue);
    }
}
