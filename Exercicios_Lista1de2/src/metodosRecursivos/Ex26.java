package metodosRecursivos;

import javax.swing.JOptionPane;
public class Ex26 {
	
	public static int MDC(int n1, int n2, int multDiv)
	{
		multDiv = 0;
		int calc = 0;  /// essa variavel será responsável por dividir os valores.
		
		if(n1 == 1 && n2 == 1) return multDiv;  
		else if(calc % 2 == 0 ){
				if()
			return MDC(n1/calc, n2/calc, multDiv);
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		//MDC(180, 240, 270) = 2 x 3 x 5 = 30.
		
		
	}

}
