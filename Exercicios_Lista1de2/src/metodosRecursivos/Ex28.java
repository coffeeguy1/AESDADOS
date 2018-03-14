package metodosRecursivos;

import java.util.Scanner;

public class Ex28 {
	
	public static int somaMult(int soma, int mult)
	{
		int i = 0;
		if(mult == soma * mult) return mult;
		else return somaMult(soma, mult + mult);
	}
		
	public static void main(String[] args) {
		int valor = 0;
		
		do 
		{
		Scanner leitura = new Scanner(System.in);
		System.out.println("Entre com a soma: ");
		int soma = leitura.nextInt();
		System.out.println("Entre com o valor a ser multiplicado");
		int mult = leitura.nextInt();
		if(soma >= 0) {
			if(mult >= 0)
				{
				 System.out.println(somaMult(soma, mult));
				 valor = 1;
				}
		}else {
			
		}
		}while(valor == 0);
	
	}

}
