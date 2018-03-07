package metodosRecursivos;

import java.util.Scanner;

public class Ex26 {

	public static int busca(float vet[], int i, float procurado)
	{
		if(i >= vet.length) return -1; // nao encontrei
		else if(vet[i] == procurado) return i; // achei!!!
		else return busca(vet, i+1, procurado);
	}

	public static void main(String[] args) {
		float vet[] = new float[10];
		Scanner leitura = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Entre com um número: ");
			vet[i] = leitura.nextFloat();
		}
		
		System.out.println("Entre com o procurado");
		float procurado = leitura.nextFloat();
		System.out.println("O elemento está no indice " + busca(vet, 0, procurado));
	}

}
