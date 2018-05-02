package pilha;

import javax.swing.JOptionPane;

public class ExPalindrome {
	 private char vet[];
	 private int topo;

	  public ExPalindrome(int tamanho)
	 {
	  vet = new char[tamanho];
	  topo = -1;
	 }

	  public void empilhar(char x)
	 {
	  topo++;
	  vet[topo] = x;
	 }

	  public char desempilhar()
	 {
	  char aux = vet[topo];
	  topo--;
	  return aux;
	 }

	  public boolean vazia()
	 {
	  if (topo == -1) return true;
	  else return false;
	 }
	  
	public static void main(String[] args) {
		
		String pf = JOptionPane.showInputDialog("Digite a frase/palavra");
		int tamanho = pf.length();
		
		ExPalindrome p1 = new ExPalindrome(tamanho);
		
		  
		char b[] = pf.toCharArray();
		
		String invertido = "";
		 
		for (char c : b) 
		{
			p1.empilhar(c);
		}
		
		while(! p1.vazia())
		{
		  invertido = invertido + p1.desempilhar(); 
		}
		
		System.out.println(invertido);
		
		if(invertido.equals(pf))
		{
			System.out.println("É palindrome");
			
		}else {
			System.out.println("Não é palindrome");
		}

		
	}

}
