package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fazer um programa para ler um número inteiro, e depois dizer se este número é
		 * negativo ou não
		 * 
		 ***************************************************************************************************/

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um numero inteiro. "));

		if (n > 0) {
			JOptionPane.showMessageDialog(null, " Seu número: " + n + " É positivo");
		} else {
			JOptionPane.showMessageDialog(null, " Seu número: " + n + " É negativo");
		}

	}

}
