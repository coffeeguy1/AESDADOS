package buscaLinearRecursiva;

import javax.swing.JOptionPane;

public class Ex41 {
	static double indice = 0;
	public static void main(String[] args) {
		double iVetor[] = new double[10];
		double iIndice;
		double iK;
		
		for(int i = 0; i<iVetor.length; i++)
		{
			iVetor[i] = Double.valueOf(JOptionPane.showInputDialog("Digite o valor do indice " + i));
		}
		iK = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave de busca"));
		
		iIndice = busca(iVetor, 0, iK);
		
		String sTitle = "Busca Linear Recursiva - Saida";
		String sIO = "O número " + iK;
		
		if(iIndice < iVetor.length-1)
			sIO += " está localizado no indice " + iIndice + " do vetor.";
		else sIO += " não esta localizado no vetor.";
		JOptionPane.showMessageDialog(null, sIO, sTitle, JOptionPane.INFORMATION_MESSAGE);
		
		System.exit(0);
	}
	
	public static double busca(double iV[], int iI, double iK)
	{
		if(iI <= (iV.length-1))
		{	
			if((iK == iV[iI]))
			{
				indice = iI;
			}else if(iI == iV.length-1){
				return iI;
			}
			return busca(iV, iI+1,iK);
		}
		return indice;
	}
}
