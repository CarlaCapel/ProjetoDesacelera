package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity4 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaPlaylists;
    ImageButton BotaoLivrosTelaPlaylists;
    ImageButton BotaoExerciciosTelaPlaylists;
    ImageButton BotaoEncontreTelaPlaylists;
    ImageButton BotaoCadastreseTelaPlaylists;
    ImageButton BotaoVoltarTelaPlaylists;

    Button Botao_Musica_FundodoMar;
    Button Botao_Musica_SonsdaNatureza;
    Button Botao_Musica_Instrumental;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BotaoAjudaTelaPlaylists = findViewById(R.id.ibtn_ajuda_telaplaylists);
        BotaoLivrosTelaPlaylists = findViewById(R.id.ibtn_livros_telaplaylists);
        BotaoExerciciosTelaPlaylists = findViewById(R.id.ibtn_exercicios_telaplaylists);
        BotaoEncontreTelaPlaylists = findViewById(R.id.ibtn_encontre_telaplaylists);
        BotaoCadastreseTelaPlaylists = findViewById(R.id.ibtn_cadastrese_telaplaylists);
        BotaoVoltarTelaPlaylists = findViewById(R.id.ibtn_voltar_telaplaylists);

        Botao_Musica_FundodoMar = findViewById(R.id.btn_musica_fundodomar);
        Botao_Musica_SonsdaNatureza = findViewById(R.id.btn_musica_sonsdanatureza);
        Botao_Musica_Instrumental = findViewById(R.id.btn_musica_instrumental);

        BotaoAjudaTelaPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });

        BotaoCadastreseTelaPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaPlaylists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });
        Botao_Musica_FundodoMar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=7Lm2skxgM6E&t=8s")));
            }
        });
        Botao_Musica_SonsdaNatureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Dho_VqAAJC8&t=36s")));
            }
        });
        Botao_Musica_Instrumental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Y0plyNaxy30")));
            }
        });

    }
}
