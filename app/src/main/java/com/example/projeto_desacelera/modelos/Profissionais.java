package com.example.projeto_desacelera.modelos;

public class Profissionais implements Cloneable {

    private int id;

    private String nomeprofissionais;
    private String sobrenomeprofissionais;
    private String emailprofissionais;
    private String datanascimentoprofissionais;
    private String registroprofissionais;
    private String telefoneprofissionais;
    private String senhaprofissionais;

    public Profissionais(){}

    public Profissionais(String nomeprofissionais, String sobrenomeprofissionais, String emailprofissionais, String datanascimentoprofissionais, String registroprofissionais, String telefoneprofissionais, String senhaprofissionais) {

        this.nomeprofissionais = nomeprofissionais;
        this.sobrenomeprofissionais = sobrenomeprofissionais;
        this.emailprofissionais = emailprofissionais;
        this.datanascimentoprofissionais = datanascimentoprofissionais;
        this.registroprofissionais = registroprofissionais;
        this.telefoneprofissionais = telefoneprofissionais;
        this.senhaprofissionais = senhaprofissionais;
    }

    public Profissionais(int id,String nomeprofissionais, String sobrenomeprofissionais, String emailprofissionais, String datanascimentoprofissionais, String registroprofissionais, String telefoneprofissionais, String senhaprofissionais) {
        this.id = id;
        this.nomeprofissionais = nomeprofissionais;
        this.sobrenomeprofissionais = sobrenomeprofissionais;
        this.emailprofissionais = emailprofissionais;
        this.datanascimentoprofissionais = datanascimentoprofissionais;
        this.registroprofissionais = registroprofissionais;
        this.telefoneprofissionais = telefoneprofissionais;
        this.senhaprofissionais = senhaprofissionais;

    }

    public Profissionais(Profissionais p) {
        this.id = p.id;

        this.nomeprofissionais = p.nomeprofissionais;
        this.sobrenomeprofissionais = p.sobrenomeprofissionais;
        this.emailprofissionais = p.emailprofissionais;
        this.datanascimentoprofissionais = p.datanascimentoprofissionais;
        this.registroprofissionais = p.registroprofissionais;
        this.telefoneprofissionais = p.telefoneprofissionais;
        this.senhaprofissionais = p.senhaprofissionais;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProfissionais() {
        return this.nomeprofissionais;
    }

    public void setNomeProfissionais(String n) {
        this.nomeprofissionais = n;
    }

    public String getSobrenomeProfissionais() {
        return this.sobrenomeprofissionais;
    }

    public void setSobrenomeProfissionais(String s) {
        this.sobrenomeprofissionais = s;
    }

    public String getEmailProfissionais() {
        return this.emailprofissionais;
    }

    public void setEmailProfissionais(String e) {
        this.emailprofissionais = e;
    }

    public String getDatanascimentoProfissionais() {
        return this.datanascimentoprofissionais;
    }

    public void setDatanascimentoProfissionais(String d) {
        this.datanascimentoprofissionais = d;
    }

    public String getRegistroProfissionais() {
        return this.registroprofissionais;
    }

    public void setRegistroProfissionais(String r) {
        this.datanascimentoprofissionais = r;
    }

    public String getTelefoneProfissionais() {
        return this.telefoneprofissionais;
    }

    public void setTelefoneProfissionais(String t) {
        this.telefoneprofissionais = t;
    }

    public String getSenhaProfissionais() {
        return this.senhaprofissionais;
    }

    public void setSenhaProfissionais(String p) {
        this.senhaprofissionais = p;
    }

    @Override
    public Object clone() {
        Profissionais clone = new Profissionais(this);

        return clone;


    }


}
