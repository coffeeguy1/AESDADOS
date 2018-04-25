package metodosRecursivos;

import javax.swing.JOptionPane;

public class Ex27 {
	public static int potencia(int n, int p)
	{
		if(p == 0) return 1;
		else {
			return n * potencia(n, p - 1);
		}	
	}
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da potência: "));
		
		System.out.println(potencia(n1, n2));
		//MDC(180, 240, 270) = 2 x 3 x 5 = 30.
	}
}


/*
 * 
 * 
 * 
 * if(p == 1) return n;
		else {
			return n * potencia(n, p - 1);
		}
		
		Funciona porém não é o correto.
 * 
 * */
