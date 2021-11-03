package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 * 
		 ***************************************************************************************************/

		int A, B;

		A = Integer.parseInt(JOptionPane .showInputDialog(null, " Escreva um numero inteiro A. "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um numero inteiro B. "));

		if (A % B == 0 || B % A == 0) {
			JOptionPane.showMessageDialog(null, " são multiplos ");
		} else {
			JOptionPane.showMessageDialog(null, " não são multiplos ");
		}

	}

}
