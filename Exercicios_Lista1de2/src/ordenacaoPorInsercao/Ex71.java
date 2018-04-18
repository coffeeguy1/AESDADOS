package ordenacaoPorInsercao;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex71 {
	public static void insercao(double vet[])
    {
       for(int i=1; i<vet.length; i++)
       {
          double aux = vet[i];
          int j = i-1;        
          while(j>=0 && vet[j] < aux)
          {
             vet[j+1] = vet[j];
             j--;
          }
          vet[j+1] = aux;
       }
    }
	
	public static void main(String[] args) {
		double vetor[] = new double[20];
		
		for(int i=0; i < 20; i++)
		{
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do indice " + i));
		}
		
		insercao(vetor);
		System.out.println(Arrays.toString(vetor));
	}

}