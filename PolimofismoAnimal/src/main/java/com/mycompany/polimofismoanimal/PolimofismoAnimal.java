/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimofismoanimal;

/**
 *
 * @author gilma
 */
public class PolimofismoAnimal {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Canguru ru = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        PeixeAmarelo pe = new PeixeAmarelo();
        Arara ra = new Arara();
        
        System.out.println("Canguru:");
        ru.alimentar();
        ru.locomover();
        ru.emitirSom();
        System.out.println("------------");
        
        System.out.println("Cachorro:");
        ca.locomover();
        ca.alimentar();
        ca.emitirSom();
        System.out.println("------------");
        
        System.out.println("Cobra:");
        co.locomover();
        co.alimentar();
        co.emitirSom();
        System.out.println("------------");
        
        System.out.println("Tartaruga:");
        ta.locomover();
        ta.alimentar();
        ta.emitirSom();
        System.out.println("-------------");
        
        System.out.println("PeixeAmarelo:");
        pe.locomover();
        pe.alimentar();
        pe.emitirSom();
        System.out.println("-------------");
        
        System.out.println("Arara:");
        ra.alimentar();
        ra.locomover();
        ra.emitirSom();
    }
}
