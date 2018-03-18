package buscaLinear;

import javax.swing.JOptionPane;

public class Ex32 {
	public static void colocandoOsDados(int[] vetor, int busca)
	{
		for(int i = 0; i < vetor.length; i++)
		{
			//System.out.println(vetor[i]);
			if(busca == vetor[i])
			{
				JOptionPane.showMessageDialog(null, "O indice encontrado é: " + vetor[i]);
				break;
			}
			else{
				JOptionPane.showMessageDialog(null, i);
			}
		}
	}
	
	public static void main(String[] args) {
		int vetor[] = new int[15];
		for(int i = 0; i < vetor.length; i++)
		{
			vetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor da posição: " + i));
		}
		
		//colocandoOsDados(vetor, 0);
		int busca = Integer.valueOf(JOptionPane.showInputDialog("Digite o que quer procurar"));
		
		colocandoOsDados(vetor, busca);
		
		
	}

}
