package aula2;
import java.util.Scanner;
public class case1 {

	public static void main(String[] args) {
		int n1, n2;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Número: ");
		n1=ler.nextInt();
		System.out.println("Digite o segundo Número: ");
		n2=ler.nextInt();
		
		if(n1>n2) {
			System.out.printf("Digite número %s é maior ",n1);
		}else if (n2>n1){
			System.out.printf("Digite número %s é maior ",n2);
		}else {
			System.out.println("Os números são iguais");
		}
		
	}

}
