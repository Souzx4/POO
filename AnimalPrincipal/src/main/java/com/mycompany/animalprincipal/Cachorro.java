/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animalprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class Cachorro extends Animal {
    public Cachorro(String nome, int id) {
        super.setNome(nome);
        super.setIdade(id);
    }
    
    @Override
    public void seLocomove() {
        System.out.println("Cachorro: " + getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Cachorro correndo, com as 4 patas");
    }
     

    @Override
    public void emitesom() {
        System.out.println("Au Au !");
    }   
}
