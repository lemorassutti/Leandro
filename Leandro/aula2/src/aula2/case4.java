package aula2;

import java.util.Scanner;

public class case4 {

	public static void main(String[] args) {
		String op;
		float vl1, vl2, res;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:");
		vl1 = ler.nextFloat();

		System.out.println("Digite o segundo numero:");
		vl2 = ler.nextFloat();

		System.out.println("|***************************************|");
		System.out.println("|       Calculadora Leandro CASE3       |");
		System.out.println("|                  MENU                 |");
		System.out.println("|+                                      |");
		System.out.println("|-                                      |");
		System.out.println("|*                                      |");
		System.out.println("|/                                      |");
		System.out.println("|                                       |");
		System.out.println("|***************************************|");

		op = ler.next();

		if (op.equals("+")) {

			res = vl1 + vl2;
			System.out.println("O resultado da soma de " + vl1 + " + " + vl2 + " é " + res);

		} else if (op.equals("-")) {
			res = vl1 - vl2;
			System.out.println("O resultado da subtração de " + vl1 + " - " + vl2 + " é " + res);
		} else if (op.equals("*")) {
			res = vl1 * vl2;
			System.out.println("O resultado da multiplicação de " + vl1 + " x " + vl2 + " é " + res);
		} else if (op.equals("/")) {
			res = vl1 / vl2;
			System.out.println("O resultado da subtração de " + vl1 + " / " + vl2 + " é " + res);
		} else {
			System.out.println("Opção inválida");
		}
	}

}
