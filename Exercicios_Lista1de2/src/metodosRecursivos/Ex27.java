package metodosRecursivos;

import javax.swing.JOptionPane;

public class Ex27 {
	public static int potencia(int n, int p)
	{
		if(p == 1) return n;
		else {
			if(n == 1) return n;
			else return n * potencia(n, p - 1);
		}
	}
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		System.out.println(potencia(n1, n2));
		//MDC(180, 240, 270) = 2 x 3 x 5 = 30.
	}
	
}
