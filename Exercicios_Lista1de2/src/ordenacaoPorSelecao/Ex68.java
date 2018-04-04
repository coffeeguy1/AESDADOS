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
	
	public static int busca_binaria(char iVet[], char iK)
	{
		int iBaixo, iAlto, iMeio;
		
		iBaixo = 0;
		iAlto=iVet.length-1;
		while(iBaixo <= iAlto)
		{
			iMeio=(iBaixo + iAlto)/2;
			
			if(iK < iVet[iMeio])
				{
					iAlto = iMeio-1;
				}
			else if(iK > iVet[iMeio]) {
				iBaixo = iMeio+1;
			}
			else return iMeio;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		char vetor[] = new char[10];
		
		for(int i=0; i < 10; i++) {
			vetor[i] = JOptionPane.showInputDialog("Digite o caractere do indice " + i).charAt(0); // charAt(0) retorna o primeiro caractere da String.
		}
		
		selecao(vetor);
		System.out.println(Arrays.toString(vetor));
		
		char iK = JOptionPane.showInputDialog("Digite o caractere que você deseja: ").charAt(0);
		System.out.println(busca_binaria(vetor, iK));
	}

}
