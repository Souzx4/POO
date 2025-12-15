/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetolivro;

/**
 *
 * @author Eletel_Monitor
 */
public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private String leitor;
    
    /*public void detalhes(){
        System.out.println("---Detalhes do Livro----");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de paginas: " + this.getTotPaginas());
    }*/

    public String detalhes() {
        return "Livro{" + "titulo=" + titulo + ", autor=" + 
                autor + ", totPaginas=" + totPaginas + ", pagAtual=" + 
                pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + '}';
    }
    
    

    public Livro(String titulo, String autor, int totPaginas, String leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }
    @Override
    public void fechar(){
        this.aberto = false;
    }

    @Override
    public void folhear() {
        
    }

    @Override
    public void avancarPag() {
        
    }
    @Override
    public void voltarPag(){
        
    }
}
