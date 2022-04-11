package com.example.projeto_desacelera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.projeto_desacelera.database.BancoSQLite;
import com.example.projeto_desacelera.modelos.Profissionais;
import com.example.projeto_desacelera.modelos.Usuario;

public class MainActivity8 extends AppCompatActivity {

    ImageButton BotaoAjudaTelaCadProfissionais;
    ImageButton BotaoLivrosTelaCadProfissionais;
    ImageButton BotaoPlaylistsTelaCadProfissionais;
    ImageButton BotaoExerciciosTelaCadProfissionais;
    ImageButton BotaoEncontreTelaCadProfissionais;
    ImageButton BotaoCadastreseTelaCadProfissionais;
    ImageButton BotaoVoltarTelaCadProfissionais;

    ImageButton BotaoCrieseuCadastroTelaCadProfissionais;
    EditText Edt_Usuario_TelaCadProfissionais;
    EditText Edt_Sobrenome_TelaCadProfissionais;
    EditText Edt_Email_TelaCadProfissionais;
    EditText Edt_Data_TelaCadProfissionais;
    EditText Edt_Registro_TelaCadProfissionais;
    EditText Edt_Telefone_TelaCadProfissionais;
    EditText Edt_Senha_TelaCadProfissionais;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        BotaoAjudaTelaCadProfissionais = findViewById(R.id.ibtn_ajuda_telacadastroprofissionais);
        BotaoLivrosTelaCadProfissionais = findViewById(R.id.ibtn_livros_telacadastroprofissionais);
        BotaoPlaylistsTelaCadProfissionais = findViewById(R.id.ibtn_playlists_telacadastroprofissionais);
        BotaoExerciciosTelaCadProfissionais = findViewById(R.id.ibtn_exercicios_telacadastroprofissionais);
        BotaoEncontreTelaCadProfissionais = findViewById(R.id.ibtn_encontre_telacadastroprofissionais);
        BotaoCadastreseTelaCadProfissionais = findViewById(R.id.ibtn_cadastrese_telacadastroprofissionais);
        BotaoVoltarTelaCadProfissionais = findViewById(R.id.ibtn_voltar_telacadastroprofissionais);

        BotaoCrieseuCadastroTelaCadProfissionais = findViewById(R.id.ibtn_crieseucadastro_telacadastroprofissionais);
        Edt_Usuario_TelaCadProfissionais = findViewById(R.id.edt_usuario_telacadastroprofissionais);
        Edt_Sobrenome_TelaCadProfissionais = findViewById(R.id.edt_sobrenome_telacadastroprofissionais);
        Edt_Email_TelaCadProfissionais = findViewById(R.id.edt_email_telacadastroprofissionais);
        Edt_Data_TelaCadProfissionais = findViewById(R.id.edt_data_telacadastroprofissionais);
        Edt_Registro_TelaCadProfissionais = findViewById(R.id.edt_registro_telacadastroprofissionais);
        Edt_Telefone_TelaCadProfissionais = findViewById(R.id.edt_telefone_telacadastroprofissionais);
        Edt_Senha_TelaCadProfissionais = findViewById(R.id.edt_senha_telacadastroprofissionais);


        BotaoAjudaTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(it);
            }
        });

        BotaoLivrosTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(it);
            }
        });

        BotaoPlaylistsTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(it);
            }
        });

        BotaoExerciciosTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity5.class);
                startActivity(it);
            }
        });

        BotaoEncontreTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                startActivity(it);
            }
        });
        BotaoCadastreseTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoVoltarTelaCadProfissionais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(getApplicationContext(), MainActivity12.class);
                startActivity(it);
            }
        });

        BotaoCrieseuCadastroTelaCadProfissionais.setOnClickListener(view -> {
            BancoSQLite db = new BancoSQLite(this);

            if (db.inserirProfissionais( new Profissionais(
                    Edt_Usuario_TelaCadProfissionais.getText().toString(),
                    Edt_Sobrenome_TelaCadProfissionais.getText().toString(),
                    Edt_Email_TelaCadProfissionais.getText().toString(),
                    Edt_Data_TelaCadProfissionais.getText().toString(),
                    Edt_Registro_TelaCadProfissionais.getText().toString(),
                    Edt_Telefone_TelaCadProfissionais.getText().toString(),
                    Edt_Senha_TelaCadProfissionais.getText().toString()))
            ) {

                Toast.makeText(this, "Usuario cadastrado com sucesso!", Toast.LENGTH_LONG).show();

            } else {
                Toast.makeText(this, "Não foi possível realizar o cadastro", Toast.LENGTH_LONG).show();
            }
        });


    }
}