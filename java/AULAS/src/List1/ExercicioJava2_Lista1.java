package List1;
import java.util.Scanner;

public class ExercicioJava2_Lista1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int dias, mes, idade, diasNas;
		
		System.out.println("Quantos dias voc� de vida voc� tem: ");
		diasNas = leia.nextInt();
		
		idade = diasNas/365;
		mes = (diasNas%365)/30;
		dias = (diasNas%365)%30;
		
		System.out.println("Sua idade �: "+idade+", voc� nasceu no m�s "+mes+", no dia "+dias);
		
		
		
		
		System.out.println("");
		
	}

}
