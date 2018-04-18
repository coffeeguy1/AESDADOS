package mergeSort;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex83 {
		public static void mergeSort(char v[])
		{
			if(v.length > 1)
			{
				int t1 = v.length/2;
				int t2 = v.length-t1;
				char v1[] = new char[t1];
				char v2[] = new char[t2];
				
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
			
		public static void merge(char w[], char w1[], char w2[])
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
		
		
		public static int busca(char iV[], int iB, int iA, char iK)
		{
			int iM = (iB + iA)/2;
			if(iB <= iA)
				if(iK < iV[iM]) return busca(iV, iB, iM - 1, iK);
				else if(iK > iV[iM]) return busca(iV, iM + 1, iA, iK);
				else return iM;
			return -1;
		}
		
		public static void main(String[] args) {
			char vetor[] = new char[10];
			
			for(int i=0; i < 10; i++)
			{
				vetor[i] = JOptionPane.showInputDialog("Digite o valor do indice " + i).charAt(0);
			}
			mergeSort(vetor);
			System.out.println("" + Arrays.toString(vetor)); /// apresenta o Vetor
			
			char iK = JOptionPane.showInputDialog("Digite o caractere que você deseja: ").charAt(0);
			System.out.println(busca(vetor, 0, vetor.length-1, iK));
		}

}
