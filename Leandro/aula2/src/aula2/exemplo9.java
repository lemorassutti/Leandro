package aula2;
import java.util.Scanner;
public class exemplo9 {

	public static void main(String[] args) {
		String user, pass,userDefault, passDefault;
		
		userDefault="leandro";
		passDefault="123";
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite seu usuário: ");
		user = ler.nextLine();
		System.out.println("Digite sua senha: ");
		pass = ler.nextLine();
		
		if (user.equals(userDefault)&&pass.equals(passDefault)) {
			System.out.printf("Usuário %s logado com sucesso",user);
		}else {
			System.out.println("Usuário inválido");
		}
	}

}
