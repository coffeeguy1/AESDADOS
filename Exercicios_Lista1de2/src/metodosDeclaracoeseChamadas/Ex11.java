package metodosDeclaracoeseChamadas;

import javax.swing.JOptionPane;

public class Ex11 {
	
	public static double delta(double a, double b, double c)
	{	
		double x = Math.pow(b, 2);
		return JOptionPane.showMessageDialog(null, "O valor de denta é: " + Math.sqrt(x - 4*a*c));
		
	}
	
	public static void resultado(double a, double b, double c)
	{	
		double x1 = (- b - delta(a, b, c))/2*a;
		double x2 = (- b + delta(a, b, c))/2*a;
		
		System.out.println(delta(a, b, c));
		JOptionPane.showMessageDialog(null, "X1 é: " + x1 + "X2 é: " + x2);
	}
	
	
	
	public static void main(String[] args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:?"));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:?"));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:?"));
	
		resultado(a,b,c);
	}

}
