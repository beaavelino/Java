/*A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias 
que são altamente poluentes do meio ambiente. O índice de poluição aceitável 
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas 
a suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo 
são intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem 
ser notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição 
medido e emita a notificação adequada aos diferentes grupos de empresas.
*/
// aceitável 0,05 até 0,25
// 0,3 - grupo 1 são intimados
// 0,4 - os grupos 1 e 2 são intimados
// 0,5 todos os grupos são intimados
programa
{
	
	funcao inicio()
	{
		//variaveis
		real indice
		
		//entradas
		escreva("Digite o indice de poluição atual: ")
		leia(indice)
		
		//processamentos
		se (indice <=0.25){
			escreva("Indice dentro do esperado")
		}
		senao se (indice <0.3){
			escreva("Não definido...")
		}
		senao se (indice >=0.3 e indice <0.4){
			escreva("Empresas do grupo 1 - Parem suas atividades")
		}
		senao se (indice >=0.4 e indice <0.5){
			escreva("Empresas do grupo 1 e 2 - parem suas atividades")
		}
		senao {
			escreva("Todas as empresas, parem suas atividades!")
		}
		//saidas
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1038; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */