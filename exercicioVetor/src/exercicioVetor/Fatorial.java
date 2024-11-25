package exercicioVetor;

import java.util.*;

public class Fatorial {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
	
    final int TAM=10;
    int a[], b[], i, j;
    a= new int [TAM];
    b= new int [TAM];
    Scanner ler;
    
	for(i=0; i<TAM; i++) {
            System.out.println("Escreva o "+(i+1)+"º valor de A: ");
            a[i]= ler.nextInt();

            b[i]=a[i];

            for(j=b[i]-1;j>1; j--) {
                    b[i]=b[i]*j;
            }
    }
    System.out.print("\nA = [");
    for(i=0; i<TAM; i++) {

            if(i==TAM-1) {
                    System.out.print(a[i]);
            }else
            System.out.print(a[i]+" ");
    }
    System.out.print("]");

    System.out.print("\nB = [");
    for(i=0; i<TAM; i++) {

            if(i==TAM-1) {
                    System.out.print(b[i]);
            }else
            System.out.print(b[i]+" ");
    }
    System.out.print("]");

    ler.close();
    }
  }
