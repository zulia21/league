package com.example.newliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Flash extends AppCompatActivity {
    TextView txtflashname, txtflashcodinome, txtflashespecie, txtflashcod, txtflashhabilidade, txtflashvuln, txtflashequip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);
        txtflashname = (TextView) findViewById(R.id.txtflashname);
        txtflashcodinome = (TextView) findViewById(R.id.txtflashcodinome);
        txtflashespecie = (TextView) findViewById(R.id.txtflashespecie);
        txtflashcod = (TextView) findViewById(R.id.txtflashcod);
        txtflashhabilidade = (TextView) findViewById(R.id.txtflashhabilidade);
        txtflashvuln = (TextView) findViewById(R.id.txtflashvuln);
        txtflashequip = (TextView) findViewById(R.id.txtflashequip);
        Intent intent = getIntent();
        String Nome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        txtflashname.setText(Nome);
        String Codinome = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_CODINOME);
        txtflashcodinome.setText(Codinome);
        String Especie = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_ESPECIE);
        txtflashespecie.setText(Especie);
        String Vulnerabilidades = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_VULNERABILIDADES);
        txtflashvuln.setText(Vulnerabilidades);
        String Equipamentos = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_EQUIPAMENTOS);
        txtflashequip.setText(Equipamentos);
        String Habilidade = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_HABILIDADES);
        txtflashhabilidade.setText(Habilidade);
        String Codigo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_COD);
        txtflashcod.setText(Codigo);

    }
}
