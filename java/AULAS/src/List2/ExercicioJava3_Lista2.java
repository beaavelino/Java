package List2;

import java.util.Scanner;

public class ExercicioJava3_Lista2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.print("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >=10 && idade <=14) {
			System.out.println("Você está na categoria infantil !!");
		}
		else if (idade >=15 && idade <=17) {
			System.out.println("Você está na categoria juvenil !!");
		}
		else if (idade >=18 && idade <=25) {
			System.out.println("Você está na categoria adulto !!");
		}
		else {
			System.out.println("Você está fora das categorias !!");
		}
	}

}
