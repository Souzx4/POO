/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimofismoanimal;

/**
 *
 * @author gilma
 */
public class Reptil extends Animal {
    private String CorEscama;
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vejetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Reptil");
    }

    public String getCorEscama() {
        return CorEscama;
    }

    public void setCorEscama(String CorEscama) {
        this.CorEscama = CorEscama;
    }
    
    
}
