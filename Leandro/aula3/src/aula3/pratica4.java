package aula3;
import java.util.Scanner;
public class pratica4 {

	public static void main(String[] args) {
		int numero, valor=0;
		Scanner ler = new Scanner(System.in);
		
		
		for (int i = 0; i<=10;i++) {
			System.out.println("insira um valor a ser somado: ");
			numero = ler.nextInt();
			
			if(numero<40) {
				valor = valor+numero;
			}
			
		}
		System.out.println("A soma é "+ valor);
	}

}
