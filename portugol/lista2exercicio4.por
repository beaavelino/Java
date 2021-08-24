/*(4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se 
 * este número é par ou ímpar, e se é positivo ou negativo.
 */
programa
{
	
	funcao inicio()
	{
		inteiro numero
		escreva("Escreva um número: ")
		leia (numero)
		se(numero ==0){
			escreva ("ZERO É NEUTRO")
		}
		senao se (numero < 0 e numero % 2 == 0){
			escreva ("O número " +numero+ " é negativo e par")
		}
		senao se (numero > 0 e numero % 2 == 0){
	 		escreva("O número " +numero+ " é positivo e par")
		}
		senao se (numero > 0 e numero % 2 == 1){
	 		escreva("O número " +numero+ " é positivo e impar")
		}
		senao {
			escreva("O número " +numero+ " é negativo e impar")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */