package fila;

public class Ex1_Blog {
	private int vet[];
    private int inicio, fim, quantidade;
    
    public Ex1_Blog(int tamanho)
    {
         vet = new int[tamanho];
         inicio = fim = quantidade = 0;
    }
   
    public void enfileirar(int x)
    {
         vet[fim] = x;
         fim++;
         quantidade++;
         if (fim == vet.length)
            fim = 0;
    }
   
    public int desenfileirar()
    {
         int resp = vet[inicio];
         inicio++;
         quantidade--;
         if (inicio == vet.length)
            inicio = 0;
         return resp;
    }
   
    public boolean vazia()
    {
         if (quantidade == 0) 
            return true;
         else 
            return false;
    }
   
    public boolean cheia()
    {
         if (quantidade == vet.length) 
            return true;
         else 
            return false;
    }
    
public static void main(String[] args) {
			Ex1_Blog f = new Ex1_Blog(10);
			
			System.out.println("Colocando 8 números na fila.");
	        for(int i = 1; i <= 8; i++)
	           f.enfileirar(i);
	     
	        System.out.println("Retirando todos os elementos da fila:");
	        while(! f.vazia())
	        {
	           System.out.println( f.desenfileirar() );
	        }
	     
	        System.out.println("Colocando mais 10 números na fila.");
	     
	        for(int i = 9; i <= 18; i++)
	           f.enfileirar(i);
	     
	        System.out.println("Retirando todos os elementos da fila:");
	     
	        while(! f.vazia())
	        {
	           System.out.println( f.desenfileirar() );
	        }
		}

}
