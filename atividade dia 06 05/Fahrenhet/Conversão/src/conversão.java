
import java.util.Scanner;

public class conversão {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int f, c;
		
		System.out.println("Digite a temperatura em fahrenthet: ");
		f = ler.nextInt();
		
		c = (int) ((f-32)/1.8);
		System.out.println("Sua temperatura em celsius " + c);
		
		if(c<15)  {
			System.out.println("está frio ");
			 
		}else if(c>15) {
			System.out.println("está calor ");
			
		}else
			System.out.println("está ameno");
		ler.close();
	}
	
}
