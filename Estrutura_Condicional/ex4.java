package Estrutura_Condicional;

import javax.swing.JOptionPane;

public class ex4 {

	public static void main(String[] args) {

		/*************************************************************************************************
		 * 
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do
		 * jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo
		 * uma dura��o m�nima de 1 hora e m�xima de 24 horas
		 * 
		 ***************************************************************************************************/

		int horaInicial = Integer.parseInt(JOptionPane.showInputDialog("Qual a hora inicial"));
		int horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Qual a hora Final?"));
		int duracao;

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}
		JOptionPane.showMessageDialog(null, " O JOGO DUROU: " + duracao);

	}

}
