/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcular2numeros;

/**
 *
 * @author Gomes
 */

    import javax.swing.JOptionPane;
public class Calcular2numeros {

    public static void main(String[] args) {
       try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

            String[] opcoes = {"Soma", "Subtração", "Multiplicação", "Divisão"};
            int escolha = JOptionPane.showOptionDialog(null, "Selecione a operação:", "Calculadora",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            double resultado = 0;
            String operacao = "";

            switch (escolha) {
                case 0: resultado = num1 + num2; operacao = "Soma"; break;
                case 1: resultado = num1 - num2; operacao = "Subtração"; break;
                case 2: resultado = num1 * num2; operacao = "Multiplicação"; break;
                case 3:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        operacao = "Divisão";
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro! Divisão por zero.", "Erro", JOptionPane.ERROR_MESSAGE);
                        return; // Encerra a execução em caso de erro
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return; // Encerra a execução em caso de erro
            }

            JOptionPane.showMessageDialog(null, "O resultado da " + operacao + " é: " + resultado);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! Digite números.", "Erro", JOptionPane.ERROR_MESSAGE);
        }  
    }
}
