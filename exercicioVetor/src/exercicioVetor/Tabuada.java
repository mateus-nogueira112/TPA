

package exercicioVetor;
import java.util.*;

public class Tabuada {
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n, result, a[], j;
		a = new int[5];
		
		for (j=0; j<5; j++ ) {
			System.out.println("Digite um numero para obter sua tabuada:");
			a[j] = in.nextInt();
			
			for (i=0; i<=10; i++) {
				result = i*a[j];
				System.out.println(a[j] + "x" + i + "=" + result);
			}
		}
	}
}
