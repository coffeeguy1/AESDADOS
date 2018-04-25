package metodosRecursivos;

import javax.swing.JOptionPane;
public class Ex26 {
	public static int multDiv = 0;
	//public static int calc = 0;   /// essa variavel será responsável por dividir os valores.
	public static int MDC(int n1, int n2)
	{
		if ( n1 == 0 ) return n2;
		else return MDC( n2 % n1, n1 );
	}
	/*http://mundoeducacao.bol.uol.com.br/matematica/mdc-divisoes-sucessivas.htm*/
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		System.out.println(MDC(n1, n2));
		
		
	}

}
