package metodosRecursivos;

import javax.swing.JOptionPane;
public class Ex26 {
	public static int multDiv = 0;
	//public static int calc = 0;   /// essa variavel será responsável por dividir os valores.
	public static int calcularMdc(int a, int b)
	{
		if ( a == 0 ) 
            return b;
		else return calcularMdc( b % a, a );
		
		/*
		if(n1 == 1 && n2 == 1) return multDiv;  
		if(n1 % calc == 0)
		{
			return MDC(n1/calc, n2, calc);
		}
		else if(n1 != 1) {
			return MDC(n1, n2, calc++);
		}
		calc = 2;
		if(n2 % calc == 0)
		{
			System.out.println("chegou aqui" + calc);
			return MDC(n1, n2/calc, calc);
		}
		else if(n2 != 1)
		{
			return MDC(n1, n2, calc++);
		}
		return -1;
		*/
	}
	
	
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		System.out.println(calcularMdc(n1, n2));
		//MDC(180, 240, 270) = 2 x 3 x 5 = 30.
		
		
	}

}
