package com.example.jugandoconactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
    Button volver;
    TextView saludo;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        Intent intent = getIntent();
        saludo= findViewById(R.id.Saludo);
        String nombre = intent.getStringExtra(MainActivity.Nombre);
        saludo.setText("Hola "+nombre);
        volver= findViewById(R.id.buttonVolver);
        num=findViewById(R.id.editTextNumero);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num= findViewById(R.id.editTextNumero);
                Intent intento= new Intent();
                intento.putExtra(MainActivity.Numero,num.getText().toString());
                setResult(RESULT_OK,intento);
                finish();
            }
        });
    }
}