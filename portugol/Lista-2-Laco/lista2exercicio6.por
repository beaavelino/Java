programa
{
	
	funcao inicio()
	{
		inteiro idade

		escreva("DIgite a idade do nadador: ")
		leia(idade)

		se (idade >= 5 ou idade <7){
			escreva("Categoria infantil A")
		}
		senao se (idade >= 8 ou idade <11){
			escreva("Categoria infantil B")
		}
		senao se (idade >= 12 ou idade <13){
			escreva("Categoria juvenil A")
		}
		senao se (idade >= 14 ou idade <17){
			escreva("Categoria juvenil B")
		}
		senao (idade >=18 ){
			escreva("Categoria Adulto")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */