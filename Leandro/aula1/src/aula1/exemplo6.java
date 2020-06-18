package aula1;
import java.util.Scanner;
public class exemplo6 {

	public static void main(String[] args) {
		String primeiro,ultimo;
		int idade;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		primeiro = ler.next();
		
		ler = new Scanner(System.in);
		System.out.println("Digite seu Sobrenome: ");
		ultimo = ler.next();
		
		ler = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("Seu nome é " + primeiro + " " + ultimo + " \nSua idade é " + idade);
	}

}
