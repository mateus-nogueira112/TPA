package algoritimoidade;

import java.util.Scanner; 

public class Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner ler = new Scanner(System.in);
		 int d, m, a;
		 
		 System.out.println("entre com a quantidade de dias");
		 d=ler.nextInt();
		 System.out.println
		 m=d/30;
		 m=ler.nextInt();
		 a=m/12;
		 System.out.println("Meses e anos respectivamente são: "+m+"e"+a);
	}

}
