package fila;

public class PintarCoracao {
	private int vet[];
    private int inicio, fim, quantidade;
    
    public PintarCoracao(int tamanho)
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
    
    public void mostrarMatriz(int matriz[][])
    {
    	for (int l = 0; l < matriz.length; l++)  {  
    	       for (int c = 0; c < matriz[0].length; c++)     { 
    	           System.out.print(matriz[l][c] + " "); //imprime caracter a caracter
    	       }  
    	       System.out.println(" "); //muda de linha
    	     }
    }
    
	public static void main(String[] args) {
		
		int mat[][]= {
	               {0,0,1,1,1,1,0,0,1,1,1,1,0,0},
	               {0,1,0,0,0,0,1,1,0,0,0,0,1,0},
	               {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
	               {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
	               {0,1,0,0,0,0,0,0,0,0,0,0,1,0},
	               {0,0,1,0,0,0,0,0,0,0,0,1,0,0},
	               {0,0,0,1,0,0,0,0,0,0,1,0,0,0},
	               {0,0,0,0,1,0,0,0,0,1,0,0,0,0},
	               {0,0,0,0,0,1,0,0,1,0,0,0,0,0},
	               {0,0,0,0,0,0,1,1,0,0,0,0,0,0},
	               {0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
	      
		 	 PintarCoracao f  = new PintarCoracao(1000);
	         
	         int x=2, y=2; //ponto de inicio da pintura  
	         System.out.println("Coordenadas iniciais: x = " + x + ", y = " + y + "\n\n");
	        
	         f.enfileirar(x);
	         f.enfileirar(y); 
	         while(!f.vazia())
	         {
	            x=f.desenfileirar();
	            y=f.desenfileirar(); 
	            if(mat[x][y] == 0) //pode ser pintado?
	            {
	               mat[x][y] = 2; //pintei
	               if((x+1)<mat.length && mat[x+1][y] == 0) //abaixo
	               {
	                  f.enfileirar(x+1);
	                  f.enfileirar(y);
	               }
	               
	               if((x-1)<mat.length && mat[x-1][y] == 0) //abaixo
	               {
	                  f.enfileirar(x-1);
	                  f.enfileirar(y);
	               }
	               
	               if((y+1)<mat[0].length && mat[x][y+1] == 0) //abaixo
	               {
	                  f.enfileirar(x);
	                  f.enfileirar(y+1);
	               }
	               
	               if((y-1)<mat[0].length && mat[x][y-1] == 0) //abaixo
	               {
	                  f.enfileirar(x);
	                  f.enfileirar(y-1);
	               }
	               
	            }

	         }
	        
	         
	         f.mostrarMatriz(mat);
}
}
