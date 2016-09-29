package com.example.jhonnynery.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lista1 extends AppCompatActivity {

    private ListView lista;
    private String[] dados = {

            "35º BI",
            "Aeroporto",
            "Asa Branca",
            "Aviário",
            "Baraúnas",
            "Brasília",
            "Calumbi",
            "Campo Limpo",
            "Caseb",
            "Capuchinhos",
            "Campo do Gado Novo",
            "Chácara São Cosme",
            "Cidade Nova",
            "CIS",
            "Conceição",
            "Feira IV",
            "Feira V",
            "Feira VI",
            "Feira VII",
            "Feira IX",
            "Feira X",
            "Gabriela",
            "Humildes",
            "Jardim Acácia",
            "Jardim Cruzeiro",
            "Lagoa Grande",
            "Limoeiro",
            "Muchila",
            "Nova Esperança",
            "Novo Horizonte",
            "Olhos D'Água",
            "Papagaio",
            "Parque Getúlio Vargas",
            "Parque Ipê",
            "Pedra do Descanso",
            "Ponto Central",
            "Queimadinha",
            "Rua Nova",
            "Univercidade",
            "Santa Mônica",
            "Santo Antônio dos Prazeres",
            "São João",
            "Sobradinho",
            "Sim",
            "Subaé",
            "Tomba"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(R.layout.activity_lista1);

        lista = (ListView) findViewById(R.id.bairros);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                dados
        );
    lista.setAdapter(adapter);


      }
}
