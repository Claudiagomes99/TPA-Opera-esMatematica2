/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.operacoesmatematica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class AreasDeFormas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Quadrado
        double numero = 8;
        double areaquadrado = numero * numero;
        
        // Triangulo
        double base = 10;
        double altura = 7;
        double areatriangulo = (base * altura) / 2;
        
        //Retângulo
        double B = 19; // Base
        double A = 5; //Altura
        double arearetangulo = B * A;
      
        // Circunferência
        double raio = 9; 
        double circunferencia = 2 * Math.PI * raio;
       
        // Losango 
        double diagonalmaior = 10;
        double diagonalmenor = 7;
        double areadolosango = (diagonalmaior * diagonalmenor) / 2;
        
        System.out.println("O quadrado de " + numero + " é: " + areaquadrado);
        System.out.println("Área Do triângulo:" + areatriangulo);
        System.out.println("Área Da Circunferência:" + circunferencia);
        System.out.println("Área Do Losango:" + areadolosango);
        System.out.println("Área do Retângulo;" + arearetangulo);
                
    }
    
}
