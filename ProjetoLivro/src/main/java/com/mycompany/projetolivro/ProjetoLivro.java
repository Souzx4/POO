/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetolivro;

/**
 *
 * @author Eletel_Monitor
 */
public class ProjetoLivro {

    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Gilmar", 20, "M");
        p[1] = new Pessoa("Geyciane", 20, "F");
        
        l[0] = new Livro("Matematica", "Junior", 300, p[0]);
        l[1] = new Livro("Portugues", "Vivian", 250, p[1]);
        l[2] = new Livro("Historia", "Socorro", 320, p[0]);
        
        l[0].abrir();
        l[0].folhear(300);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
