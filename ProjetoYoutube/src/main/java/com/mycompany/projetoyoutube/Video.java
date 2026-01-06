/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoyoutube;

/**
 *
 * @author Eletel_Atendimento
 */
public class Video implements AcoesVideos {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzidas;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzidas = false;
    }    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (int)((this.avaliacao + avaliacao)/this.views);
        this.avaliacao = nova;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzidas() {
        return reproduzidas;
    }

    public void setReproduzidas(boolean reproduzidas) {
        this.reproduzidas = reproduzidas;
    }
    
    
    
    @Override
    public void play() {
        this.reproduzidas = true;
    }

    @Override
    public void pause() {
        this.reproduzidas = false;
    }

    @Override
    public void like() {
        this.curtidas ++;
    }

    @Override
    public String toString() {
        return "Video{" + "titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas + ", reproduzidas=" + reproduzidas + '}';
    }
    
    
    
}
