package com.example.aulasandroid.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gasolinaOuAlcool extends AppCompatActivity {

    private Button verificar;
    private EditText precoAlcool;
    private EditText precoGasolina;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasolina_ou_alcool);
        verificar = findViewById(R.id.botao_verificar);
        precoAlcool = findViewById(R.id.preco_alcool);
        precoGasolina = findViewById(R.id.preco_gasolina);
        resultado = findViewById(R.id.resultado);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recuperar os valores digitados
                String textPrecoAlcool= precoAlcool.getText().toString();
                String textPrecoGasolina = precoGasolina.getText().toString();

                //Converter valores strings para numeros
                Double valorAlcool = Double.parseDouble(textPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textPrecoGasolina);

                //Fazendo o calculo

                double valorTotal = valorAlcool/valorGasolina;
                if (valorTotal >= 0.7){
                    resultado.setText("É melhor utilizar gasolina");
                }else {
                    resultado.setText("É melhor utlizar alcool");
                }
            }
        });
    }


}
