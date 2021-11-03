package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex5 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 * 
		 ***************************************************************************************************/

		int lanche, qt;
		double pagar, lanche1 = 4.00, lanche3 = 5.00, lanche4 = 2.00, lanche2 = 4.50, lanche5 = 2.50;

		lanche = Integer.parseInt(JOptionPane.showInputDialog(

				"  COD         LANCHE             PREÇO \n \n " + "   1  |  Cachorro-Quente  |  R$4,00 \n "
						+ "   2  |         X-Salada           |  R$4,50 \n"
						+ "    3  |          X-Bacon           |  R$5,00 \n"
						+ "    4  |          Torrada            |  R$2,00 \n"
						+ "    5  |       Refrigerante      |  R$2,50 " + "\n \n   Qual Lanche você gostaria ? "));

		qt = Integer.parseInt(JOptionPane.showInputDialog(" Qual quantidade? "));

		switch (lanche) {

		case 1:
			pagar = lanche1 * qt;
			JOptionPane.showMessageDialog(null, " VALOR A PAGAR: " + pagar);
			break;
		case 2:
			pagar = lanche2 * qt;
			JOptionPane.showMessageDialog(null, " VALOR A PAGAR: " + pagar);
			break;
		case 3:
			pagar = lanche3 * qt;
			JOptionPane.showMessageDialog(null, " VALOR A PAGAR: " + pagar);
			break;
		case 4:
			pagar = lanche4 * qt;
			JOptionPane.showMessageDialog(null, " VALOR A PAGAR: " + pagar);
			break;
		case 5:
			pagar = lanche5 * qt;
			JOptionPane.showMessageDialog(null, " VALOR A PAGAR: " + pagar);
			break;

		}

	}

}
