package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class PagemenuhActivity extends AppCompatActivity {
    Button btnpersegi;
    Button btnpersegipanjang;
    Button btnlingkaran;
    Button btnsegitiga;
    Button btntrapesium;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagemenuh);

        btnpersegi = (Button) findViewById(R.id.Persegi);
        btnpersegipanjang = (Button) findViewById(R.id.PersegiPanjang);
        btnlingkaran = (Button) findViewById(R.id.Lingkaran);
        btnsegitiga = (Button) findViewById(R.id.Segitiga);
        btntrapesium = (Button) findViewById(R.id.Trapesium);

        btnpersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                PopupMenu popupMenu = new PopupMenu(PagemenuhActivity.this, btnpersegi);
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());


                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        if (item.getItemId() == R.id.LuasPersegi) {
                            startActivity(new Intent(v.getContext(),RumusPersegi.class));
                        } else if (item.getItemId() == R.id.keliling) {
                            startActivity(new Intent(v.getContext(), KelilingPersegi.class));
                        }

                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}
