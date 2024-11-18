package algoritimoidade;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner ler = new Scanner(System.in);
	      int an, aa, id;
	      
	      System.out.println("entre com o ano de nascimento");
	      an=ler.nextInt();
	      System.out.println("entre com o ano atual");
	      aa=ler.nextInt();
	      id=aa-an;
	      System.out.println("a idade é "+id);
	      
		   }
		}


