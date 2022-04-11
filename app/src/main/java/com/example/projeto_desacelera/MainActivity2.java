package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    ImageButton BotaoLivrosTelaAjuda;
    ImageButton BotaoPlaylistsTelaAjuda;
    ImageButton BotaoExerciciosTelaAjuda;
    ImageButton BotaoEnconteTelaAjuda;
    ImageButton BotaoCadastreseTelaAjuda;
    ImageButton BotaoVoltarTelaAjuda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BotaoLivrosTelaAjuda = findViewById(R.id.ibtn_livros_telaajuda);
        BotaoPlaylistsTelaAjuda= findViewById(R.id.ibtn_playlists_telaajuda);
        BotaoExerciciosTelaAjuda = findViewById(R.id.ibtn_exercicios_telaajuda);
        BotaoEnconteTelaAjuda = findViewById(R.id.ibtn_encontre_telaajuda);
        BotaoCadastreseTelaAjuda = findViewById(R.id.ibtn_cadastrese_telaajuda);
        BotaoVoltarTelaAjuda = findViewById(R.id.ibtn_voltar_telaajuda);


        BotaoLivrosTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEnconteTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });

        BotaoCadastreseTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });
        BotaoVoltarTelaAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(it);
            }
        });

    }
}
