package metodosRecursivos;

public class Ex21 {
	
	public static int fatorial(int i)
	{
		if(i == 1) return i;
		else return fatorial(i - 1) * i;
		
	}
	
	public static void main(String[] args) {
		System.out.println(fatorial(4));
		
	}

}
