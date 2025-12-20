/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstrataprincipal;

/**
 *
 * @author gilma
 */
public class Bolsista extends Aluno {
    private float bolsa;
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    
    @Override
    public void pagarMensa(){
        System.out.println(this.nome + " e bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
