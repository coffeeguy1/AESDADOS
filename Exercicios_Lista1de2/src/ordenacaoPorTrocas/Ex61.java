package ordenacaoPorTrocas;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex61 {
	public static void bolha(double vet[])
    {
       for(int i=1; i<= vet.length-1; i++)
          for(int j=0; j<vet.length-1; j++)
             if(vet[j]<vet[j+1])
             {
                double aux = vet[j];
                vet[j] = vet[j+1];
                vet[j+1] = aux;
             }
    }
		
	public static void main(String[] args) {
		double vetor[] = new double[20];
		for(int i =0; i < 20; i++) {
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do indice " + i));
		}
		
		bolha(vetor);
		System.out.println(Arrays.toString(vetor));
	}

}
