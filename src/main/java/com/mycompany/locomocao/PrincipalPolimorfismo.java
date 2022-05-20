/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locomocao;

/**
 *
 * @author univicosa
 */
public class PrincipalPolimorfismo {
    public static void main(String[] args) {
        Transporte t = new Transporte();
        Veiculo v = new Veiculo();
        Carro c = new Carro();
         
        System.out.println("Passando o transporte!");
        moverTransporte(t);
        
        System.out.println("Passando o veiculo!");
        moverTransporte(v);
        
        System.out.println("Passando o carro!!");
        moverTransporte(c);
        
    }
    
    static void moverTransporte(Transporte trans){
        System.out.println(trans.mover());
    }
}
