package exercicioVetor;
import java.util.*;

public class parImpar {
	 
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		
		for (i = 0; i < TAM; i++) {
			System.out.println("digite o " + (i+1) + "° valor de A: ");
			a[i] = ler.nextInt();
			
			if (a[i] % 2 == 0) { 
				b[i] = 1;
			} else { 
				b[i] = 0;
			}
		}
		
		System.out.print("\nA = [");
		for (i= 0; i < TAM; i++) {
			if (i == TAM - 1) {
				System.out.print(a[i]);
			} else {
				System.out.print(a[i] + " ");
			}
		}
		System.out.print("]");
		
		
		System.out.print("\nB = [");
		for (i = 0; i < TAM; i++) {
			if (i == TAM - 1) { 
				System.out.print(b[i]);
			} else {
				System.out.print(b[i] + " ");
			}
		}
		System.out.print("]");
		
		
		ler.close();
	}
}

