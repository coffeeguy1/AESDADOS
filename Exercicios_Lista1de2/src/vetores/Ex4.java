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

/*
 * Passos para desenvolver um algoritmo recursivo
 * 1) Qual é a instância(versão) mais simples do problema -- > BASE --- o if
 * 
 * 2) O que é um pouco mais simples que o problema original?
 * 
 * 3) Se eu tiver a resposta do problema 2 como eu consigo resolver o problema original?
 * */
