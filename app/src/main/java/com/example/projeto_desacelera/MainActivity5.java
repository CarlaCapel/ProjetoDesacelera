package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity5 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaExercicios;
    ImageButton BotaoLivrosTelaExercicios;
    ImageButton BotaoPlaylistsTelaExercicios;
    ImageButton BotaoEncontreTelaExercicios;
    ImageButton BotaoCadastreseTelaExercicios;
    ImageButton BotaoVoltarTelaExercicios;

    Button BotaoMaisExerciciosTelaExercicios;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        BotaoAjudaTelaExercicios = findViewById(R.id.ibtn_ajuda_telaexercicios);
        BotaoLivrosTelaExercicios = findViewById(R.id.ibtn_livros_telaexercicios);
        BotaoPlaylistsTelaExercicios = findViewById(R.id.ibtn_playlists_telaexercicios);
        BotaoEncontreTelaExercicios = findViewById(R.id.ibtn_encontre_telaexercicios);
        BotaoCadastreseTelaExercicios = findViewById(R.id.ibtn_cadastrese_telaexercicios);
        BotaoVoltarTelaExercicios = findViewById(R.id.ibtn_voltar_telaexercicios);

        BotaoMaisExerciciosTelaExercicios = (Button) findViewById(R.id.btn_maisexercicios_telaexercicios);


        BotaoAjudaTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });

        BotaoCadastreseTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);

            }
        });

        BotaoMaisExerciciosTelaExercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5aHGlekF2lQ")));
            }
        });

    }
}


