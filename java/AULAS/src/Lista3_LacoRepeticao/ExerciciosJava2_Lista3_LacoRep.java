package Lista3_LacoRepeticao;

import java.util.Scanner;

public class ExerciciosJava2_Lista3_LacoRep {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0;
		
		for(int x = 0; x<10; x++) {
			System.out.println("Digite um n�mero: ");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
				
			} else {
				impar++;
			}
		}
		
		System.out.printf("A quantidade de n�meros pares � igual a: %d\nA quantidade de n�meros �mpares � igual a: %d", par, impar);

		
		
		
		
	}

}
