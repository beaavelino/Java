package DesafiosEmAula;

import java.util.Scanner;

public class La�oEnquanto {

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
		System.out.print("A somat�ria dos numeros digitados � de: " + somatorio);
		media = somatorio / total;
		System.out.printf("\nA m�dia dos valores digitados � de: " + media);
		System.out.print("\nO total de numeros digitados � de: " + total);
	}

}
