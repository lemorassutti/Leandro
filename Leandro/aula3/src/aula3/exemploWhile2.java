package aula3;

import java.util.Scanner;

public class exemploWhile2 {

	public static void main(String[] args) {
	
		int idade;
		Scanner ler = new Scanner(System.in);
		System.out.println("Qual sua idade:");
		
		idade = ler.nextInt();
		
		while (idade <= 18) {
			
			System.out.println(idade);
			idade++;
			
			
		}

	}

}
