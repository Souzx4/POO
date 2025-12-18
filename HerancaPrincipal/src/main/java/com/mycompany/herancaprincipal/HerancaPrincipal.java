/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herancaprincipal;

/**
 *
 * @author Eletel_Monitor
 */
public class HerancaPrincipal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(18);
        p2.setIdade(20);
        p3.setIdade(30);
        p4.setIdade(22);
        
        p2.setCurso("Infomatica");
        p3.setSalario(1512f);
        p4.setSetor("Estoque");
        
        p2.cancelarMatr();
        p3.receberAum(200.20f);
        p4.mudarTrabalho();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome("Fabiana");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
