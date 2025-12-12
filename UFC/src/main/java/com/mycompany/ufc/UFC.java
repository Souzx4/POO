/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ufc;

/**
 *
 * @author Eletel_Monitor
 */
public class UFC {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
                
        l[0] = new Lutador(" Lionel Messi", "Argentina", 38, 1.7f, 67f, 766, 153, 218);
        l[1] = new Lutador(" Cristiano Ronaldo", "Portugal", 40, 1.97f, 83f, 800, 201, 240);
        l[2] = new Lutador(" Yuri Alberto", "Brasil", 24, 1.83f, 78f, 186, 97, 95);
        l[3] = new Lutador(" Arrascaeta", "Uruguai",31, 1.74f, 68f, 403, 115, 142);
        l[4] = new Lutador(" Mbappe", "França",26, 1.85f, 75f, 390, 70, 90);
        l[5] = new Lutador(" Neymar", "Brasil",33, 1.75f, 68f, 480, 120, 100);
        
        l[0].apresentar();
        l[0].status();
        
        l[1].apresentar();
        l[1].status();
        
        l[2].apresentar();
        l[2].status();
        
        l[3].apresentar();
        l[3].status();
        
        l[4].apresentar();
        l[4].status();
        
        l[5].apresentar();
        l[5].status();
    }
}