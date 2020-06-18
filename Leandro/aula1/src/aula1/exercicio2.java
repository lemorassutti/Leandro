package aula1;
import java.util.Scanner;
public class exercicio2 {

	public static void main(String[] args) {
		double km, litros, consumo;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos quilometros você rodou? ");
		km = ler.nextDouble();
		
		System.out.println("Quantos litros de combustível foi consumido? ");
		litros = ler.nextDouble();
		
		consumo = km/litros;
		
		System.out.println("O consumo médio do seu veículo é " + consumo);
		
	}

}
