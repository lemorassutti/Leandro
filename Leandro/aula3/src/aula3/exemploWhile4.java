package aula3;
import java.util.Scanner;
public class exemploWhile4 {

	public static void main(String[] args) {
		String aluno;
		float nt1, nt2, media = 0, smedia;
		int cont=0;
		Scanner ler = new Scanner(System.in);
		smedia=0;
		
		while(smedia<40) {
			
			cont++;
			System.out.println("insira o nome do aluno: ");
			aluno = ler.next();
			
			System.out.println("insira a primeira nota do aluno "+aluno);
			nt1 = ler.nextFloat();
		
			System.out.println("insira a segunda nota do aluno "+aluno);
			nt2 = ler.nextFloat();
			
			
			media = (nt1+nt2)/2;
			smedia = smedia+media;
			media = smedia/cont;		
		}

		System.out.println("Foram realizados a media de "+cont+"alunos e a média da sala foi "+media);
	}

}
