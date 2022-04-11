package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.projeto_desacelera.database.BancoSQLite;
import com.example.projeto_desacelera.modelos.Usuario;

public class MainActivity7 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaCadastrese;
    ImageButton BotaoLivrosTelaCadastrese;
    ImageButton BotaoPlaylistsTelaCadastrese;
    ImageButton BotaoExerciciosTelaCadastrese;
    ImageButton BotaoEncontreTelaCadastrese;
    ImageButton BotaoVoltarTelaCadastrese;

    ImageButton BotaoCrieseuCadastroTelaCadastrese;
    EditText Edt_Usuario_TelaCadastrese;
    EditText Edt_Sobrenome_TelaCadastrese;
    EditText Edt_Email_TelaCadastrese;
    EditText Edt_Data_TelaCadastrese;
    EditText Edt_Telefone_TelaCadastrese;
    EditText Edt_Senha_TelaCadastrese;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        BotaoAjudaTelaCadastrese = findViewById(R.id.ibtn_ajuda_telacadastrese);
        BotaoLivrosTelaCadastrese = findViewById(R.id.ibtn_livros_telacadastrese);
        BotaoPlaylistsTelaCadastrese = findViewById(R.id.ibtn_playlists_telacadastrese);
        BotaoExerciciosTelaCadastrese = findViewById(R.id.ibtn_exercicios_telacadastrese);
        BotaoEncontreTelaCadastrese = findViewById(R.id.ibtn_encontre_telacadastrese);
        BotaoVoltarTelaCadastrese = findViewById(R.id.ibtn_voltar_telacadastrese);

        BotaoCrieseuCadastroTelaCadastrese = findViewById(R.id.ibtn_crieseucadastro_telacadastrese);
        Edt_Usuario_TelaCadastrese = findViewById(R.id.edt_usuario_telacadastrese);
        Edt_Sobrenome_TelaCadastrese = findViewById(R.id.edt_sobrenome_telacadastrese);
        Edt_Email_TelaCadastrese = findViewById(R.id.edt_email_telacadastrese);
        Edt_Data_TelaCadastrese = findViewById(R.id.edt_data_telacadastrese);
        Edt_Telefone_TelaCadastrese = findViewById(R.id.edt_telefone_telacadastrese);
        Edt_Senha_TelaCadastrese = findViewById(R.id.edt_senha_telacadastrese);


        BotaoAjudaTelaCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaCadastrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });
        BotaoCrieseuCadastroTelaCadastrese.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);

            if (db.inserirUsuario(new Usuario(
                    Edt_Usuario_TelaCadastrese.getText().toString(),
                    Edt_Sobrenome_TelaCadastrese.getText().toString(),
                    Edt_Email_TelaCadastrese.getText().toString(),
                    Edt_Data_TelaCadastrese.getText().toString(),
                    Edt_Telefone_TelaCadastrese.getText().toString(),
                    Edt_Senha_TelaCadastrese.getText().toString()))
            ) {

                Toast.makeText(this, "Usuario cadastrado com sucesso!", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "Não foi possível realizar o cadastro", Toast.LENGTH_LONG).show();
            }
        });


    }
}