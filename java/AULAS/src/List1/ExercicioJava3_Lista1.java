package List1;
import java.util.Scanner;

public class ExercicioJava3_Lista1 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int horas, minutos, segundos, segEvento;
		
			System.out.println("Qual a duração do evento em segundo: ");
			segEvento = leia.nextInt();
			
			horas=segEvento/3600;
			minutos=(segEvento%3600)/60;
			segundos=(segEvento%3600)%60;
			
			System.out.println("O evento da fábrica teve duração de :"+horas+" horas, "+minutos+" minutos e "+segundos+" segundos");
			
	}	
}
