package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity9 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaListaProfissionais;
    ImageButton BotaoLivrosTelaListaProfissionais;
    ImageButton BotaoPlaylistsTelaListaProfissionais;
    ImageButton BotaoExerciciosTelaListaProfissionais;
    ImageButton BotaoEncontreTelaListaProfissionais;
    ImageButton BotaoCadastreseTelaListaProfissionais;
    ImageButton BotaoVoltarTelaListaProfissionais;

    Button BotaoEscolherProfissionalLuiz;
    Button BotaoEscolherProfissionalJoao;
    Button BotaoEscolherProfissionalMaria;
    Button BotaoEscolherProfissionalMarcelo;
    Button BotaoLogoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        BotaoAjudaTelaListaProfissionais = findViewById(R.id.ibtn_ajuda_telalistaprofissionais);
        BotaoLivrosTelaListaProfissionais = findViewById(R.id.ibtn_livros_telalistaprofissionais);
        BotaoPlaylistsTelaListaProfissionais = findViewById(R.id.ibtn_playlists_telalistaprofissionais);
        BotaoExerciciosTelaListaProfissionais = findViewById(R.id.ibtn_exercicios_telalistaprofissionais);
        BotaoEncontreTelaListaProfissionais = findViewById(R.id.ibtn_encontre_telalistaprofissionais);
        BotaoCadastreseTelaListaProfissionais = findViewById(R.id.ibtn_cadastrese_telalistaprofissionais);
        BotaoVoltarTelaListaProfissionais = findViewById(R.id.ibtn_voltar_telalistaprofissionais);

        BotaoEscolherProfissionalLuiz = findViewById(R.id.btn_escolherprofissional_luiz);
        BotaoEscolherProfissionalJoao = findViewById(R.id.btn_escolherprofissional_joao);
        BotaoEscolherProfissionalMaria = findViewById(R.id.btn_escolherprofissional_maria);
        BotaoEscolherProfissionalMarcelo = findViewById(R.id.btn_escolherprofissional_marcelo);
        BotaoLogoff = findViewById(R.id.btn_logoff);


        BotaoAjudaTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });
        BotaoCadastreseTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaListaProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(it);
            }
        });
        BotaoEscolherProfissionalLuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(it);
            }
        });
        BotaoEscolherProfissionalJoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(it);
            }
        });
        BotaoEscolherProfissionalMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(it);
            }
        });
        BotaoEscolherProfissionalMarcelo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity10.class);
                startActivity(it);
            }
        });
        BotaoLogoff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(it);
            }
        });
    }
}
