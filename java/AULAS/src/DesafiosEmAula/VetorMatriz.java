package DesafiosEmAula;

import java.util.Scanner;

public class VetorMatriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//String nome[] = new String [4]; - 1� OP��O
		
		String nome[] = {"MARCOS", "PAULO", "PEDRO", "JOS�"};
		int notas[] = new int [4];
		
		System.out.println("Qual o tamanho da posi��o 0 "+nome[0].length());
		
		System.out.println("Tamanho do vetor "+nome.length);
		
		for (int x=0; x<4; x++) {
			System.out.print("Alune : "+nome[x]+" informe a nota: ");
			notas[x] = leia.nextInt();
			
			
		}
		
	}

}
