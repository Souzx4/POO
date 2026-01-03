/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimofismosobrecarga;

/**
 *
 * @author gilma
 */
public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au AU AU");
    }
    
    public void reagir(String frase){
         if("Toma comida".equals(frase) || "Ola".equals(frase) || "Cheguei".equals(frase)){
             System.out.println("Abanar e latir");
             this.emitirSom();
         } else {
             System.out.println("Rosnar");
         }
    }
    
    public void reagir(int hora, int min){
        if(hora < 12){
            System.out.println("Abanar o rabo");
        } else if(hora >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Abanar e latir");
            this.emitirSom();
        }
    }
    public void reagir(boolean dono){
        if(dono == true){
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar");
        }
    }
    public void reagir(int idade, float peso){
        if (idade < 5){
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    } 
}
