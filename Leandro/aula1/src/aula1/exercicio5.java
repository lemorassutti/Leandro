package aula1;
import java.util.Scanner;
public class exercicio5 {

	public static void main(String[] args) {
		double valor, rendimento;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual valor depositado? ");
		valor = ler.nextDouble();
		
		rendimento = valor +(valor* 0.007);
		System.out.println("Em um mês você terá: R$" + rendimento);

	}

}
