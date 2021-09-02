package DesafiosEmAula;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		String par, impar;
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if(num == 0) {
			System.out.println("O numero é nêutro");
		}
		else if(num<0) {
			System.out.println("Número negativo");
		}
		else if((num%2)==0){
			System.out.println("Número par");
		}
		else{
			System.out.println("Número impar");
		}
		}
		
}

