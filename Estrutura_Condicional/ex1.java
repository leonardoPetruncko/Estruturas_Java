package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex1 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero �
		 * negativo ou n�o
		 * 
		 ***************************************************************************************************/

		int n;

		n = Integer.parseInt(JOptionPane.showInputDialog(null, " Escreva um numero inteiro. "));

		if (n > 0) {
			JOptionPane.showMessageDialog(null, " Seu n�mero: " + n + " � positivo");
		} else {
			JOptionPane.showMessageDialog(null, " Seu n�mero: " + n + " � negativo");
		}

	}

}
