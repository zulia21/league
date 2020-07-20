package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spnherois;
    Button btngo;
    public final static String EXTRA_MESSAGE_NAME ="com.example.escoladb.NAME";
    public final static String EXTRA_MESSAGE_COD ="com.example.escoladb.COD";
    public final static String EXTRA_MESSAGE_CODINOME ="com.example.escoladb.CODINOME";
    public final static String EXTRA_MESSAGE_ESPECIE ="com.example.escoladb.ESPECIE";
    public final static String EXTRA_MESSAGE_HABILIDADES ="com.example.escoladb.HABILIDADES";
    public final static String EXTRA_MESSAGE_VULNERABILIDADES ="com.example.escoladb.VULNERABILIDADES";
    public final static String EXTRA_MESSAGE_EQUIPAMENTOS ="com.example.escoladb.EQUIPAMENTOS";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngo = (Button) findViewById(R.id.btngo);
        spnherois = (Spinner) findViewById(R.id.spnherois);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spinheroes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnherois.setAdapter(adapter);
        spnherois.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);



    }
    String optionspinner;
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            btngo.setEnabled(false);
        }
        else {
            btngo.setEnabled(true);



        }
        optionspinner = parent.getItemAtPosition(position).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void Consultar(View view)
    {

        if (optionspinner.equals("Batman"))
        {
            Intent intent = new Intent(this, BatmanActivity.class);
            intent.putExtra(EXTRA_MESSAGE_NAME, "Bruce Wayne");
            intent.putExtra(EXTRA_MESSAGE_CODINOME, "Batman");
            intent.putExtra(EXTRA_MESSAGE_ESPECIE, "Humano");
            intent.putExtra(EXTRA_MESSAGE_COD, "2039");
            intent.putExtra(EXTRA_MESSAGE_HABILIDADES, "Intelecto, Artes Marciais aguçadas, Intimidação");
            intent.putExtra(EXTRA_MESSAGE_VULNERABILIDADES, "Sua familia, especialmente seus pais");
            intent.putExtra(EXTRA_MESSAGE_EQUIPAMENTOS, "Batmóvel");

            startActivity(intent);
        }

        if (optionspinner.equals("Aquaman"))
        {
            Intent intent = new Intent(this , AquamanActivity.class);
            intent.putExtra(EXTRA_MESSAGE_NAME, "Arthur Curry");
            intent.putExtra(EXTRA_MESSAGE_CODINOME, "Aquaman");
            intent.putExtra(EXTRA_MESSAGE_ESPECIE, "Híbrido de Atlante e Humano");
            intent.putExtra(EXTRA_MESSAGE_COD, "5090");
            intent.putExtra(EXTRA_MESSAGE_HABILIDADES, "Super-força, Natação, Respiração Subaquatica, Comunicação com seres marinhos");
            intent.putExtra(EXTRA_MESSAGE_VULNERABILIDADES, "Ausência de Água");
            intent.putExtra(EXTRA_MESSAGE_EQUIPAMENTOS, "Tridente");

            startActivity(intent);
        }
        if (optionspinner == "Mulher-Maravilha")
        {

        }
        if (optionspinner == "Mulher-Gato")
        {

        }

    }
}
