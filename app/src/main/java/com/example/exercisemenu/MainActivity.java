package com.example.exercisemenu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username, password;
    Button btnok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editUN);
        password = (EditText) findViewById(R.id.editPass);
        btnok = (Button) findViewById(R.id.btnok);

        btnok.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")) {

                    Toast.makeText(getApplicationContext(),"Login Sukses", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this, PagemenuhActivity.class);
                    MainActivity.this.startActivity(intent);
                }else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password anda salah!!!").setNegativeButton("Retry", null).create().show();

                }
            }
        });
    }
}
