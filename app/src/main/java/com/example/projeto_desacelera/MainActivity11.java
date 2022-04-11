package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity11 extends AppCompatActivity {

    ImageButton BotaoVoltarTelaRecuperarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        BotaoVoltarTelaRecuperarSenha = findViewById(R.id.ibtn_voltar_telarecuperarsenha);

        BotaoVoltarTelaRecuperarSenha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });
    }
}