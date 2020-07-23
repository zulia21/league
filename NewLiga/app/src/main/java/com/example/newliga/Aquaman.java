package com.example.newliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Aquaman extends AppCompatActivity {
    TextView txtraquaname, txtcodaqua, txtespecieaqua, txtcodinomeaqua, txthabilidadeaqua, txtvulnaqua, txtequipaqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquaman);
        txtcodaqua = (TextView) findViewById(R.id.txtcodaqua);
        txtraquaname = (TextView) findViewById(R.id.txtaquaname) ;
        txtespecieaqua = (TextView) findViewById(R.id.txtxespecieaqua);
        txtcodinomeaqua = (TextView) findViewById(R.id.txtcodinomeaqua);
        txthabilidadeaqua = (TextView) findViewById(R.id.txthabilidadeaqua);
        txtequipaqua = (TextView) findViewById(R.id.txtequipaqua);
        txtvulnaqua = (TextView) findViewById(R.id.txtvulnaqua);
        Intent intent = getIntent();
        String Codigo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_COD);
        txtcodaqua.setText(Codigo);
        String Nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        txtraquaname.setText(Nome);
        String Especie = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ESPECIE);
        txtespecieaqua.setText(Especie);
        String Codinome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_CODINOME);
        txtcodinomeaqua.setText(Codinome);
        String Habilidade = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_HABILIDADES);
        txthabilidadeaqua.setText(Habilidade);
        String Vulnerabilidades = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_VULNERABILIDADES);
        txtvulnaqua.setText(Vulnerabilidades);
        String Equipamentos = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_EQUIPAMENTOS);
        txtequipaqua.setText(Equipamentos);
    }
}
