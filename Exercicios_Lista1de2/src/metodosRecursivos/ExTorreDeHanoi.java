package metodosRecursivos;

public class ExTorreDeHanoi {

	       public static void hanoi (int n, char origem, char destino, char auxiliar) 
	      { 
	         if(n==1) System.out.println("Mova o disco do pino " + origem + " para o pino " + destino); 
	         else{ 
	            hanoi(n-1, origem, auxiliar, destino); 
	            System.out.println("Mova o disco do pino " + origem + " para o pino " + destino); 
	            hanoi(n-1, auxiliar, destino, origem); 
	         } 
	      }    
	
	       public static void main (String args[]) 
	      { 
	         System.out.println("Resolvendo a Torre de Hanoi para 3 discos:\n"); 
	         hanoi(3, 'A', 'C', 'B'); 
	                
	         System.out.println("Resolvendo a Torre de Hanoi para 4 discos:\n"); 
	         hanoi(4, 'A', 'C', 'B'); 
	      } 
	       
}
