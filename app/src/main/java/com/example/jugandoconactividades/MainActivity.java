package com.example.jugandoconactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button lanzar;
    EditText nombre;
    public static final String Nombre="NOMBRE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lanzar= findViewById(R.id.buttonLanzar);
        nombre = findViewById(R.id.Nombre);
        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, SaludoActivity.class);
                intent.putExtra(Nombre,nombre.getText().toString());
                startActivity(intent);
            }
        });
    }
}