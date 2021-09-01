package List2;

import java.util.Scanner;

public class ExercicioJava2_Lista2 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o primeiro número: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro número: ");
		c = leia.nextInt();
		
		if(a==b && b==c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}
		else if(a<=b && b<=c) {
			System.out.printf("%d, %d, %d",a,b,c);
		}
		else if(a<=c && c<=b) {
			System.out.printf("%d, %d, %d",a,c,b);
		}
		else if(b<=a && b<=c && a<=c) {
			System.out.printf("%d, %d, %d",b,a,c);
		}
		else if(c<=a && c<=b && b<=a) {
			System.out.printf("%d, %d, %d",c,b,a);
		}
		else if(c<=a && c<=b && a<=b) {
			System.out.printf("%d, %d, %d",c,a,b);
		}
		else {
			System.out.printf("%d, %d, %d",b,c,a);
		}
		
}
}
