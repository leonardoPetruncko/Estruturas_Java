package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex3 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
		 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 * 
		 ***************************************************************************************************/

		int A, B;

		A = Integer.parseInt(JOptionPane .showInputDialog(null, " Escreva um numero inteiro A. "));
		B = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um numero inteiro B. "));

		if (A % B == 0 || B % A == 0) {
			JOptionPane.showMessageDialog(null, " s�o multiplos ");
		} else {
			JOptionPane.showMessageDialog(null, " n�o s�o multiplos ");
		}

	}

}
