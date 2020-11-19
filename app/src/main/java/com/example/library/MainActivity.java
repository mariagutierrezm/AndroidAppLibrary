package com.example.library;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAllBooks, btnRead, btnWant, btnCurrent, btnFavourite, btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //java class, constructor(context-(activities are contexts), destination)
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                //inner method that exists on all activities
                startActivity(intent);
            }
        });
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