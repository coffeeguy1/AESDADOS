package filasCirculares;

import javax.swing.JOptionPane;

public class Ex15 {
	public static int iTAM = 10;
	public static int iFila [ ] = new int [ iTAM ];
	public static int iSPos = 0;
	public static int iRPos = 0;
	public static boolean bQueueFull = false;
	
	public static int size ( )
	{
		if ( iSPos >= iRPos && ! bQueueFull ) return iSPos - iRPos;
		else return iSPos + iFila.length - iRPos;
	}
	public static int front ( )
	{
		return iFila [ iRPos ];
	} 
	
	public static boolean isOver ( )
	{
		if ( iSPos == iRPos && bQueueFull ) return true;
		return false;
	}
	public static void enQueueC ( int iC )
	{
		iFila [ iSPos++ ] = iC;
		if ( iSPos >= iFila.length ) iSPos=0;
		if( iSPos == iRPos) bQueueFull = true;
	}
	
	public static int deQueueC ( )
	{
		int iIndice = iRPos++;
		if ( iRPos >= iFila.length ) iRPos = 0;
		bQueueFull = false;
		return iFila [ iIndice ];
	}
	
	public static void main(String args[])
	{
		int valor = 0;
		int valor2 = 0;
		int escolha = 0;
		int parada = 0;
		while(parada == 0)
		{
			escolha = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir Elementos \n" + "2-Consultar Elementos \n" + "3-Retirar Elementos \n" + "4-Sair"));
			if(escolha == 1)
			{
				for(int i = 0; i < 10; i++)
				{
					valor = Integer.valueOf(JOptionPane.showInputDialog("Digite um valor na fila."));
					enQueueC(valor);
					
				}
				
				for(int i=0; i<10; i++)
				{	
					valor2 = deQueueC();
					System.out.println(valor2);
				}
			}
			if(escolha == 2)
			{
				System.out.println("O primeiro valor é: " + front());
				JOptionPane.showMessageDialog(null, front());
			}
			if(escolha == 3)
			{
				
			}
			if(escolha == 4)
			{
				break;
			}
		}
	}
}
