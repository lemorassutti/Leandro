package aula2;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		int idade = 15;
		Scanner ler = new Scanner(System.in);
		System.out.println("qual sua idade: ");
		idade = ler.nextInt();

		if (idade < 16) {
			System.out.println("Não Eleitor!");

		} else if (idade >= 18 && idade < 65) {
			System.out.println("Eleitor Obrigatório!");
		} else if ((idade >= 16 && idade < 18) || idade > 65) {

			System.out.println("Eleitor Facultativo!");
		}
	}

}
