package vetores;

public class Ex2 {

	public static void main(String[] args) {
		int vetor[] = new int[100];
		int resto;
		
		for(int i = 0; i < 100; i++)
		{
			resto = i%2;
			if(resto == 0)
			{
				vetor[i] = 0;
				System.out.println(vetor[i]);
			}
			else {
				vetor[i] = i;
				System.out.println(vetor[i]);
			}
		}
	}

}
