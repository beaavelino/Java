package List1;
import java.util.Scanner;

public class ExercicioJava2_Lista1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int dias, mes, idade, diasNas;
		
		System.out.println("Quantos dias você de vida você tem: ");
		diasNas = leia.nextInt();
		
		idade = diasNas/365;
		mes = (diasNas%365)/30;
		dias = (diasNas%365)%30;
		
		System.out.println("Sua idade é: "+idade+", você nasceu no mês "+mes+", no dia "+dias);
		
		
		
		
		System.out.println("");
		
	}

}
