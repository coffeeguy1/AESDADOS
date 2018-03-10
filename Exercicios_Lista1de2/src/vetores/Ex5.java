package vetores;

import javax.swing.JOptionPane;

public class Ex5 {

	public static void main(String[] args) {
		int vetor[] = new int[16];
		
		for(int i = 0; i < 16; i++) // colocando das informações no vetor
		{
			String x = JOptionPane.showInputDialog("Digite o valor da posição: ");
			vetor[i] = Integer.valueOf(x);
			System.out.println(vetor[i]);
		}
		
		for(int i = 0; i < 16; i++)
		{
			if(vetor[i] == (vetor[i + 3]) && vetor[i + 1] == vetor[i + 2])
			{
				System.out.println(vetor[i] + " " + vetor[i + 3] + " " + vetor[i + 1] + " " + vetor[i + 2]);
				System.out.println("\n");
				
			}
			
			/*
			 * índices: 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
			 * elementos: 0 1 1 0 3 2 4 4 2 2 4 7 7 7 7 7; 
			 *  0110
			 *  2442
			 *  4224
			 *  7777
			 *  7777
			 * 
			 * 
			 * */
		}
	}

}
