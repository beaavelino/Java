//exercicio 2 do - Faça enquanto
programa
{
	
	funcao inicio()
	{
	//variaveis
	inteiro numeroTeclado=0
	inteiro contador=1
	inteiro total=0
	
	//entradas
	escreva("Digite um número inteiro positivo: ")
	leia(numeroTeclado)

	//processamento
	faca {
		escreva(contador)
		se(contador<numeroTeclado){
			escreva(" + ")
		}
		
		total = total + contador // totalizador
		contador = contador + 1
		
	} enquanto (contador<=numeroTeclado)
	//saida
	escreva(" = "+total)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */