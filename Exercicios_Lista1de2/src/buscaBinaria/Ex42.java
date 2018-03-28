package buscaBinaria;

public class Ex42 {
	
	public static int busca_binaria(int iVet[], int iK)
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
		

	}

}
