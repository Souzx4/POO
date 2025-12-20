/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstrataprincipal;

/**
 *
 * @author gilma
 */
public class AbstrataPrincipal {

    public static void main(String[] args) {
        System.out.println("--------------------");
        Visitante v1 = new Visitante();
        v1.setNome("Gilmar");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());
        
        System.out.println("---------------------");
        Aluno a1 = new Aluno();
        a1.setNome("Gil");
        a1.setMatricula(1001);
        a1.setCurso("Informatica");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.pagarMensa();
        System.out.println(a1.toString());
        
        System.out.println("---------------------");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1002);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.setIdade(17);
        b1.pagarMensa();
        System.out.println(b1.toString());
        
        System.out.println("---------------------");
        Professor p1 = new Professor();
        p1.setNome("Ivan");
        p1.setIdade(19);
        p1.setSexo("M");
        p1.setEspecialidade("Historia");
        p1.setSalario(2200);
        p1.receberAumento(200f);
        System.out.println(p1.toString());
        
        System.out.println("---------------------");
        Tecnico t1 = new Tecnico();
        t1.setNome("Diesson");
        t1.setIdade(19);
        t1.setRegistroProfissional("Historia");
        t1.setSexo("M");
        t1.praticar();
        System.out.println(t1.toString());
    }
}
