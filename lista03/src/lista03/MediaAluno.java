gpackage lista03;
import java.util.Scanner;

public class MediaAluno {
    public static void main (String args[]) {
    	Scanner ler = new Scanner(System.in);
    	double nota1, nota2, media;
    	//leia(nota1)
    	System.out.println("Digite a 1a nota:");
    	nota1 = ler.nextDouble();
    	//leianota2)
    	System.out.println("Digite a 2a nota:");
    	nota2 = ler.nextDouble();
    	media=(nota1+nota2)/2;
    	//escreva media
    	System.out.println("Sua m�dia �:" + media);
    	ler.close(); 
    }
}