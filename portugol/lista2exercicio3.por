/* (3)Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.

 */
programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, n4, t1, t2, t3, t4
		escreva("Digite o número 1: ")
		leia(n1)
		escreva("Digite o número 2: ")
		leia(n2)
		escreva("Digite o número 3: ")
		leia(n3)
		escreva("Digite o número 4: ")
		leia(n4)

		t1 = (n1 * n1)
		t2 = (n2 * n2)
		t3 = (n3 * n3)
		t4 = (n4 * n4)

		se(t3>=1000.00){
			escreva("Valor do número 3: ",t3)
		}
		senao{
			escreva("Valores de: ", t1+t2+t3+t4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 588; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */
