package com.example.newliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MulherMaravilha extends AppCompatActivity {
    TextView txtnomeww, txtcodinomeww,txtespecieww, txtcodww, txthabilidadeww, txtvulnww, txtequipww;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_maravilha);
        txtnomeww = (TextView) findViewById(R.id.txtnomeww);
        txtcodinomeww = (TextView) findViewById(R.id.txtcodinomeww);
        txtespecieww = (TextView) findViewById(R.id.txtespecieww);
        txtcodww = (TextView) findViewById(R.id.txtcodww);
        txthabilidadeww = (TextView) findViewById(R.id.txthabilidadeww);
        txtvulnww =(TextView) findViewById(R.id.txtvulnww);
        txtequipww = (TextView) findViewById(R.id.txtequipww);
        Intent intent = getIntent();
        String Nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        txtnomeww.setText(Nome);
        String Codinome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_CODINOME);
        txtcodinomeww.setText(Codinome);
        String Especie = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ESPECIE);
        txtespecieww.setText(Especie);
        String Codigo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_COD);
        txtcodww.setText(Codigo);
        String Habilidade = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_HABILIDADES);
        txthabilidadeww.setText(Habilidade);
        String Vulnerabilidade = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_VULNERABILIDADES);
        txtvulnww.setText(Vulnerabilidade);
        String Equipamentos = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_EQUIPAMENTOS);
        txtequipww.setText(Equipamentos);
    }
}
