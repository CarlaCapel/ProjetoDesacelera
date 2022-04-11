package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton BotaoAjudaTelaInicial;
    ImageButton BotaoLivrosTelaInicial;
    ImageButton BotaoPlaylistsTelaInicial;
    ImageButton BotaoExerciciosTelaInicial;
    ImageButton BotaoEncontreTelaInicial;
    ImageButton BotaoCadastreseTelaInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BotaoAjudaTelaInicial = findViewById(R.id.ibtn_ajuda_telainicial);
        BotaoLivrosTelaInicial = findViewById(R.id.ibtn_livros_telainicial);
        BotaoPlaylistsTelaInicial = findViewById(R.id.ibtn_playlists_telainicial);
        BotaoExerciciosTelaInicial = findViewById(R.id.ibtn_exercicios_telainicial);
        BotaoEncontreTelaInicial = findViewById(R.id.ibtn_encontre_telainicial);
        BotaoCadastreseTelaInicial = findViewById(R.id.ibtn_cadastrese_telainicial);

       BotaoAjudaTelaInicial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
        }
        });

        BotaoExerciciosTelaInicial.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent it = new Intent(getApplicationContext(), MainActivity5.class);
            startActivity(it);
        }
        });

        BotaoEncontreTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });

        BotaoCadastreseTelaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        }
        }











