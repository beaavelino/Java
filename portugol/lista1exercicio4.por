programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real A
		real B
		real C
		real D, R, S

		escreva("Digite o primeiro número inteiro: ")
		leia(A)
		escreva("Digite o segundo número inteiro: ")
		leia(B)
		escreva("Digite o terceiro número inteiro: ")
		leia(C)

		R = Matematica.potencia((A+B),2)
		S = Matematica.potencia((B+C),2)
		D = (R+S)/2

		escreva("O resultado de D é: "+D)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 404; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */