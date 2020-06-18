package aula2;
import java.util.Scanner;
public class case3 {

	public static void main(String[] args) {
		int op;
		float vl1, vl2,res;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero:");
		vl1 = ler.nextFloat();
		
		System.out.println("Digite o segundo numero:");
		vl2 = ler.nextFloat();

		System.out.println("|***************************************|");
		System.out.println("|       Calculadora Leandro CASE3       |");
		System.out.println("|                  MENU                 |");
		System.out.println("|1 - SOMA                               |");
		System.out.println("|2 - SUBTRAÇÃO                          |");
		System.out.println("|3 - MULTIPLICAÇÃO                      |");
		System.out.println("|4 - DIVISÃO                            |");
		System.out.println("|                                       |");
		System.out.println("|***************************************|");
		
		op = ler.nextInt();
		
		if(op == 1) {
			
			res = vl1+vl2;
			System.out.println("O resultado da soma de "+vl1+" + "+ vl2+" é "+ res);
			
		}else if (op == 2) {
			res = vl1-vl2;
			System.out.println("O resultado da subtração de "+vl1+" - "+ vl2+" é "+ res);
		}else if (op == 3) {
			res = vl1*vl2;
			System.out.println("O resultado da multiplicação de "+vl1+" x "+ vl2+" é "+ res);
		}else if (op == 4) {
			res = vl1/vl2;
			System.out.println("O resultado da subtração de "+vl1+" / "+ vl2+" é "+ res);	
		}else {
			System.out.println("Opção inválida");	
		}
	}

}
