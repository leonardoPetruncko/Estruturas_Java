package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex2 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
		 * �mpar.
		 * 
		 ***************************************************************************************************/

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um numero inteiro. "));

		if (n % 2 == 0) {
			JOptionPane.showMessageDialog(null, " Seu n�mero: " + n + " � par");
		} else {
			JOptionPane.showMessageDialog(null, " Seu n�mero: " + n + " � impar");
		}

	}

}
