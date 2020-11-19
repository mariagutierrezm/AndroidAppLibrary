package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnRead, btnWant, btnCurrent, btnFavourite, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        btnAllBooks = findViewById(R.id.btnAllBooks);
        btnRead = findViewById(R.id.btnRead);
        btnWant = findViewById(R.id.btnWishList);
        btnCurrent = findViewById(R.id.btnReading);
        btnFavourite = findViewById(R.id.btnFavorites);
        btnAbout = findViewById(R.id.btnAbout);
    }
}