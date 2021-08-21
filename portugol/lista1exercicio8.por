programa
{
	
	funcao inicio()
	{
		real custoDeFabrica
		real porcenDistribuidor
		real porcenImpostos
		real custoAoConsumidor
		
		escreva("Qual o custo de fabrica? ")
		leia (custoDeFabrica)
		porcenDistribuidor = custoDeFabrica * 0.28
		porcenImpostos = custoDeFabrica * 0.45
		custoAoConsumidor = custoDeFabrica + porcenDistribuidor + porcenImpostos
		escreva("O custo ao consumidor é: " + custoAoConsumidor)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */