package vetores;

public class Ex1 {

	public static void main(String[] args) {
		int vetor[]; // declara��o do vetor
		vetor = new int[100]; // aloca��o de espa�o para vetor  ou int vetor[] = new int[10]; // declara��o combinada
		for(int i = 0; i < vetor.length; i++)
		{
			vetor[i] = i;
			System.out.println(vetor[i]);
		}
	}

}
