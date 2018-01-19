package com.example.aulasandroid.idadedocachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainIdadeDoCachorro extends AppCompatActivity {

    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_idade_do_cachorro);

        caixaTexto = findViewById(R.id.caixa_texto_id);
        botaoIdade = findViewById(R.id.botao_idade_id);
        resultadoIdade = findViewById(R.id.resultado_id);

        botaoIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar dado digitados
                String textodigitado = caixaTexto.getText().toString();

                if(textodigitado.isEmpty()){
                    //String vazia (mensagem de error)
                    resultadoIdade.setText("Nenhum número digitado  ");
                }else{
                    int valorDigitado = Integer.parseInt(textodigitado);
                    int resultadoFinal = valorDigitado * 7;

                    resultadoIdade.setText("A idade do cachorro em anos Humano é: "+resultadoFinal);
                }
            }
        });
    }
}
