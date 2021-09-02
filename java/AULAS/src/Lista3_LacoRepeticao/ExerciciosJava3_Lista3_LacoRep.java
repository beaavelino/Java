package Lista3_LacoRepeticao;

import java.util.Scanner;

public class ExerciciosJava3_Lista3_LacoRep {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int idade, idade21, idade50;
		
		idade = 0;
		idade21 = 0;
		idade50 = 0;
		
		System.out.print("Para parar o programa, digite a idade -99!!!\n\n");
		
		while(idade >= 0) {
			System.out.print("Informe a idade: \n");
			idade = leia.nextInt();
		
			if (idade < 21) {
				idade21 = idade21 + 1;
			}
			if (idade > 50) {
				idade50 = idade50 + 1;
			}
			if (idade == -99) {
				break;
			}

		}
		System.out.print("\nQuantidade de pessoas com idade: "+idade21);
		System.out.print("\nQuantidade de pessoas com idade: "+idade50);
		
}
}
