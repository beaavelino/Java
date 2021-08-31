import java.util.Scanner;

public class CelsiusFahrenheit {
		
		public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			double celsius, fahrenheit, temperatura;
			String nome;
			
			System.out.println("Qual é o seu nome: ");
			nome = leia.next();
			
			System.out.println("Digite a temperatura em Celsius");
			celsius = leia.nextDouble();
			
			fahrenheit = (((celsius * 9)/5) + 32);
			
			System.out.println("A conversão é: "+fahrenheit);
			
		}	
		
}		
