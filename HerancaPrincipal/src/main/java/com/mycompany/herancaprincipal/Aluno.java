/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class Aluno extends Pessoa {
    private String matr;
    private String curso;
    

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    public void cancelarMatr(String Pessoa){
        if (this.matr.equals("Ativa")){
            this.matr = ("Cancelar");
            System.out.println("Matricula de " + this.getNome() + " foi cancelada");
        } else {
            System.out.println("A matricula está ativa");
        }
    }

    public Aluno(String matr, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
        
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    
    
}
