package metodosRecursivos;

import java.util.Scanner;

public class Ex28 {
	
	public static int somaVezes(int soma, int vezes)
	{
		if(vezes == 1) return soma;
		else return soma + somaVezes(soma, vezes - 1);
	}
		
	public static void main(String[] args) {
		int valor = 0;
		
		do 
		{
		Scanner leitura = new Scanner(System.in);
		System.out.println("Entre com o valor a ser somado: ");
		int soma = leitura.nextInt();
		System.out.println("Entre com a quantidade de vezes");
		int vezes = leitura.nextInt();
		if(soma >= 0) {
			if(vezes >= 0)
				{
				 System.out.println(somaVezes(soma, vezes));
				 valor = 1;
				}
		}else {
			
		}
		}while(valor == 0);
		
	
	}

}
