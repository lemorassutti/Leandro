package aula3;
import java.util.Scanner;
public class exemploWhile3 {

	public static void main(String[] args) {
		
		
		int valor = 1, valor2, res;
	
		System.out.println("qual a tabuada deseja saber? ");
		Scanner ler = new Scanner(System.in);
		valor2 = ler.nextInt();
			
			
		while (valor <= 10) {
			res = valor2*valor;
			System.out.println(valor2+"x"+valor+"="+res);
			valor++;

		}

	}
}