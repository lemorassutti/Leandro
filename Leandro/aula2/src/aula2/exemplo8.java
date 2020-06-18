package aula2;
import java.util.Scanner;
public class exemplo8 {

	public static void main(String[] args) {
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual seu estado civil?\n 1) Casado \n 2) Solteiro \n 3) Outros");
		
		op = ler.nextInt();
		
		if(op == 1) {
			System.out.println("Estado Civil CASADO");
		}else if (op == 2) {
			System.out.println("Estado Civil SOLTEIRO");
		}else if (op == 3) {
			System.out.println("Estado Civil OUTROS");
		}else {
			System.out.println("Opção inválida");
		}
	}

}
