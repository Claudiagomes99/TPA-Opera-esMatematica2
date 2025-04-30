/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacoesmatematica;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class OperacoesMatematica {
//*primeira tentativa de calculos
    public static void main(String[] args) {
        //escolha dos números
        double num1 = 10.5;
        double num2 = 5.2;
        
        //Soma
        double soma = num1 + num2; // Número escolhidos
        double subtracao = num1 - num2;
        double media = (num1 + num2) / 2;
        double divisao = num2 != 0 ? num1 / num2: Double.NaN;
        double multiplicacao = num1 * num2;
                
        System.out.println("Soma:" + soma);
        System.out.println("Subtração:" + subtracao);
        System.out.println("Média:" + media);
        System.out.println("Divisão:" + divisao);
        System.out.println("Multiplicação:" + multiplicacao);
        
        
    }
}
