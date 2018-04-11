package quickSort;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ex78 {

	public static void OrdenacaoQuickSortInt(char iVet[], int iBaixo, int iAlto)
	{
		// 2, 3, 8, 1, 6
		int iP, iB, iA;
		char iPivot;
		
		iB = iBaixo;
		iA = iAlto;
		iPivot = iVet[iBaixo];
		
		while(iBaixo < iAlto)
		{
			while((iVet[iAlto] >= iPivot) && (iBaixo < iAlto))
				iAlto--;
			if(iBaixo != iAlto)
			{
				iVet[iBaixo] = iVet[iAlto];
				iBaixo++;
			}
			while((iVet[iBaixo] <= iPivot) && (iBaixo < iAlto))
				iBaixo++;
			if(iBaixo != iAlto) 
			{
				iVet[iAlto] = iVet[iBaixo];
				iAlto--;
			}
			}	
		iVet[iBaixo] = iPivot;
		iP = iBaixo;
		iBaixo = iB;
		iAlto = iA;
		if(iBaixo < iP) OrdenacaoQuickSortInt(iVet, iBaixo, iP-1);
		if(iAlto > iP) OrdenacaoQuickSortInt(iVet, iP+1, iAlto);
		
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
		
		for(int i=0; i<vetor.length; i++)
		{
			vetor[i] =  JOptionPane.showInputDialog("Qual o valor do indice: " + i).charAt(0);
		}
		//System.out.println(Arrays.toString(vetor));
		OrdenacaoQuickSortInt(vetor, 0, vetor.length-1);
		System.out.println(Arrays.toString(vetor));
		
		char iK = JOptionPane.showInputDialog("Digite o caractere que você deseja: ").charAt(0);
		System.out.println(busca(vetor, 0, 10, iK));
	}

}
