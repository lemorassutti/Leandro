package aula1;
import java.util.Scanner;
public class exercicio1 {

	public static void main(String[] args) {
		int valor1, valor2;
		float resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = ler.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = ler.nextInt();
		
		//Soma
		resultado = valor1 + valor2;
		System.out.println("a Soma dos valores é: " + resultado);
		
		resultado = valor1 - valor2;
		System.out.println("a Subtração dos valores é: " + resultado);
		
		resultado = valor1 * valor2;
		System.out.println("a Multiplicação dos valores é: " + resultado);
		
		resultado = valor1 / valor2;
		System.out.println("a Divisão dos valores é: " + resultado);
				
	}

}
