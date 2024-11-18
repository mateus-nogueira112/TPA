package algoritimoidade;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
	
        
         Scanner ler = new Scanner(System.in);
         double n1, n2, m;
         
         System.out.println("entre com o primeiro valor"); 
         n1=ler.nextDouble();
         System.out.println("entre com o segundo valor"); 
         n2=ler.nextDouble();
         m=(n1+n2)/2;
         System.out.println("a média é: " +m);
         
	}

}
