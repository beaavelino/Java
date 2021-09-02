package Lista3_LacoRepeticao;

import java.util.Scanner;

public class ExerciciosJava6_Lista3_LacoRep {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		double media=0.0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			System.out.println();
			
			if(numero > 0 && numero % 3 == 0) {
				soma += numero;	
				contador++;
			}
			
		} while(numero > 0);
		
		media = soma / contador;		
		System.out.print("A média dos números digitados múltiplos de três é: " + media);
	}

}
