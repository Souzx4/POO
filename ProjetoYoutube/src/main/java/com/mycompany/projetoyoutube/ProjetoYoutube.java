/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoyoutube;

/**
 *
 * @author Eletel_Atendimento
 */
public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        
        Gafalhoto g[] = new Gafalhoto[2];
        g[0] = new Gafalhoto("Gilmar", 22, "M", "gil");
        g[1] = new Gafalhoto("Gustavo", 30, "M", "juba");
        
        Visualicao vis[] = new Visualicao[2];
        vis[0] = new Visualicao(g[0], v[0]); //gilmar assite aula 1
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualicao(g[0], v[1]); //gilmar assiste aula 2
        vis[0].avaliar(87.0f);
        System.out.println(vis[0].toString()); 
        
        /*
        System.out.println("VIDEOS\n------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        
        System.out.println("GAFANHOTOS\n----------------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        */
    }
}
