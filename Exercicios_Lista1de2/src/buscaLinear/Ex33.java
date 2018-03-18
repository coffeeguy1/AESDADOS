package buscaLinear;

import javax.swing.JOptionPane;

public class Ex33 {
		public static void colocandoOsDados(char[] vetor, char busca)
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
			char vetor[] = new char[15];
			for(int i = 0; i < vetor.length; i++)
			{
				vetor[i] = JOptionPane.showInputDialog("Digite o valor da posição: " + i).charAt(0);
				
			}
			
			//colocandoOsDados(vetor, 0);
			char busca = JOptionPane.showInputDialog("Digite o que quer procurar").charAt(0);
			
			colocandoOsDados(vetor, busca);
			
			
		}
}

