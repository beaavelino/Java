package ProjetoDevInteriores;

import java.util.Scanner;

public class NotaFiscalQR {
	Scanner leia = new Scanner(System.in);
	
	static String produtosNome[] = {
			"Luminária de mesa     ",
			"Poltrona              ",
			"Abajur                ",
			"Estante               ",
			"Escrivaninha          ",
			"Cadeira de Escritório ",
			"Cama                  ", 
			"Cadeira Gamer         ",
			"Mesa de centro        ",
			"Sofá                  " };
	
	static int estoque[] = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; //exemplo
	static int carrinho[] = {1, 3, 5, 6, 2, 8, 1, 4, 2, 1}; //exemplo
	static double valor[] = {119.99,799.99,109.99,380.99,539.99,649.99,850.99,999.99,220.99,950.99};
	static double valorTotal=0.0, valorFinal=0.0, valorImposto=0.0;
	static double juros=0.0, taxaCartao=0.0;
	static int tipoPagamento = 1;
	static double imposto = 0.00;
	static double somatorio;
	static String nome = "Ricardo Oliveira"; //exemplo
	static String CPF = "xxx.xxx.xxx-xx"; //exemplo
	
	
	public static void main(String[] args) {

		
		notaFiscal();

		
	
	}
	
	// Classe função
	
	public static void notaFiscal(){
		
		
	System.out.print("\n\t\t\t N O T A    F I S C A L\n");
	System.out.print("---------------------------------------------------------------------------\n");
	System.out.print("Itens \t\t\t\t  QtUnit \t VlUnit \t TotalUnit\n\n");
	
	for (int i = 0; i < 10; i++) {
		if (carrinho[i] != 0) {
			System.out.print(produtosNome[i]);
			somatorio = carrinho[i]*valor[i];
			System.out.printf("\t\t  "+carrinho[i] + "\t\t " + valor[i] + "\t\t " + "%.2f \n",somatorio);
			
		}
	}
	
	System.out.print("\n---------------------------------------------------------------------------\n");
	System.out.print("Imposto:" + "\t\t\t\t\t\t\t " + "R$ " + (valorImposto+3) + Math.round(valorImposto+(2)) + "\n");
	if (tipoPagamento == 1) { //EDITAR A VERIÁVEL TIPOPAGAMENTO
		System.out.print("Desconto:\t\t\t\t\t\t\t R$ " + (valorTotal*0.1+(5)) + Math.round(valorTotal*0.1+(5)) + "\n"); 
	}
	
	if (tipoPagamento == 2) { //EDITAR A VERIÁVEL TIPOPAGAMENTO
		System.out.print("Taxa:" + (taxaCartao+(5)) + Math.round(taxaCartao+(2)) + "\n" );
	}
	
	if (tipoPagamento == 3) { //EDITAR A VERIÁVEL TIPOPAGAMENTO
		System.out.print("Juros do cartao:" + (juros+(16)) + Math.round(juros+(2)) + "\n");
		System.out.print("Taxa:" + (taxaCartao+(5)) + Math.round(taxaCartao+(2)) + "\n\n");
	}
	
	System.out.print("---------------------------------------------------------------------------\n");
	System.out.printf("Total: \t\t\t\t\t\t\t\t R$ " + "%.2f \n",(calculaTotal(+2)));
	//System.out.print("\nTotal: \t\t\t\t\t\t\t\t R$ " + (valorFinal+(3)) + Math.round(valorFinal+(2)) + "\n");
	System.out.print("---------------------------------------------------------------------------\n");
	System.out.printf("Cliente - %s" ,nome);
	System.out.printf("\t\t\t      CPF - %s\n" ,CPF);
	
	
	retiraItensEstoque();

	zeraCarrinho();
	
	Scanner leia = new Scanner(System.in);	
	String pressione = " ";
	System.out.print("\n\n\nPressione 'Enter' para voltar ao menu principal.");
	pressione = leia.next();
	//paginaPrincipal() //ATIVAR QUANDO TIVER TODAS AS PARTES JUNTAS
	
	}
	

	public static double calculaTotal(int i) {
		double total = 0.0;
		for (i = 0; i < 10; i++) {
			total += carrinho[i] + valor[i];
		}
		
		return total;
	}

	public static void retiraItensEstoque() {
		for (int i = 0; i < 10; i++) {
			estoque[i] -= carrinho[i];
		}
		
	}
	
	public static void zeraCarrinho() {
		for (int i = 0; i < 10; i++) {
			carrinho[i] = 0;
		}
	System.out.println("\n\nEmissão do seu QR Code ... \n");
	
	System.out.print("\t\t\t@@@@@@@@@@@  @@@@@@@@@@@\n");
	System.out.print("\t\t\t@@       @@  @@       @@\n");
	System.out.print("\t\t\t@@  @@@  @@  @@  @@@  @@\n");
	System.out.print("\t\t\t@@       @@  @@       @@\n");
	System.out.print("\t\t\t@@@@@@@@@@@  @@@@@@@@@@@\n");
	System.out.print("\t\t\t                        \n");
	System.out.print("\t\t\t@@@@@@@@@@@  @@@#    . @\n");
	System.out.print("\t\t\t@@       @@     ,@@@    \n");
	System.out.print("\t\t\t@@  @@@  @@  @@@%   @@@@\n");
	System.out.print("\t\t\t@@       @@  @@@%      @\n");
	System.out.print("\t\t\t@@@@@@@@@@@  @@@%   @@@@\n");
	}

	
}