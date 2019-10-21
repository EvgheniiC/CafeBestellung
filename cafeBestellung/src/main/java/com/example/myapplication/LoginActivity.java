package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editTextName;
    EditText editTextPasswort;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextName.findViewById(R.id.editTextName);
        editTextPasswort.findViewById(R.id.editTextPasswort);
    }

    public void cafeBestellen(View view) {
        String name = editTextName.getText().toString().trim();
        String passwort = editTextName.getText().toString().trim();
        if (!name.isEmpty() && !passwort.isEmpty()) {
            Intent intent = new Intent(this, BestelungActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("passwort",passwort);
            startActivity(intent);
        }
        else {
            Toast.makeText(this,R.string.NameorPassNichtGultig,Toast.LENGTH_SHORT).show();
        }
    }
}
