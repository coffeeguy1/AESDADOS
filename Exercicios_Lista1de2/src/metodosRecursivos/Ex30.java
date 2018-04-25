package metodosRecursivos;

import javax.swing.JOptionPane;

public class Ex30 {
	/**
	 * (Base) n=0 ----- 1 
	 * (Caso geral) expressão(n) = expressao(n-1) + 1.0/math.pow(2,n)
	 * 1/10 elevado a 10
	 * Math.pow(2, -N)
	 * 
	 * */
	public static double termo(int vezes)
	{
		if(vezes == 0) return 1;
		else { 
			return termo(vezes - 1) + 1/Math.pow(2, vezes);
		}
	}
	public static void main(String[] args) {
		int vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));;
		
		System.out.println(termo(vezes));
	}

}
/*
 * termo(n1 + (1/n2), n2, vezes -1)
1)
	termo(1 + (1/2), 2, 4 - 1)
2)
	termo(1 + (1/4), 2, 4 - 1)
3)
	termo(1 + (1/2), 2, 4 - 1)
4)
	termo(1 + (1/2), 2, 4 - 1)
	
	
	Exercicio feito por mim - terminar
	
public class Ex30 {
	public static double termo(double n1, double n2, double vezes)
	{
		if(vezes == 0) return n1;
		else { 
			n2 = Math.pow(n2, 2);
			return termo(n1 + (1/n2), n2, vezes - 1);
		}
	}
	public static void main(String[] args) {
		double n1 = 1;
		double n2 = 0;
		double vezes = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));;
		
		System.out.println(termo(n1, n2, vezes));
	}

}
*/
