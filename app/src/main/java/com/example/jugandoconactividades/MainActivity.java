package com.example.jugandoconactividades;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button lanzar;
    EditText nombre;
    public static final String Nombre="NOMBRE";
    public static final String Numero="numero";
    public static final int CODIGO_VUELTA_PARA_SALUDO=1;
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
                startActivityForResult(intent,CODIGO_VUELTA_PARA_SALUDO);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CODIGO_VUELTA_PARA_SALUDO && resultCode== RESULT_OK){
            nombre.setText(nombre.getText()+" indico el numero "+data.getStringExtra(Numero));
        }
    }
}