package ordenacaoPorSelecao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex68 {
	public static void selecao(char vet[])
    {
       for(int i=0; i<vet.length-1; i++)
       {
          int indMenor = i;
          for(int j=i+1; j<vet.length; j++)
          {
             if(vet[j] < vet[indMenor])
                indMenor = j;
          }
          char aux = vet[i];
          vet[i] = vet[indMenor];
          vet[indMenor] = aux;
       }
    }
	
	public static void main(String[] args) {
		char vetor[] = new char[10];
		
		for(int i=0; i < 10; i++) {
			vetor[i] = JOptionPane.showInputDialog("Digite o caractere do indice " + i).charAt(0); // charAt(0) retorna o primeiro caractere da String.
		}
		
		selecao(vetor);
		System.out.println(Arrays.toString(vetor));
		
	}

}
