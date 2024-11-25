package listaoVetores;

import java.util.*;

public class Decrescente {
	
	public static void main(String[] args) {
		Scanner ler= new Scanner(System.in);
		final int TAM=10;
		int a[], b[], c[],d, i, j;
		a= new int [TAM];
		b= new int [TAM];
		c= new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A: ");
			a[i]= ler.nextInt();
			
			b[i]=a[i];
		}
		for(i=0; i<TAM; i++) {
			for(j=0; j<TAM-1; j++) {
				if(b[j]>b[j+1]) {
					d=b[j];
					b[j]=b[j+1];
					b[j+1]=d;
				}
			}
		}
		i=0;
		for(j=TAM-1;j>=0; j--) {
			c[j]=b[i];
			i++;
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
		
		System.out.print("\nC = [");
		for(i=0; i<TAM; i++) {
			
			if(i==TAM-1) {
				System.out.print(c[i]);
			}else
			System.out.print(c[i]+" ");
		}
		System.out.print("]");
		
		ler.close();
	}
}

