/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimofismosobrecarga;

/**
 *
 * @author gilma
 */
public class Mamifero extends Animal {
    protected String corPele;
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero");
    }

    public String getCorPele() {
        return corPele;
    }

    public void setCorPele(String corPele) {
        this.corPele = corPele;
    }
    
}
