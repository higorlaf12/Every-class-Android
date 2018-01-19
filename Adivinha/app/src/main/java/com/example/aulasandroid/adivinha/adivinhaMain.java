package com.example.aulasandroid.adivinha;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class adivinhaMain extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adivinha_main);

        botaoJogar = findViewById(R.id.botaoJogarId);
        textoResultado = findViewById(R.id.resultadoDoID);

       botaoJogar.setOnClickListener(new View.OnClickListener() {
           @SuppressLint("SetTextI18n")
           @Override
           public void onClick(View v) {

               Random random = new Random();

               int numeroAleatorio = random.nextInt(10);


               textoResultado.setText("Número escolhido: " + numeroAleatorio);
           }
       });
    }
}
