package DesafiosEmAula;

import java.util.Scanner;

public class ExTriangulo2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base1, altura1, area1;
		double base2, altura2, area2;
		
		//entradas
		System.out.print("Digite a base 1: ");
		base1 = leia.nextDouble();
 		System.out.print("Digite a altura 1: ");
		altura1 = leia.nextDouble();
		
		area1 = ((base1*altura1)/2);
		System.out.printf("A area do triangulo é: %.2f",area1);
		
		//2
		
		System.out.print("\n\nDigite a base 2: ");
		base2 = leia.nextDouble();
 		System.out.print("Digite a altura 2: ");
		altura2 = leia.nextDouble();
		
		area2 = ((base2*altura2)/2);
		System.out.printf("A areas do triangulo é: %.2f",area2);
		
		if (area1==area2){
			System.out.print("\n\nTriangulos com area iguais!!");
		}
		else if (area1 > area2) {
			System.out.print("\n\nTriangulo 1 tem area maior que triangulo 2!!");
		}
		else {
			System.out.print("\n\nTriangulo 1 é menor que triangulo 2!!");
		}
	}

}
