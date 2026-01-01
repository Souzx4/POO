/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimofismoanimal;

/**
 *
 * @author gilma
 */
public class PeixeAmarelo extends Peixe {
    private String soltaBolha;
    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    @Override
    public void alimentar(){
        System.out.println("Algas");
    }

    public String getSoltaBolha() {
        return soltaBolha;
    }

    public void setSoltaBolha(String soltaBolha) {
        this.soltaBolha = soltaBolha;
    }
    
}
