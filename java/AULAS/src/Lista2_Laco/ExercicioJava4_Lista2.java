package Lista2_Laco;

import java.util.Scanner;

public class ExercicioJava4_Lista2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		String nome;
		double numero, raizQuadrada, elevadoQuadrado;
		
		System.out.print("Digite um numero: ");
		numero = leia.nextDouble();
		
		raizQuadrada = Math.sqrt(numero);
		elevadoQuadrado = (numero * numero);
		
		if(numero==0){
			System.out.println("Numero neutro");
		}
			else if (numero%2!=0) {
			System.out.println("N�mero � impar e esse numero elevado ao quadrado �: " + elevadoQuadrado);
		}
		else if (numero%2==0) {
			System.out.println("Numero � par e sua raiz quadrada �: " + raizQuadrada);
		
		}
	}

}