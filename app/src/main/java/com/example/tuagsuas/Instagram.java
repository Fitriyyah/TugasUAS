package com.example.tuagsuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Instagram extends AppCompatActivity implements View.OnClickListener {
    private CardView york, ombre, egg, equatore, luthier, mayor;
    private Button nxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram);

        nxt = findViewById(R.id.next);
        nxt.setOnClickListener(this);

        york = findViewById(R.id.yorkig);
        york.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/york.id");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Instagram.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/york.id")));
                }
            }
        });

        ombre = findViewById(R.id.ombreig);
        ombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/ombrecafe");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Instagram.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/ombrecafe")));
                }
            }
        });

        luthier = findViewById(R.id.luthier);
        luthier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/luthiercoffee");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Instagram.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/luthiercoffee")));
                }
            }
        });
        mayor = findViewById(R.id.mayor);
        mayor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/mayorboardgame");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Instagram.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/mayorboardgame")));
                }
            }
        });
        egg = findViewById(R.id.eggsperient);
        egg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/eggsperience.palembang");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Instagram.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/eggsperience.palembang")));
                }
            }
        });
        equatore = findViewById(R.id.equatore);
        equatore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://instagram.com/equatore_rooftop");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.instagram.android");
                try {
                    Toast.makeText(Instagram.this, "Instagram", Toast.LENGTH_SHORT).show();
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com/equatore_rooftop")));
                }
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.next:
                startActivity(new Intent(this, ListView.class));
                break;

        }
    }
}
