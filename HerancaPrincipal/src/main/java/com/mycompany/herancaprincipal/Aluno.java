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
    
    public void cancelarMatr(){
        System.out.println("Matricula cancelada");
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
