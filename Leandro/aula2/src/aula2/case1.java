package aula2;
import java.util.Scanner;
public class case1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro N�mero: ");
		n1=ler.nextInt();
		System.out.println("Digite o segundo N�mero: ");
		n2=ler.nextInt();
		
		if(n1>n2) {
			System.out.printf("Digite n�mero %s � maior ",n1);
		}else if (n2>n1){
			System.out.printf("Digite n�mero %s � maior ",n2);
		}else {
			System.out.println("Os n�meros s�o iguais");
		}
		
	}

}
