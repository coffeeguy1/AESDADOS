package vetores;

public class Ex1 {

	public static void main(String[] args) {
		int vetor[]; // declaração do vetor
		vetor = new int[100]; // alocação de espaço para vetor  ou int vetor[] = new int[10]; // declaração combinada
		for(int i = 0; i < vetor.length; i++)
		{
			vetor[i] = i;
			System.out.println(vetor[i]);
		}
	}

}
