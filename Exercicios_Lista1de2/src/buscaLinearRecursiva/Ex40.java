package buscaLinearRecursiva;

import javax.swing.JOptionPane;

public class Ex40 {
	public static void main(String[] args) {
		char iVetor[] = new char[10];
		int iIndice;
		char iK;
		for(int i = 0; i < 10; i++)
		{
			iVetor[i] = JOptionPane.showInputDialog("Digite o valor da posição " + i).charAt(0);
		}
		
		iK = JOptionPane.showInputDialog("Digite a chave de busca").charAt(0);
		
		iIndice = busca(iVetor, 9, iK);
		
		String sTitle = "Busca Linear Recursiva - Saida";
		String sIO = "O caracter " + iK;
		
		if(iIndice < iVetor.length)
			sIO += " está localizado no indice " + iIndice + " do vetor.";
		else sIO += " não esta localizado no vetor.";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static int busca(char iV[], int iI, char iK)
	{
		
		if(iI <= (iV.length-1) && (iK != iV[iI]))
		{
			return busca(iV, iI-1,iK);
		}
		return iI;
	}
}
