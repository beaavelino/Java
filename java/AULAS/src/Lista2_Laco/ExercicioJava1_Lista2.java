package Lista2_Laco;

import java.util.Scanner;

public class ExercicioJava1_Lista2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior n�mero �: "+n1);
		}
		else if(n2 > n1 && n2 > n3) {
			System.out.println("O maior n�mero �: "+n2);
		}
		else {
			System.out.println("O maior n�mero �: "+n3);
		}
	}

}
