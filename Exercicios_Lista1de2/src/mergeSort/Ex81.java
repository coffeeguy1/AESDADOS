package mergeSort;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex81 {
	public static void mergeSort(double v[])
	{
		if(v.length > 1)
		{
			int t1 = v.length/2;
			int t2 = v.length-t1;
			double v1[] = new double[t1];
			double v2[] = new double[t2];
			
			for(int i = 0; i < t1; i++)
			{
				v1[i] = v[i];
			}
			for(int i = t1; i < (t1+t2); i++)
			{
				v2[i-t1] = v[i];
			}
			mergeSort(v1);
			mergeSort(v2);
			merge(v, v1, v2);
		}
	}
		
	public static void merge(double w[], double w1[], double w2[])
	{
		int i = 0, j = 0, k = 0;
		
		while(w1.length != j && w2.length != k)
		{
			if(w1[j] >= w2[k])
		 		{
					w[i] = w1[j];
						i++;
						j++;
		 		}
			else 
				{
			 		w[i] = w2[k];
			 			i++;
			 			k++;
		 		}
		}
		while(w1.length != j)
		{
			w[i] = w1[j];
				i++;
				j++;
		}
		while(w2.length != k)
		{
			w[i] = w2[k];
				i++;
				k++;
		}
		
	}
	public static void main(String[] args) {
		double vetor[] = new double[20];
		
		for(int i=0; i < 20; i++)
		{
			vetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do indice " + i));
		}
		mergeSort(vetor);
		
		System.out.println("" + Arrays.toString(vetor));
	}

}
