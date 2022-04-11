package com.example.projeto_desacelera.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.projeto_desacelera.modelos.Profissionais;
import com.example.projeto_desacelera.modelos.Usuario;

public class BancoSQLite extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "Dados_Usuario.db";
    private static final String ID = "id";
    private static final String NOME_USUARIO = "nome";
    private static final String SOBRENOME_USUARIO = "sobrenome";
    private static final String EMAIL_USUARIO = "email";
    private static final String DATA_NASCIMENTO_USUARIO = "datanascimento";
    private static final String TELEFONE_USUARIO = "telefone";
    private static final String SENHA_USUARIO = "senha";


    private static final String ID_PROFISSIONAIS = "id";
    private static final String NOME_PROFISSIONAIS = "nomeprofissionais";
    private static final String SOBRENOME_PROFISSIONAIS = "sobrenomeprofissionais";
    private static final String EMAIL_PROFISSIONAIS = "emailprofissionais";
    private static final String DATA_NASCIMENTO_PROFISSIONAIS = "datanascimentoprofissionais";
    private static final String REGISTRO_PROFISSIONAIS = "registroprofissionais";
    private static final String TELEFONE_PROFISSIONAIS = "telefoneprofissionais";
    private static final String SENHA_PROFISSIONAIS = "senhaprofissionais";


    private static final String TABELA = "usuarios";
    private static final int VERSAO = 1;

    private static final String TABELA_PROFISSIONAIS = "profissionais";


    public BancoSQLite(Context context) {
        super(context, NOME_BANCO, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //CREATE TABLE USUARIOS ( id INTEGER PRIMARY KEY AUTOINCREMENT, login TEXT, senha TEXT)

        String CREATE_USUARIOS_TABLE = "CREATE TABLE " + TABELA + " ( " +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NOME_USUARIO + " TEXT," +
                SOBRENOME_USUARIO + " TEXT," +
                EMAIL_USUARIO + " TEXT," +
                TELEFONE_USUARIO + " VARCHAR," +
                DATA_NASCIMENTO_USUARIO + " VARCHAR," +
                SENHA_USUARIO + " VARCHAR )";

        db.execSQL(CREATE_USUARIOS_TABLE);

        //CREATE TABLE PROFISSIONAIS

        String CREATE_PROFISSIONAIS_TABLE = "CREATE TABLE " + TABELA_PROFISSIONAIS + " ( " +
                ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                NOME_PROFISSIONAIS + " TEXT," +
                SOBRENOME_PROFISSIONAIS + " TEXT," +
                EMAIL_PROFISSIONAIS + " TEXT," +
                TELEFONE_PROFISSIONAIS + " VARCHAR," +
                DATA_NASCIMENTO_PROFISSIONAIS + " VARCHAR," +
                REGISTRO_PROFISSIONAIS + " VARCHAR," +
                SENHA_PROFISSIONAIS + " VARCHAR )";

        db.execSQL(CREATE_PROFISSIONAIS_TABLE);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        db.execSQL("DROP TABLE IF EXISTS " + TABELA_PROFISSIONAIS);
        onCreate(db);

    }


    public boolean inserirUsuario(Usuario u) {
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOME_USUARIO, u.getNome());
        values.put(SOBRENOME_USUARIO, u.getSobrenome());
        values.put(EMAIL_USUARIO, u.getEmail());
        values.put(TELEFONE_USUARIO, u.getTelefone());
        values.put(DATA_NASCIMENTO_USUARIO, u.getDatanascimento());
        values.put(SENHA_USUARIO, u.getSenha());

        result = db.insert(TABELA, null, values);
        db.close();

        if (result == -1)
            return false;

        else
            return true;
    }

    public boolean inserirProfissionais(Profissionais p) {
        long result;
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOME_PROFISSIONAIS, p.getNomeProfissionais());
        values.put(SOBRENOME_PROFISSIONAIS, p.getSobrenomeProfissionais());
        values.put(EMAIL_PROFISSIONAIS, p.getEmailProfissionais());
        values.put(TELEFONE_PROFISSIONAIS, p.getTelefoneProfissionais());
        values.put(DATA_NASCIMENTO_PROFISSIONAIS, p.getDatanascimentoProfissionais());
        values.put(REGISTRO_PROFISSIONAIS, p.getRegistroProfissionais());
        values.put(SENHA_PROFISSIONAIS, p.getSenhaProfissionais());

        result = db.insert(TABELA_PROFISSIONAIS, null, values);
        db.close();

        if (result == -1)
            return false;

        else
            return true;
    }



    public Usuario selecionarUsuario(String login) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ID, NOME_USUARIO, SOBRENOME_USUARIO, EMAIL_USUARIO, DATA_NASCIMENTO_USUARIO, TELEFONE_USUARIO, SENHA_USUARIO},
                EMAIL_USUARIO + " = ?",
                new String[]{String.valueOf(login)}, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();

            Usuario user = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6));

            return (Usuario) user.clone();
        } else
            return null;
    }

    public Profissionais selecionarProfissionais(String login) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA_PROFISSIONAIS,
                new String[]{ID, NOME_PROFISSIONAIS, SOBRENOME_PROFISSIONAIS, EMAIL_PROFISSIONAIS, DATA_NASCIMENTO_PROFISSIONAIS, REGISTRO_PROFISSIONAIS, TELEFONE_PROFISSIONAIS, SENHA_PROFISSIONAIS},
                EMAIL_PROFISSIONAIS + " = ?",
                new String[]{String.valueOf(login)}, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();
            Profissionais user = new Profissionais(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7));

            return (Profissionais) user.clone();
        } else
            return null;
    }

    public Usuario selecionarusuarioporID(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA,
                new String[]{ID, NOME_USUARIO, SOBRENOME_USUARIO, EMAIL_USUARIO, DATA_NASCIMENTO_USUARIO, TELEFONE_USUARIO, SENHA_USUARIO},
                ID + " = ?",
                new String[]{String.valueOf(id)}, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();

            Usuario user = new Usuario(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6));

            return (Usuario) user.clone();

        } else
            return null;

    }

    public Profissionais selecionarprofissionaisporID(String id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(
                TABELA_PROFISSIONAIS,
                new String[]{ID, NOME_PROFISSIONAIS, SOBRENOME_PROFISSIONAIS, EMAIL_PROFISSIONAIS, DATA_NASCIMENTO_PROFISSIONAIS, REGISTRO_PROFISSIONAIS, TELEFONE_PROFISSIONAIS, SENHA_PROFISSIONAIS},
                ID + " = ?",
                new String[]{String.valueOf(id)}, null, null, null, null);

        if (cursor != null) {
            cursor.moveToFirst();

            Profissionais user = new Profissionais(
                    Integer.parseInt(cursor.getString(0)),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4),
                    cursor.getString(5),
                    cursor.getString(6),
                    cursor.getString(7));

            return (Profissionais) user.clone();

        } else
            return null;

    }

}


