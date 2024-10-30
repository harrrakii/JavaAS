package com.example.practo2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        ImageView flagView = findViewById(R.id.detail_flag);
        TextView nameView = findViewById(R.id.detail_name);
        TextView capitalView = findViewById(R.id.detail_capital);
        Button backButton = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String capital = intent.getStringExtra("capital");
        int flagResource = intent.getIntExtra("flag", 0);

        flagView.setImageResource(flagResource);
        nameView.setText(name);
        capitalView.setText(capital);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
