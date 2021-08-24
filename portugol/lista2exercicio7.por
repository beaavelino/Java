programa
{
	
	funcao inicio()
	{
		//variaveis
		real base, altura, area
		
		//entradas
		escreva("Digite a base: ")
		leia(base)
		escreva("Digite a altura: ")
		leia(altura)
		se (base <=0){
			escreva("Impossível realizar, valor incorreto")
		}
		senao se (altura <=0){
			escreva("Impossível realizar, valor incorreto")
		}
		senao {
			area = ((base*altura)/2)
			escreva("A area do triangulo é ",area)
		}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */