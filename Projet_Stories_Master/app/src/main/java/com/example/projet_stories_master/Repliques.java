package com.example.projet_stories_master;

public class Repliques {
    private int id_rep;
    private String text_rep;
    private int status_rep;
    private int chap_rep;

    public Repliques(int id,String text, int stat, int chap){
        id_rep = id;
        text_rep = text;
        status_rep = stat;
        chap_rep = chap;
    }

    public int getId_rep() {
        return id_rep;
    }

    public void setId_rep(int id_rep) {
        this.id_rep = id_rep;
    }

    public String getText_rep() {
        return text_rep;
    }

    public void setText_rep(String text_rep) {
        this.text_rep = text_rep;
    }

    public int getStatus_rep() {
        return status_rep;
    }

    public void setStatus_rep(int status_rep) {
        this.status_rep = status_rep;
    }

    public int getChap_rep() {
        return chap_rep;
    }

    public void setChap_rep(int chap_rep) {
        this.chap_rep = chap_rep;
    }
}
