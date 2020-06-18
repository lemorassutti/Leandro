package aula1;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String vendedor;
		double fixo, vendas, comissao, percent;
		percent = 0.15;
				
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome do vendedor: ");
		vendedor = ler.next();
		
		
		ler = new Scanner(System.in);
		System.out.println("Qual o salario fixo do vendedor: ");
		fixo = ler.nextFloat();
		
		ler = new Scanner(System.in);
		System.out.println("Qual o valor de vendas do "+ vendedor);
		vendas = ler.nextFloat();
		
		comissao = (vendas * percent)+fixo;
		
		System.out.println("O vendedor "+ vendedor + "tem o salario fixo de R$" + fixo + "\nSeu salario nesse mês será: R$"+comissao);
	}

}
