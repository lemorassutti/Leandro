package aula2;
import java.util.Scanner;
public class exemplo4 {

	public static void main(String[] args) {
		double nota1,nota2,media;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		nota1=ler.nextDouble();
				
		System.out.println("Digite a segunda nota: ");
		nota2=ler.nextDouble();
		
		media=(nota1+nota2)/2;
		
		if (media>=7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}

	}

}
