package aula3;
import java.util.Scanner;
public class exemploFor4 {

	public static void main(String[] args) {
		String aluno;
		float nt1, nt2, media;
		Scanner ler = new Scanner(System.in);
		
		for (int i = 1; i<=15; i++) {
			System.out.println("Informar o nome do aluno: ");
			aluno = ler.next();
			System.out.println("Informar a primeira nota de "+aluno);
			nt1 = ler.nextFloat();
			System.out.println("Informar a segunda nota de "+aluno);
			nt2 = ler.nextFloat();
			
			media = (nt1+nt2)/2;
			System.out.println("As notas de "+aluno+" é: "+nt1+" e "+nt2+ " e sua média é "+ media);
		}

	}

}
