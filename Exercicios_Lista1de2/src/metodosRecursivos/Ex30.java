package metodosRecursivos;

import javax.swing.JOptionPane;

public class Ex30 {
	public static int termo(int n1, int vezes)
	{
		if(vezes == 0) return n1;
		else return n1 + termo(1/n1, vezes - 1);
	}
	public static void main(String[] args) {
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		int vezes = n1;
		System.out.println(termo(n1, vezes));
	}

}
