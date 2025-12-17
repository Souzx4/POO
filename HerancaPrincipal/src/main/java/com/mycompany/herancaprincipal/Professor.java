/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herancaprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class Professor extends Pessoa {
    
    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }
    
    private String especialidade;
    private float salario;
    
    public void receberAum(){
        if (this.salario > 0){
            this.salario++;
            System.out.println("seu salario aumentou para " + this.salario + "R$");
        } else {
            System.out.println("Seu salario não teve aumento");
        }
    }

    public Professor(String especialidade, float salario, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
