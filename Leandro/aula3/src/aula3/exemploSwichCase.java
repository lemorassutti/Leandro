package aula3;
import java.util.Scanner;
public class exemploSwichCase {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int op;
		
		System.out.println("Digite o m�s em n�mero inteiro (de 1 � 4) ");
		
		op = ler.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("Janeiro");
				break;
			case 2:
				System.out.println("Fevereiro");
				break;
			case 3:
				System.out.println("Mar�o");
				break;
			case 4:
				System.out.println("Abril");
				break;
			default:
				System.out.println("ERRO Digite um numero de 1 � 4");
				break;
			
		}
		
	}

}
