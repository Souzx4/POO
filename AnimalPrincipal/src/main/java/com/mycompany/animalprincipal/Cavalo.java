/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animalprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class Cavalo extends Animal {
    public Cavalo(String nome, int id ) {
        super.setNome(nome);
        super.setIdade(id);
    }
    @Override
    public void seLocomove() {
        System.out.println("Cavalo: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Calvalgar");
    }
    
    @Override
    public void emitesom() {
        System.out.println("Nhinnnnnn ri ri rin !");
    }
    
}
