package metodosRecursivos;


import java.util.Scanner;
public class Ex23 {

public static int somaVet(int vet[], int i)
	{
		if(i >= vet.length) return 0;
		else return vet[i] + somaVet(vet, i+1);
	}

	
	public static void main(String[] args) {
		int vet[] = new int[10];
		Scanner leitura = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Entre com um número: ");
			vet[i] = leitura.nextInt();
		}
		System.out.println("A soma vale: " + somaVet(vet, 0));
	}

}
