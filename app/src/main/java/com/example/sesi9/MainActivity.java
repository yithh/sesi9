package com.example.sesi9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TextView name;
    Button onClickBtn;
    Button toast;
    Button sbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.tv_title);
        name = findViewById(R.id.tv_name);
        onClickBtn = findViewById(R.id.btn_submit);
        toast = findViewById(R.id.btn_toast);
        sbar = findViewById(R.id.btn_sbar);

        onClickBtn.setOnClickListener(v -> {
            title.setText("Wah textnya berubah!");
        });

        onClickBtn.setOnLongClickListener(v -> {
            name.setTextColor(getResources().getColor(R.color.purple_200));
            return true;
        });

        toast.setOnClickListener(v ->{
            Toast.makeText(MainActivity.this, "Ini Toast", Toast.LENGTH_SHORT).show();
        });

        sbar.setOnClickListener(v->{
            Snackbar.make(findViewById(R.id.coordinator), "Ini Snackbar",Snackbar.LENGTH_LONG).show();
        });
    }
}