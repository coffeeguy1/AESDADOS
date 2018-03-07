package vetores;

public class Ex4 {

	public static void main(String[] args) {
		char vetor[] = new char[26];
		
		int c = 0;
		char a = ' ';
		int resto = 0;
		
		for(int i = 65; i < 91; i++)
		{
			resto = i%2;
			
			if(resto == 0)
			{
				i = i - 1;
				a = (char)i;
				vetor[c] = a;
				c = c + 1;
				i = i + 1;
			}
			
			if(resto != 0)
			{
				i = i + 1;
				a = (char)i;
				vetor[c] = a;
				c = c + 1;
				i = i - 1;
			}
		}
		
		for(int i = 0; i < 26; i++)
		{
		System.out.println(vetor[i]);
		}
	}

}
