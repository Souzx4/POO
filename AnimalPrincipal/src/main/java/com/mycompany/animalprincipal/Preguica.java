/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animalprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class Preguica extends Animal{
    public Preguica(String nome, int id) {
        super.setNome(nome);
        super.setIdade(id);
    }
    @Override
    public void seLocomove(){
        System.out.println("preguiça: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Subindo na Arvore");
    }
    @Override
    public void emitesom() {
        System.out.println("Grrrrrr");
    }
    
}
