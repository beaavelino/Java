import java.util.Scanner;

public class OiMundo {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento;
		int anoAtual=2021;
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento");
		anoNascimento = leia.nextInt();
		
		System.out.println(nome+" sua idade é "+(anoAtual - anoNascimento)+"ano");
		
	}
	
	
}
