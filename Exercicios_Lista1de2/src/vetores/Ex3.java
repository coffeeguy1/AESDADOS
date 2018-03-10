package vetores;

public class Ex3 {
	public static void main(String[] args)
	{
		char vetor[] = new char[26]; /// definindo meu vetor char
		char a = ' ';
		 
		for (int i = 65; i < 91; i++) {
		for(int c = 0; c < 1; c++)	
		{
			a = (char) i; 
			vetor[c] = a;
		
			System.out.println(vetor[c]);
		}
		}
		
		for (int i = 0; i < 26; i++)
		{
			System.out.println(vetor[i]);
		}
	}
}
