package Lista4_VetorMatriz;

import java.util.Scanner;

public class Exercicio1_Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int valores[] = new int[5];
		int x, maiorNumero = 0;

		for (x = 0; x < 5; x++) {
			System.out.print("Digite um valor: ");
			valores[x] = leia.nextInt();
		}
		System.out.println("\n");
		for (x = 0; x < 5; x++) {
			System.out.println("[" + valores[x] + "]");

			if (valores[x] > maiorNumero) {
				maiorNumero = valores[x];
			}

		}

		System.out.println("\n");
		System.out.println("O maior valor desse vetor é: " + maiorNumero);
	}

}
