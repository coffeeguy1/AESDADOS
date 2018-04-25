package metodosRecursivos;

import javax.swing.JOptionPane;

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
*/
