package DesafiosEmAula;

import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num;
		String par, impar;
		
		System.out.print("Digite um n�mero: ");
		num = leia.nextInt();
		
		if(num == 0) {
			System.out.println("O numero � n�utro");
		}
		else if(num<0) {
			System.out.println("N�mero negativo");
		}
		else if((num%2)==0){
			System.out.println("N�mero par");
		}
		else{
			System.out.println("N�mero impar");
		}
		}
		
}

