package aula1;
import java.util.Scanner;
public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double real, dolar, cotacao;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual valor em real? ");
		real = ler.nextDouble();
		
		System.out.println("Qual a cota��o atual do dolar? ");
		cotacao = ler.nextDouble();
		
		dolar = real/cotacao;
		
		System.out.println("Voc� possui US$" + dolar);
		
		
		
	}

}
