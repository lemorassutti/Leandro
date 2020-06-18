package aula3;

import javax.swing.JOptionPane;

public class case1 {

	public static void main(String[] args) {
		
		//-----------------Variaveis-------------------------
		String nome, sSaldo, sOp, sSaque;
		double salario, saldo, atual, saque, emprestimo;
		int qtdSaque = 0;
		//-----------------Variaveis-------------------------
		
		//****************************************Menu*****************************************************
		nome = JOptionPane.showInputDialog("Insira o nome do cliente: ");
		sSaldo = JOptionPane.showInputDialog("Qual o saldo do cliente: ");
		saldo = Float.parseFloat(sSaldo);
		JOptionPane.showMessageDialog(null, "O cliente " + nome + " possui um saldo de R$" + saldo);
		sOp = JOptionPane.showInputDialog(
				nome + "Selecione a Opção desejada \n1 - Extrado \n2 - Saque \n3 - Deposito \n4 - Transferencia \n5 - Sair");
		//****************************************Menu*****************************************************
		while(!sOp.equals("5")) {
			
		
			switch (sOp) {
			//****************************************EXTRATO*****************************************************	
			case ("1"):

				JOptionPane.showMessageDialog(null,
					"EXTRATO \n" + nome + "\n Saldo: R$" + saldo + " Quantidade de saques do dia: " + qtdSaque);
				break;
			//****************************************SAQUE*****************************************************	
			case ("2"):
				
				if (qtdSaque <3){
					
					sSaque = JOptionPane.showInputDialog("Qual o valor de saque desejado?");
					saque=Float.parseFloat(sSaque);
					if (saque > saldo) {
						JOptionPane.showMessageDialog(null,"Saldo insuficiente para retirada");
					}else
						saldo = saldo-saque;
						qtdSaque++;
					break;
				}else {
					JOptionPane.showMessageDialog(null,"Quantidade de saques diárias expirou o limite de 3");
					break;
				}
				//****************************************DEPOSITO*****************************************************
			case ("3"):
				
				sSaque = JOptionPane.showInputDialog("Qual o valor à depositar? ");
				saque=Float.parseFloat(sSaque);
				saldo = saldo+saque;
				break;
				//****************************************Transferência****************************************************
			case ("4"):
				
				sSaque = JOptionPane.showInputDialog("Qual o valor à Transferir? ");
				saque=Float.parseFloat(sSaque);
				if (saque > saldo) {
					JOptionPane.showMessageDialog(null,"Saldo insuficiente para tranferencia");
				}else
					
					saldo = saldo-saque;
				break;
				//****************************************SAIR*****************************************************	
			default:
				System.out.println("ERRO Digite um numero de 1 à 5");
				break;
			
			}
			sOp = JOptionPane.showInputDialog(
					nome + "Selecione a Opção desejada \n1 - Extrado \n2 - sacar \n3 - depoistar \n4 - sair");
		}
		/*
		 * if(saque<saldo) { atual = saldo-saque; JOptionPane.showMessageDialog(null,
		 * "Saque realizado com sucesso, seu saldo atual é: "+ atual); } else {
		 * JOptionPane.showMessageDialog(null, "Saldo insuficiente para operação");
		 * emprestimo = salario*0.05; JOptionPane.showMessageDialog(null,
		 * "Você possui um empréstimo aprovado no valor de R$"+emprestimo); sn =
		 * JOptionPane.showInputDialog("Deseja contratar o emprestimo? S/N");
		 * if(sn.equals("S")) { saldo = saldo+emprestimo; atual = saldo-saque;
		 * JOptionPane.showMessageDialog(null,
		 * "Saque realizado com sucesso, seu saldo atual é: "+ atual); }else {
		 * JOptionPane.showMessageDialog(null, "Operação finalizada"); }
		 */
	}

}
