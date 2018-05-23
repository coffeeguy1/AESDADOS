package listasSingularmenteEncadeadas;

import javax.swing.JOptionPane;

class No
{  public char dado;
   public No proximo;
   public No(char dado)
   {  this.dado = dado;
      proximo = null;
   }
   public String toString()
   {  return dado + " -> ";
   }
}
class ListaSE //Lista Simples Encadeada
{  public No primeiro, ultimo;
   public int quantidade;
   public ListaSE()
   {  primeiro = ultimo = null;
      quantidade = 0;
   }
   public void inserirFim(char x)
   {  if(quantidade == 0) //lista vazia
      {  No novo = new No(x);
         primeiro = novo;
         ultimo = novo;
         quantidade=1;
      }
      else
      {  No novo = new No(x);
         ultimo.proximo = novo;
         ultimo = novo;
         quantidade ++;
      }
   }  
   public String toString()
   {  String saida="";
      No n = primeiro;
      for(int i=0; i<quantidade; i++)
      {  saida += n;
         n = n.proximo;
      }
      return saida;
   }
}

public class Ex26
{
   public static void main(String args[])
   {
      ListaSE lista = new ListaSE();
      String palavra = JOptionPane.showInputDialog("Digite a desgraça da palavra fdp");
      for(int i=0; i<palavra.length();i++)
      {
    	  lista.inserirFim(palavra.charAt(i));
      }
      System.out.println(lista);
   }
}