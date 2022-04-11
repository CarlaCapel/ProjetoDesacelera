package com.example.projeto_desacelera.modelos;

public class Usuario implements Cloneable {

    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private String datanascimento;
    private String telefone;
    private String senha;


        public Usuario() {}

    public Usuario(String nome, String sobrenome, String email, String datanascimento, String telefone, String senha) {

        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.datanascimento = datanascimento;
        this.telefone = telefone;
        this.senha = senha;
    }

    public Usuario(int id, String nome, String sobrenome, String email, String datanascimento, String telefone, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.datanascimento = datanascimento;
        this.telefone = telefone;
        this.senha = senha;

    }

    public Usuario(Usuario u) {
        this.id = u.id;
        this.nome = u.nome;
        this.sobrenome = u.sobrenome;
        this.email = u.email;
        this.datanascimento = u.datanascimento;
        this.telefone = u.telefone;
        this.senha = u.senha;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() { return this.nome; }

    public void setNome(String n) { this.nome = n; }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String s) {
        this.sobrenome = s;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getDatanascimento() {
        return this.datanascimento;
    }

    public void setDatanascimento(String d) {
        this.datanascimento = d;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String t) {
        this.telefone = t;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String p) {
        this.senha = p;
    }


    @Override
    public Object clone() {
        Usuario clone = new Usuario(this);

        return clone;


    }

}


