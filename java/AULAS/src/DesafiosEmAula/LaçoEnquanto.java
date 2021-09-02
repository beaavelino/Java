package DesafiosEmAula;

import java.util.Scanner;

public class LaçoEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		double somatorio = 0.0, media, total = 0.0, n = 0.0;

		while (n >= 0) {
			System.out.print("Digite o numero a ser somado: ");
			n = leia.nextDouble();
			if (n < 0) {
				break;
			}
			somatorio = somatorio + n;
			total = total + 1;

		}
		System.out.print("A somatória dos numeros digitados é de: " + somatorio);
		media = somatorio / total;
		System.out.printf("\nA média dos valores digitados é de: " + media);
		System.out.print("\nO total de numeros digitados é de: " + total);
	}

}
