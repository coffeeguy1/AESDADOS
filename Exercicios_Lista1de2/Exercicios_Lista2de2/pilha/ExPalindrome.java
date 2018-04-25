package pilha;

public class ExPalindrome {
	private int vet[];
	 private int topo;

	  public ExPalindrome(int tamanho)
	 {
	  vet = new int[tamanho];
	  topo = -1;
	 }

	  public void empilhar(int x)
	 {
	  topo++;
	  vet[topo] = x;
	 }

	  public int desempilhar()
	 {
	  int aux = vet[topo];
	  topo--;
	  return aux;
	 }

	  public boolean vazia()
	 {
	  if (topo == -1) return true;
	  else return false;
	 }
	  
	public static void main(String[] args) {
			
		ExPalindrome p1 = new ExPalindrome(10);
		ExPalindrome p2 = new ExPalindrome(10);
		  
		  p1.empilhar(1);
		  p1.empilhar(2);
		  p1.empilhar(3);
		  p1.empilhar(4);
		  p1.empilhar(5);
		  p1.empilhar(6);
		  p1.empilhar(7);

		   while(! p1.vazia())
		  {
		   int aux = p1.desempilhar();
		   System.out.println(aux);
		   p2.empilhar( aux );
		  }
		  
		  while(! p2.vazia())
		  {
		   System.out.println(p2.desempilhar());
		  }
	}

}
