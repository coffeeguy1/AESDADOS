package buscaBinaria;

import javax.swing.JOptionPane;

public class Ex42 {
	
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
		char iVetor[] = new char[10];
		
		for(int i = 0; i < iVetor.length; i++)
		{
			iVetor[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite o valor do indice " + i));
		}
		///http://algesd.blogspot.com.br/
	}

}
