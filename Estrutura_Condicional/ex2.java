package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fazer um programa para ler um número inteiro e dizer se este número é par ou
		 * ímpar.
		 * 
		 ***************************************************************************************************/

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um numero inteiro. "));

		if (n % 2 == 0) {
			JOptionPane.showMessageDialog(null, " Seu número: " + n + " É par");
		} else {
			JOptionPane.showMessageDialog(null, " Seu número: " + n + " É impar");
		}

	}

}
