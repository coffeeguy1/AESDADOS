package listasSingularmenteEncadeadas;
import javax.swing.JOptionPane;

public class Ex22 {
			/*
			 * ALGESD - Nó em Lista Singularmente Encadeada - Classe NodeSE
			 * Aplicação Exemplo - Por RC
			 * 
			 * 
			 * */
		public class NodeSE
		{
			private int iElement;
			private NodeSE nsNext;
			
			public NodeSE()
			{
				iElement = 0;
				nsNext = null;
			}
			
			public NodeSE(int iE, NodeSE nsN)
			{
				iElement = iE;
				nsNext = nsN;
			}
			void setNext(NodeSE nsN)
			{
				nsNext = nsN;
			}
			
			int getElement()
			{
				return iElement;
			}
			
			NodeSE getNext()
			{
				return nsNext;
			}
		}
		
		private NodeSE nsInicio;
		private NodeSE nsFim;
		private int iTamanho;
		
		public Ex22()
		{
			nsInicio = null;
			nsFim = null;
			iTamanho = 0;
		}
		
		public void putHead(int iI)
		{
			NodeSE nsNovo = new NodeSE(iI, null);
			if(isEmpty())
				nsFim = nsNovo;
			else
				nsNovo.setNext(nsInicio);
			nsInicio = nsNovo;
			iTamanho++;
		}
		
		public void putTail(int iI)
		{
			NodeSE nsNovo = new NodeSE(iI, null);
			if(isEmpty())
				nsInicio = nsNovo;
			else
				nsFim.setNext(nsNovo);
			nsFim = nsNovo;
			iTamanho++;
		}
		
		public int takeHead()
		{
			int iI = -1;   // is Empty!
			if(!isEmpty())
			{ // is not Empty!
				iI = nsInicio.getElement();
				if(size() == 1)
				{
					nsInicio = null;
					nsFim = null;
				}
				else
					nsInicio = nsInicio.getNext();
				iTamanho--;
			}
			return iI;
		}
		
		public int takeTail()
		{
			int iI = -1; // is Empty!
			if(!isEmpty())
			{
				iI = nsFim.getElement();
				if(size() == 1)
				{
					nsInicio = null;
					nsFim = null;
				}
				else 
				{
					NodeSE nsAux = new NodeSE();
					nsAux = nsInicio;
					while(nsAux.getNext() != nsFim)
						nsAux = nsAux.getNext();
					nsFim = nsAux;
					nsAux.setNext(null);
				}
				iTamanho--;
			}
			return iI;	
		}
		
		public int viewHead()
		{
			int iI = -1; // is Empty!
			if(!isEmpty())
				 iI = nsInicio.getElement();  /// is not Empty!
			return iI;
		}
		
		public int viewTail()
		{
			int iI = -1; // is Empty!
			if(!isEmpty())
				iI = nsFim.getElement(); // is not Empty!
			return iI;
		}
		
		public int size()
		{
			return iTamanho;
		}
		
		public boolean isEmpty()
		{
			boolean bR = false;
			if(size() == 0)
				bR = true;
			return bR;
		}
		
		public String toString()
		{
			String saida = "";
			NodeSE inicio = nsInicio;
			while(inicio != null)
			{
				saida = saida + inicio.getElement() + " -> ";
				inicio = inicio.getNext();
			}
			return saida;
		}
		
		public static Ex22 lista;
		public static void main(String[] args) {
			/*Instância da lista*/
			lista = new Ex22();
			// Recebe o elemento do nó e o insere na cabeça da lista
			int valorCauda = 0;
			int sair = 0;
			int choose = 0;
			
			while(sair != 3)
			{
				choose = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir um novo nó\n"+ 
												"2 - Remover ultimo nó\n"+
													"3 - Sair"));
				if(choose == 1)
				{
					valorCauda = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da cauda?"));
					lista.putTail(valorCauda);
				}
				
				else if(choose == 2) {
					JOptionPane.showMessageDialog(null, "Ultimo numero da lista: " + lista.takeTail());
				}
				
				else if(choose == 3)
				{
					break;
				}
			System.out.println("Tamanho da lista: " + lista.size() + " Lista: " + lista);
			}
		}
}
