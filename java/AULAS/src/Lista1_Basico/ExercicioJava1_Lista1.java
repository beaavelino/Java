package Lista1_Basico;
import java.util.Scanner;

public class ExercicioJava1_Lista1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, idade;
		
			System.out.println("Quantos anos voc� tem: ");
			anos = leia.nextInt();
			System.out.println("Que m�s voc� nasceu: ");
			meses = leia.nextInt();
			System.out.println("Que dia voc� nasceu: ");
			dias = leia.nextInt();
		
			idade = (anos*365)+(meses*30)+dias;
				
			System.out.println("Sua idade � aproximadamente "+idade+ " em dias");
		
	}	

}
