package com.example.aulasandroid.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Frase_do_dia_main extends AppCompatActivity {

    private Button novaFrase;
    private TextView textNovaFrase;


    private String [] frases = {"Olá tudo bem ?","Como você vai ?","Tudo bem ?","affs!!Quero correr ?"
    ,"Né possivel !","Ferrou!!!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase_do_dia_main);

        novaFrase = findViewById(R.id.botaoNovaFrase);
        textNovaFrase = findViewById(R.id.novoTexto);



        novaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int numeroAleatorio  = random.nextInt(frases.length);
                textNovaFrase.setText(frases[numeroAleatorio]);
            }
        });
    }
}
