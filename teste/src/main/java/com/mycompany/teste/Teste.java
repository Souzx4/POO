/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

/**
 *
 * @author Eletel_Monitor
 */
public class Teste {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];
        
        p[0] = new Pessoa("Gilmar", 20, "M");
        p[1] = new Pessoa("Geyciane", 20, "F");
  
        l[0] = new Livro("Harry Potter", "S/N", 500, p[1]);
        l[1] = new Livro("007", "thompson", 320, p[0]);
        
        l[0].abrir();
        l[0].folhear(210);
        l[1].abrir();
        l[1].folhear(10);
        
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
}
