package DesafiosEmAula;

import java.util.Scanner;

public class ExTriangulo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double base, altura, area;
		
		//entradas
		System.out.print("Digite a base: ");
		base = leia.nextDouble();
 		System.out.print("Digite a altura: ");
		altura = leia.nextDouble();
		if (base <=0){
			System.out.print("Impossível realizar, valor incorreto");
		}
		else if(altura <=0){
			System.out.print("Impossível realizar, valor incorreto");
		}
		else {
			area = ((base*altura)/2);
			System.out.printf("A area do triangulo é: %.2f",area);
		}
	}

}
