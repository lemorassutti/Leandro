package aula2;
import java.util.Scanner;
public class exemplo5 {

	public static void main(String[] args) {
		String nome;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = ler.next();
		
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=18) {
			System.out.println("Maior de idade");
			
			
		}else {
			
			System.out.println("Menor de idade");
		}

	}

}
