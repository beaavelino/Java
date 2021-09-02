package Lista1_Basico;
import java.util.Scanner;

public class ExercicioJava1_Lista1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, idade;
		
			System.out.println("Quantos anos você tem: ");
			anos = leia.nextInt();
			System.out.println("Que mês você nasceu: ");
			meses = leia.nextInt();
			System.out.println("Que dia você nasceu: ");
			dias = leia.nextInt();
		
			idade = (anos*365)+(meses*30)+dias;
				
			System.out.println("Sua idade é aproximadamente "+idade+ " em dias");
		
	}	

}
