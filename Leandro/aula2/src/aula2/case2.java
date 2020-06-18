package aula2;
import javax.swing.JOptionPane;
public class case2 {

	public static void main(String[] args) {
		
		String a,b,sn;
		double salario, saldo, atual, saque, emprestimo;
		
		salario= 5000;
		saldo = 1000;
		
		a = JOptionPane.showInputDialog("Qual o valor de saque desejado?");
		saque=Float.parseFloat(a);
		
		if(saque<saldo) {
			atual = saldo-saque;
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso, seu saldo atual é: "+ atual);	
		}
		else {
			JOptionPane.showMessageDialog(null, "Saldo insuficiente para operação");
			emprestimo = salario*0.05;
			JOptionPane.showMessageDialog(null, "Você possui um empréstimo aprovado no valor de R$"+emprestimo);
			sn = JOptionPane.showInputDialog("Deseja contratar o emprestimo? S/N");
			if(sn.equals("S")) {
				saldo = saldo+emprestimo;
				atual = saldo-saque;
				JOptionPane.showMessageDialog(null, "Saque realizado com sucesso, seu saldo atual é: "+ atual);
			}else {
				JOptionPane.showMessageDialog(null, "Operação finalizada");
			}
		}
	}

}
