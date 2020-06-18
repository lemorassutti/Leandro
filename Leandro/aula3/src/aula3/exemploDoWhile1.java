package aula3;
import java.util.Scanner;
public class exemploDoWhile1 {

	public static void main(String[] args) {
		int numero, soma;
		
		soma=0;
		
		Scanner ler = new Scanner(System.in);
		
		do {
			System.out.println("Digite o numero: ");
			numero = ler.nextInt();
			
			soma = soma+numero;
			System.out.println("Total" + soma);
			
		}while(soma<10);
	}

}
