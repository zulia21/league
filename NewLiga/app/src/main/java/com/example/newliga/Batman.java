package com.example.newliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Batman extends AppCompatActivity {
    TextView txtbatname, txtcodinomebat, txtbatespecie, txtcodbat, txthabilbat, txtvulnbat, txtequipbat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batman);
        txtbatname = (TextView) findViewById(R.id.txtbatname);
        txtbatespecie = (TextView) findViewById(R.id.txtbatespecie);
        txtcodinomebat = (TextView) findViewById(R.id.txtcodinomebat);
        txtcodbat = (TextView) findViewById(R.id.txtcodbat);
        txthabilbat = (TextView) findViewById(R.id.txthabilbat);
        txtvulnbat = (TextView) findViewById(R.id.txtvulnbat);
        txtequipbat = (TextView) findViewById(R.id.txtequipbat);

        Intent intent = getIntent();
        String NomeB = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        txtbatname.setText(NomeB);
        String Especie = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ESPECIE);
        txtbatespecie.setText(Especie);
        String Codinome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_CODINOME);
        txtcodinomebat.setText(Codinome);
        String Codigo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_COD);
        txtcodbat.setText(Codigo);
        String Habilidade = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_HABILIDADES);
        txthabilbat.setText(Habilidade);
        String Vulnerabilidade =  intent.getStringExtra(MainActivity.EXTRA_MESSAGE_VULNERABILIDADES);
        txtvulnbat.setText(Vulnerabilidade);
        String Equipamento = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_EQUIPAMENTOS);
        txtequipbat.setText(Equipamento);
    }
}
