package aula3;

import javax.swing.JOptionPane;

public class case1 {

	public static void main(String[] args) {
		
		//-----------------Variaveis-------------------------
		String nome, sSaldo, sOp, sSaque,  sSN, sConta = null;
		double saldo, saque, juros;
		int qtdSaque = 0;
		//-----------------Variaveis-------------------------
		
		//****************************************Menu*****************************************************
		nome = JOptionPane.showInputDialog("Insira o nome do cliente: ");
		sSaldo = JOptionPane.showInputDialog("Qual o saldo do cliente: ");
		saldo = Float.parseFloat(sSaldo);
		JOptionPane.showMessageDialog(null, "O cliente " + nome + " possui um saldo de R$" + saldo);
		sOp = JOptionPane.showInputDialog(
				nome + "Selecione a Op��o desejada \n1 - Extrado \n2 - Saque \n3 - Deposito \n4 - Transferencia \n5 - Sair");
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
						sSN = JOptionPane.showInputDialog("Voce possui um emprestimo preaprovado com juros de 11%, deseja contrat�-lo? (s/n)");
						if(sSN.equals("s")) {
							sSaque = JOptionPane.showInputDialog("Qual valor pretende emprestar? ");
							saque=Float.parseFloat(sSaque);
							juros = saque*0.11;
							saldo = saldo+saque;
							JOptionPane.showMessageDialog(null,"Seu saldo atual � "+saldo+" e voc� ter� um juros de "+juros);
							break;
						}
						
					}else
						saldo = saldo-saque;
						qtdSaque++;
					break;
				}else {
					JOptionPane.showMessageDialog(null,"Quantidade de saques di�rias expirou o limite de 3");
					break;
				}
				//****************************************DEPOSITO*****************************************************
			case ("3"):
				
				sSaque = JOptionPane.showInputDialog("Qual o valor � depositar? ");
				saque=Float.parseFloat(sSaque);
				saldo = saldo+saque;
				break;
				//****************************************Transfer�ncia****************************************************
			case ("4"):
				
				sSaque = JOptionPane.showInputDialog("Qual o valor � Transferir? ");
				saque=Float.parseFloat(sSaque);
				
				if (saque > saldo) {
					JOptionPane.showMessageDialog(null,"Saldo insuficiente para tranferencia");
				}else
					sConta = JOptionPane.showInputDialog("Digite a conta que deseja transferir ");
					
					saldo = saldo-saque;
					
					JOptionPane.showMessageDialog(null,"Transferencia realizada com sucesso para conta "+sConta+ "seu saldo atua � de "+saldo);
				break;
				//****************************************SAIR*****************************************************	
			default:
				System.out.println("ERRO Digite um numero de 1 � 5");
				break;
			
			}
			sOp = JOptionPane.showInputDialog(
					nome + "Selecione a Op��o desejada \n1 - Extrado \n2 - Saque \n3 - Deposito \n4 - Transferencia \n5 - Sair");
		}
	
	}

}
