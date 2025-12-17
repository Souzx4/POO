/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class Funcionario extends Pessoa {
    
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        if (this.setor.equals(this.setor)){
            System.out.println("você mudou de setor");
        } else {
            System.out.println("continua no mesmo setor");
        }
    }

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
