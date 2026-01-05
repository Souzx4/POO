/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimofismosobrecarga;

/**
 *
 * @author gilma
 */
public class PolimofismoSobrecarga {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();
        
        c.reagir("Ola");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(19, 00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
