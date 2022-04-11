package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity12 extends AppCompatActivity {

    ImageButton BotaoVoltarTelaSelecionarPerfil;
    Button BotaoUsuarioTelaSelecionarPerfil;
    Button BotaoProfissionalTelaSelecionarPerfil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        BotaoVoltarTelaSelecionarPerfil = findViewById(R.id.ibtn_voltar_telaselecionarperfil);
        BotaoUsuarioTelaSelecionarPerfil = findViewById(R.id.btn_usuario_telaselecionarperfil);
        BotaoProfissionalTelaSelecionarPerfil = findViewById(R.id.btn_profissional_telaselecionarperfil);

        BotaoVoltarTelaSelecionarPerfil.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(it);
            }
        });

        BotaoUsuarioTelaSelecionarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity7.class);
                startActivity(it);
            }
        });

        BotaoProfissionalTelaSelecionarPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity8.class);
                startActivity(it);
            }
        });

    }
}