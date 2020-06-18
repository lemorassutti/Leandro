package aula3;

public class pratica3 {

	public static void main(String[] args) {
		int valor = 0, cont = 0;
		double media = 0;

		for (int i = 10; i <= 100; i++) {

			System.out.println("O numero é " + i);
			valor = valor+i;
			cont++;

			
		}
		media = valor / cont;
		System.out.println("Media " + media);

	}

}
