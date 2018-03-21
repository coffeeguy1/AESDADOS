package buscaLinearRecursiva;

import javax.swing.JOptionPane;

public class Ex40 {
	public static void main(String[] args) {
		double iVetor[] = new double[10];
		int iIndice;
		double iK;
		for(int i = 0; i < 10; i++)
		{
			iVetor[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da posi��o " + i));
		}
		
		iK = Double.parseDouble(JOptionPane.showInputDialog("Digite a chave de busca"));
		
		iIndice = busca(iVetor, 0, iK);
		
		String sTitle = "Busca Linear Recursiva - Saida";
		String sIO = "O n�mero " + iK;
		
		if(iIndice < iVetor.length)
			sIO += " est� localizado no indice " + iIndice + " do vetor.";
		else sIO += " n�o esta localizado no vetor.";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static int busca(double iV[], int iI, double iK)
	{
		
		if(iI <= (iV.length-1) && (iK != iV[iI]))
		{
			return busca(iV, iI+2,iK);
		}
		return iI;
	}
}