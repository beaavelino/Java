programa {

	inclua biblioteca Util
	inclua biblioteca Matematica --> mat
	inclua biblioteca Texto
	inclua biblioteca Tipos
	

	inteiro carrinho[10] = {0,0,0,0,0,0,0,0,0,0}
	real	valor[10] = {119.99,799.99,109.99,380.99,539.99,649.99,850.99,999.99,220.99,950.99}
	inteiro estoque[10] = {10,10,10,10,10,10,10,10,10,10}
	real valorTotal=0.0, valorFinal=0.0, valorImposto=0.0
	real juros=0.0, taxaCartao=0.0
	inteiro tipoPagamento = 1
	real imposto = 0.00
	

	cadeia produtosNome[10] = {
		"Luminária de mesa",
		"Poltrona",
		"Abajur",
		"Estante",
		"Escrivaninha",
		"Cadeira de Escritório",
		"Cama", "Cadeira Gamer",
		"Mesa de centro",
		"Sofá"
	}

	funcao inicio() {
		paginaPrincipal()

	}

	funcao vazio paginaPrincipal(){
		caracter resposta = 'a'

		enquanto (resposta != 'S' e resposta != 's' e resposta != 'N' e resposta != 'n') {
			cabecalho()
			escreva("Olá, deseja comprar algo? ")
			pular()
			pular()
			escreva("S/N? : ")
			leia(resposta)
			pular()
		}
		
		se (resposta == 'S' ou resposta == 's'){
			cabecalho()
			pular()
			escreva("Iremos te apresentar agora os nossos" + "\n" + "produtos!\n")
			linha()
			Util.aguarde(2000)
			limpa()
			desenho()
			menuCarrinho()
			
		} 
		senao se (resposta == 'N' ou resposta == 'n'){
			cabecalho()
			pular()
			escreva("Até breve!!\n")
			linha()
			Util.aguarde(2000)
			limpa()
			
		}
	}

	funcao agradece(){
		escreva("Obrigada por comprar com a Devs de int[e]=riores\n")
	}
	
	funcao despede(){
		escreva("Obrigada por vir à Devs de int[e]=riores\n")
	}

	funcao cabecalho(){
	limpa()
	linha()
	nome()
	slogan()
	linha()
	pular()
	}
	
	funcao nome(){
		escreva("---Bem-vinde à Devs de int[e]=riores----\n")
	}

	funcao slogan(){
		escreva("-------Programando o seu conforto!------\n")
	}
	
	funcao linha(){
		escreva("----------------------------------------\n")
	}
	
	funcao pular(){
		escreva("\n")
	}

	

	funcao menu()
	{	
		//variaveis
		inteiro codigo[10] = {1,2,3,4,5,6,7,8,9,10}, codigoDigitado
		cadeia produto[10] = {
			"Luminaria de Mesa             ",
			"Poltrona                      ",
			"Abajur                        ",
			"Estante                       ",
			"Escrivaninha                  ",
			"Cadeira de escritório         ",
			"Cama Box                      ",
			"Cadeira Gamer                 ",
			"Mesa de centro                ",
			"Sofá                         "
		}
		inteiro quantidadeDesejada
		caracter s, n, opcaoCompra

		cabecalho()
		
			escreva("\n\t\tLISTA DE PRODUTOS DISPONIVEIS\n\n")
			escreva("CÓDIGO    ", "PRODUTO                       ", "VALOR           ", "ESTOQUE\n")
			
			
			para (inteiro x=0; x<10; x++)
			{
				
				escreva("G5-",codigo[x],"       ",produto[x],"R$ ",mat.arredondar(valor[x], 2),"         ",estoque[x],"\n")
			}
	}

	funcao menuCarrinho(){

		inteiro codigoLer = 1, quantidade = 0,
		unidade = 0 
	
		inteiro x=0
		enquanto(codigoLer!= (-1)){
			menu()
			escreva("\n")			
			itensNoCarrinho()			
			escreva("Digite o código do produto a ser adicionado ao carrinho" + "\n"  + "ou aperte '0' para encerrar compra: ")
			escreva("G5-")			
			leia(codigoLer)
			
				codigoLer = codigoLer -1
				
				se(codigoLer != -1){
					se(codigoLer>=10){
						escreva("Desculpe, código inválido!\n")
						Util.aguarde(4000)
					}
					senao se(estoque[codigoLer]<=10){
						escreva("Qual a quantidade?: ")
						leia(quantidade)
	
						se(quantidade<=estoque[codigoLer]){
						unidade = estoque[codigoLer] - quantidade
						carrinho[codigoLer] = carrinho[codigoLer] + quantidade
						}
						senao{
							escreva("Desculpe, mas nosso estoque não possui essa quantidade\n")
							escreva("Quantidade disponivel em estoque: ", estoque[codigoLer]) 
							Util.aguarde(5000)
						}
					}					
				}
			senao{
				limpa()
				pare
			}

			limpa()
		}
		finalcompra()
	}

	funcao itensNoCarrinho() {
		escreva("CARRINHO DE COMPRAS\n")
		escreva("Item                    Un      VlrUn      VlrTotal\n")
		para (inteiro i = 0; i < 10; i++) {
			se (carrinho[i] != 0) {
				escreva(produtosNome[i])
				escreveEspaco(24 - Texto.numero_caracteres(produtosNome[i]))
				escreva(carrinho[i] + "       " + valor[i] + "      "+mat.arredondar((valor[i]*carrinho[i]), 2)+"\n")
			}
		}

		escreva("\n")
	}

	funcao vazio finalcompra()
	{
		cadeia pressione=""

		para (inteiro x=0; x<10;x++){			
			
			valorTotal=valorTotal+(carrinho[x]*valor[x])
		}
		valorImposto=valorTotal*.09
		
		cabecalho()
		
		escreva("O valor do seu carrinho é de: R$"+mat.arredondar(valorTotal,2)+"\n")
		escreva("O valor de imposto é de:      R$"+mat.arredondar(valorImposto, 2),"\n")
		escreva("\n\n\nPressione 'Enter' para continuar.")
		leia(pressione)
		cabecalho()
		linha()
		escreva("Escolha uma opção de pagamento:\n")
		linha()
		escreva("\n1 - Á vista   - Promoção de 10% de Desconto!")
		escreva("\nSai por: R$"+mat.arredondar(valorTotal*0.9,2))
		escreva("\n\n2 - No cartão     - Acrécimo de 10% de Taxa!")
		escreva("\nSai por: R$"+mat.arredondar(valorTotal*1.1,2))
		escreva("\n\n3 - Em 2x - Acrécimo de 15% de Juros e Taxa!")
		escreva("\nSai por 2x de: R$"+mat.arredondar(valorTotal*0.575,2)+" Total: R$"+mat.arredondar(valorTotal*1.15,2))
		escreva("\n::>")
		leia(tipoPagamento)
		
		enquanto (tipoPagamento!=1 e tipoPagamento!=2 e tipoPagamento!=3){
			cabecalho()
			escreva("Código Incorreto, digite '1','2' ou '3', sendo:\n")
			escreva("\n1 - Á vista   - Promoção de 10% de Desconto!")
			escreva("\nSai por: R$"+mat.arredondar(valorTotal*0.9,2))
			escreva("\n\n2 - No cartão     - Acrécimo de 10% de Taxa!")
			escreva("\nSai por: R$"+mat.arredondar(valorTotal*1.1,2))
			escreva("\n\n3 - Em 2x - Acrécimo de 15% de Juros e Taxa!")
			escreva("\nSai por 2x de: R$"+mat.arredondar(valorTotal*0.575,2)+" Total: R$"+mat.arredondar(valorTotal*1.15,2))
			escreva("\n::>")
			leia(tipoPagamento)
		}
		
		se (tipoPagamento==1){
			valorFinal=valorTotal*0.9
		}
		senao se (tipoPagamento==2){
			valorFinal=valorTotal*1.1
			taxaCartao = valorTotal * 0.1
		}
		senao {
			valorFinal=  valorTotal*1.15
			taxaCartao = valorTotal*0.10
			juros = valorTotal * 0.05
		}
		cabecalho()
		escreva("Pagamento efetuado no valor de: "+mat.arredondar(valorFinal,2))
		pular()
		linha()
		escreva("Aguarde a emissão da nota Fiscal!!")
		Util.aguarde(2000)
		
		cadeia ce[]={"▒","▒","▒","▒","▒","▒","▒","▒","▒","▒"}
		para (inteiro x=0; x<10;x++){
			cabecalho()
			pular()
			escreva("Imprimindo nota fiscal...\n")
			escreva(ce[0]+ce[1]+ce[2]+ce[3]+ce[4]+ce[5]+ce[6]+ce[7]+ce[8]+ce[9])
			ce[x]="█"
			Util.aguarde(500)
			
		}

		
		cabecalho()
		pular()
		escreva("Agradecemos pela compra!!\n")

		limpa()
		imprimeNota()
		
	}

	funcao vazio imprimeNota()
	{
		cabecalho()
		
		escreva("              NOTA FISCAL\n")
		escreva("---------------------------------------\n")
		escreva("Items                   QtdeUn  VlrUnit\n\n")
		
		para (inteiro i = 0; i < 10; i++) {
			se (carrinho[i] != 0) {
				escreva(produtosNome[i])
				escreveEspaco(24 - Texto.numero_caracteres(produtosNome[i]))
				escreva(carrinho[i] + "       " + valor[i] + "\n")
			}
		}
		
		escreva("\n---------------------------------------\n")
		escreva("Imposto:" + retornaEspacos(valorImposto, 3) + mat.arredondar(valorImposto,2) + "\n")
		se (tipoPagamento == 1) {
			escreva("Desconto:" + retornaEspacos(valorTotal*0.1, 5) + mat.arredondar(valorTotal*0.1,2) + "\n\n")
		}

		se (tipoPagamento == 2) {
			escreva("Taxa:" + retornaEspacos(taxaCartao, 5) + mat.arredondar(taxaCartao,2) + "\n\n")
		}
		
		se (tipoPagamento == 3) {
			escreva("Juros do cartao:" + retornaEspacos(juros, 16) + mat.arredondar(juros,2) + "\n")
			escreva("Taxa:" + retornaEspacos(taxaCartao, 5) + mat.arredondar(taxaCartao,2) + "\n\n")
		}
		
		real total = mat.arredondar(calculaTotal(), 2)
		escreva("\nTotal:" + retornaEspacos(valorFinal, 3) + mat.arredondar(valorFinal,2) + "\n")

		retiraItensEstoque()

		zeraCarrinho()
		cadeia pressione=""
		escreva("\n\n\nPressione 'Enter' para voltar ao menu principal.")
		leia(pressione)
		paginaPrincipal()
	}

	funcao cadeia retornaEspacos(real numReal, inteiro offset) {
		inteiro quantidade = Texto.numero_caracteres(Tipos.real_para_cadeia(numReal)) + offset
		cadeia espacos = ""
		retorne Texto.preencher_a_esquerda(' ', (37 - quantidade), espacos)
	}

	
	funcao vazio escreveEspaco(inteiro quantidade) {
		para (inteiro i = 0; i < quantidade; i++) {
			escreva(" ")
		}
	}

	funcao real calculaTotal() {
		real total = 0.0
		para (inteiro i = 0; i < 10; i++) {
			total += carrinho[i] * valor[i]
		}
		
		retorne total
	}

	funcao vazio retiraItensEstoque() {
		para (inteiro i = 0; i < 10; i++) {
			estoque[i] -= carrinho[i]
		}
	}

	funcao vazio zeraCarrinho() {
		para (inteiro i = 0; i < 10; i++) {
			carrinho[i] = 0
		}
	}
	funcao desenho() {
		escreva("\n\n         /@@@@@@@@@@@@@@@@@@@@@@@%                ,///  &@@@@@@@@@@@@@@@@@@( \n")  Util.aguarde(100)    
		escreva("	 /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.          ,///  &@@@@@@@@@@@@@@@@@@( \n")   Util.aguarde(100)    
		escreva("	 /@@@@@@@@&*@@@@@@@@@@@@*  @@@@@@@,       ,///  &@@@@@@@@/%@@@@@@@@( \n")  Util.aguarde(100)     
		escreva("	 /@@@@@@@@&*@@@@@@@@@@@@@@@@@..@@@@@*     ,///  &@@@@@@@@/%@@@@@@@@( \n")   Util.aguarde(100)    
		escreva("	      @@@@&*@@@@         &@@@@@@ @@@@@    ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@            @@@@@ &@@@@   ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@             .@@@@ @@@@%  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@              @@@@#(@@@@  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@              @@@@#*@@@@  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@              @@@@#*@@@@  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@              @@@@#*@@@@  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@              @@@@#*@@@@  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@              @@@@*&@@@@  ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@             @@@@@ @@@@   ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("	      @@@@&*@@@@           @@@@@# @@@@*   ,///       @@@@/%@@@@      \n")      Util.aguarde(100) 
		escreva("         *&&&&@@@@&*@@@@&&&&&@@@@@@@@@% @@@@@     ,///  %&&&&@@@@/%@@@@&&&&/ \n")      Util.aguarde(100) 
		escreva("	 /@@@@@@@@&*@@@@@@@@@@@@@@@. @@@@@@*      ,///  &@@@@@@@@/%@@@@@@@@( \n")      Util.aguarde(100) 
		escreva("	 /@@@@,,,,,,,,,,,,,,,,/&@@@@@@@@@         ,///  &@@@@,,,,,,,,,,@@@@( \n")      Util.aguarde(100) 
		escreva("	 /@@@@@@@@@@@@@@@@@@@@@@@@@@@             ,///  &@@@@@@@@@@@@@@@@@@( \n\n")   Util.aguarde(100) 
		Util.aguarde(2000)
		limpa()	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10927; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */