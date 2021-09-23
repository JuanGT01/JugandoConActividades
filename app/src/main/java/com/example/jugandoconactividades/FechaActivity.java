package com.example.jugandoconactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FechaActivity extends AppCompatActivity {
    Button volver;
    TextView saludo;
    EditText fech;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fecha);
        Intent intent = getIntent();
        saludo= findViewById(R.id.saludo);
        String nombres = intent.getStringExtra(MainActivity.Nombre);
        saludo.setText("Hola "+nombres);
        volver= findViewById(R.id.volver);
        fech=findViewById(R.id.editTextFecha);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fech= findViewById(R.id.editTextFecha);
                Intent intento= new Intent();
                intento.putExtra(MainActivity.Numero,fech.getText().toString());
                setResult(RESULT_OK,intento);
                finish();
            }
        });
    }
}