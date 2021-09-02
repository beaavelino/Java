/*(2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de 
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento 
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de 
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário 
excedente.
/*
 * 
 */
programa
{
	
	funcao inicio()
	{
		real C // código
		real N // horas
		real E // excesso
		real salario
		real valorE
		real Total

		escreva("Qual é o seu código: ")
		leia(C)
		escreva("Quantas horas você trabalhou: ")
		leia(N)
		se (N < 50.00){
			salario = (N*10.00)
			escreva("Funcionário ",C, ", seu salário será de: ",salario, " reais. Você não possui horas excedentes.")		
		}
		senao{
			E = (N - 50.00)
			valorE = (E*20.00)
			salario = (50.00*10.00)
			Total = (valorE+salario)
			escreva("Funcionário ",C,", seu salário será de: ",Total," reais. Você tem ",E," horas excedentes.")
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 833; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */