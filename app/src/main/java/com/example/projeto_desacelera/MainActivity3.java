package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity3 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaLivros;
    ImageButton BotaoPlaylistsTelaLivros;
    ImageButton BotaoExerciciosTelaLivros;
    ImageButton BotaoEncontreTelaLivros;
    ImageButton BotaoCadastreseTelaLivros;
    ImageButton BotaoVoltarTelaLivros;

    Button Botao_Baixar_ElsieHerber;
    Button Botao_Baixar_TatianaAuler;
    Button Botao_Baixar_DiegoFalco;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        BotaoAjudaTelaLivros = findViewById(R.id.ibtn_ajuda_telalivros);
        BotaoPlaylistsTelaLivros = findViewById(R.id.ibtn_playlists_telalivros);
        BotaoExerciciosTelaLivros = findViewById(R.id.ibtn_exercicios_telalivros);
        BotaoEncontreTelaLivros = findViewById(R.id.ibtn_encontre_telalivros);
        BotaoCadastreseTelaLivros = findViewById(R.id.ibtn_cadastrese_telalivros);
        BotaoVoltarTelaLivros = findViewById(R.id.ibtn_voltar_telalivros);

        Botao_Baixar_ElsieHerber = findViewById(R.id.btn_baixar_elsieherber);
        Botao_Baixar_TatianaAuler = findViewById(R.id.btn_baixar_tatianaauler);
        Botao_Baixar_DiegoFalco = findViewById(R.id.btn_baixar_diegofalco);

        BotaoAjudaTelaLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });
        BotaoPlaylistsTelaLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });

        BotaoCadastreseTelaLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaLivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });
        Botao_Baixar_ElsieHerber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ebook.elsieherber.com.br/?utm_source=google-ads3&utm_campaign=ebook-elsie&utm_medium=google-ads3-pesquisa&utm_content=ebook-elsie-pesquisa-ads3&gclid=CjwKCAjw_tWRBhAwEiwALxFPoSQ3f72sn2Xc0MhHqjNiO-aUOgEvmeN8rAEqw6Mg8NuTymgm8okc2RoCDgkQAvD_BwE")));
            }
        });
        Botao_Baixar_TatianaAuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.institutoauler.com.br/ebook-ansiedade-gratuito")));
            }
        });
        Botao_Baixar_DiegoFalco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://terapiacognitivaonline.com/ebook-ansiedade/")));
            }
        });


    }
}