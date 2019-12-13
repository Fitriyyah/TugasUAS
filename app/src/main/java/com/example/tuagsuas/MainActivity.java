package com.example.tuagsuas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tombol;
    private Button masuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol= findViewById(R.id.signup);
        tombol.setOnClickListener(this);

        masuk = findViewById(R.id.login);
        masuk.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.signup:
                startActivity(new Intent(this, SignUp.class));
                break;
            case R.id.login:
                startActivity(new Intent(this, Instagram.class));
                break;


        }
    }
}
