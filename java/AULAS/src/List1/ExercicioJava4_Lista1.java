package List1;
import java.util.Scanner;


public class ExercicioJava4_Lista1 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int A, B, C, R, S, D;
		
		System.out.println("Escreva o inteiro de A: ");
		A = leia.nextInt();
		System.out.println("Escreva o inteiro de B: ");
		B = leia.nextInt();
		System.out.println("Escreva o inteiro de C: ");
		C = leia.nextInt();
		
		R = (int) (Math.pow(A + B, 2));
		S = (int) (Math.pow(B + C, 2));
		D = (int) (R + S)/2;
		
		System.out.println("O resultado de D é: "+D);
		
		
}
}
