
package exercicioVetor;
import java.util.*;

public class Primo {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], primo = 0, i, j;
        a = new int[TAM];
		
		
		for (int i1 = 0; i1 < TAM; i1++) {
			System.out.println("Digite o " + (i1+1) + "° digito de A: ");
			a[i1] = in.nextInt();
		}
		
		for (int i1 = 0; i1 < TAM; i1++) {
			primo = 0;			
			for (int j1 = 1; j1 <= a[i1]; j1++) {
                if (a[i1] % j1 == 0) {
					primo++;
                } 
		}
					
			if (a[i1] <=1) {
				System.out.println(a[i1] + "Não é primo.");
			} else if (primo == 2) {
				System.out.println(a[i1] + " É primo.");
			} else {
				System.out.println(a[i1] + " Não é primo.");
			}
		}	
		in.close();	
	}
  }

	

