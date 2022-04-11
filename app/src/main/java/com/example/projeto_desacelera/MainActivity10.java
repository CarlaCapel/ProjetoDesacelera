package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity10 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaAnamnese;
    ImageButton BotaoLivrosTelaAnamnese;
    ImageButton BotaoPlaylistsTelaAnamnese;
    ImageButton BotaoExerciciosTelaAnamnese;
    ImageButton BotaoEncontreTelaAnamnese;
    ImageButton BotaoCadastreseTelaAnamnese;
    ImageButton BotaoVoltarTelaAnamnese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        BotaoAjudaTelaAnamnese = findViewById(R.id.ibtn_ajuda_telaanamnese);
        BotaoLivrosTelaAnamnese = findViewById(R.id.ibtn_livros_telaanamnese);
        BotaoPlaylistsTelaAnamnese = findViewById(R.id.ibtn_playlists_telaanamnese);
        BotaoExerciciosTelaAnamnese = findViewById(R.id.ibtn_exercicios_telaanamnese);
        BotaoEncontreTelaAnamnese = findViewById(R.id.ibtn_encontre_telaanamnese);
        BotaoCadastreseTelaAnamnese = findViewById(R.id.ibtn_cadastrese_telaanamnese);
        BotaoVoltarTelaAnamnese = findViewById(R.id.ibtn_voltar_telaanamnese);


        BotaoAjudaTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });
        BotaoCadastreseTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaAnamnese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity9.class);
                startActivity(it);
            }
        });

    }
}
