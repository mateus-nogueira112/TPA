package listaoVetores;

import java.util.Scanner;

public class Intercecao {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], inter = 0, i, j;
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Escreva o valor número " + (i + 1) + " de A: ");
			a[i] = ler.nextInt();
		}
		System.out.println("\n");
		
		for(i = 0; i < TAM; i++) {
			System.out.println("Escreva o valor número " + (i + 1) + " de B: ");
			b[i] = ler.nextInt();
		
			for(j = 0; j < TAM; j++) {
				if(b[i] == a[j]) {
					c[j] = b[i];
					inter++;
				}
			}
		}
		
	    System.out.print("\\nA = [");
	    for(i = 0; i < TAM; i++) {
	    	if(i == - 1) {
	    		System.out.print(a[i]);
	    	} else {
	    		System.out.print(a[i] + " ");
	    	}
	    }
	    System.out.print("]");
	    
	    System.out.print("\nB = [");
	    for(i = 0; i < TAM; i++) {
	    	if(i == TAM - 1) {
	    		System.out.print(b[i]);
	    	} else {
	    		System.out.print(b[i] + " ");
	    	}
	    }
	    System.out.print("]");

	    System.out.print("\nC = [");
	    for(i = 0; i < inter; i++) {  // Imprime os valores da interseção, que estão no vetor C
	        if(i == inter - 1) {
	            System.out.print(c[i]);  // Imprime o último valor da interseção
	        } else {
	            System.out.print(c[i] + " ");  // Imprime os valores seguidos de vírgula
	        }
	    }
	    System.out.print("]");
	    
	    ler.close();
	}
}
