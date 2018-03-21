package buscaLinearRecursiva;

import javax.swing.JOptionPane;

public class Ex39 {

	public static void main(String[] args) {
		int iVetor[] = new int[10];
		int iIndice, iK;
		for(int i = 0; i < 10; i++)
		{
			iVetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da posi��o " + i));
		}
		
		iK = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de busca"));
		
		iIndice = busca(iVetor, 1, iK);
		
		String sTitle = "Busca Linear Recursiva - Saida";
		String sIO = "O n�mero " + iK;
		
		if(iIndice < iVetor.length)
			sIO += " est� localizado no indice " + iIndice + " do vetor.";
		else sIO += " n�o esta localizado no vetor.";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static int busca(int iV[], int iI, int iK)
	{
		
		if(iI <= (iV.length-1) && (iK != iV[iI]))
		{
			return busca(iV, iI+2,iK);
		}
		return iI;
	}

}
