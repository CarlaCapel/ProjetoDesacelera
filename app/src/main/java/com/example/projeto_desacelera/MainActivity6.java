package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.projeto_desacelera.database.BancoSQLite;
import com.example.projeto_desacelera.modelos.Profissionais;
import com.example.projeto_desacelera.modelos.Usuario;

public class MainActivity6 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaLogin;
    ImageButton BotaoLivrosTelaLogin;
    ImageButton BotaoPlaylistsTelaLogin;
    ImageButton BotaoExerciciosTelaLogin;
    ImageButton BotaoCadastreseTelaLogin;
    ImageButton BotaoVoltarTelaLogin;
    Button BotaoEsqueciaSenha;

    EditText Edt_Usuario_Telalogin;
    EditText Edt_Senha_Telalogin;
    ImageButton BotaoEnviarTelaLogin;
    CheckBox CheckBox_Paciente;
    int paciente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        BotaoAjudaTelaLogin = findViewById(R.id.ibtn_ajuda_telalogin);
        BotaoLivrosTelaLogin = findViewById(R.id.ibtn_livros_telalogin);
        BotaoPlaylistsTelaLogin = findViewById(R.id.ibtn_playlists_telalogin);
        BotaoExerciciosTelaLogin = findViewById(R.id.ibtn_exercicios_telalogin);
        BotaoCadastreseTelaLogin = findViewById(R.id.ibtn_cadastrese_telalogin);
        BotaoVoltarTelaLogin = findViewById(R.id.ibtn_voltar_telalogin);
        BotaoEsqueciaSenha = findViewById(R.id.btn_esqueci_senha);

        Edt_Usuario_Telalogin = findViewById(R.id.edt_usuario_telalogin);
        Edt_Senha_Telalogin = findViewById(R.id.edt_senha_telalogin);
        BotaoEnviarTelaLogin = findViewById(R.id.ibtn_enviar_telalogin);
        CheckBox_Paciente = findViewById(R.id.checkbox_telalogin);


        BotaoAjudaTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoCadastreseTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEsqueciaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity11.class);
                startActivity(it);
            }
        });

        CheckBox_Paciente.setOnClickListener(view -> {
            if (CheckBox_Paciente.isChecked()) {

                paciente = 1;
            } else {
                paciente = 0;
            }
        });

        BotaoEnviarTelaLogin.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);
            if (Edt_Usuario_Telalogin.getText().toString().isEmpty() || Edt_Senha_Telalogin.getText().toString().isEmpty()) {
                Toast.makeText(this, "Digite todos os campos", Toast.LENGTH_SHORT).show();
                } else {
            if (paciente == 1) {

            try {
            Usuario usuario = db.selecionarUsuario(Edt_Usuario_Telalogin.getText().toString());

            if (usuario.getSenha().equals(Edt_Senha_Telalogin.getText().toString())) {
                   Intent intent = new Intent(this, MainActivity9.class);
                   startActivity(intent);
                } else {

                  Toast.makeText(this, "Usuario não cadastrado", Toast.LENGTH_SHORT).show();
                    }
            } catch (Exception e) {
                  Toast.makeText(this, "Usuario não cadastrado", Toast.LENGTH_SHORT).show();

            }

                } else {


            try {

                  Profissionais profissionais = db.selecionarProfissionais(Edt_Usuario_Telalogin.getText().toString());

            if (profissionais.getSenhaProfissionais().equals(Edt_Senha_Telalogin.getText().toString())) {
                     Intent intent2 = new Intent(this, MainActivity9.class);
                     startActivity(intent2);
                } else {
                Toast.makeText(this, "Usuario não encontrado", Toast.LENGTH_SHORT).show();
            }
            } catch (Exception e) {
                 Toast.makeText(this, "Usuario não cadastradoo", Toast.LENGTH_SHORT).show();
           }
        }
    }

    });
    }}