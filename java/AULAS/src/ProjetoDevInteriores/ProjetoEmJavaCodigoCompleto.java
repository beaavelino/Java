package ProjetoDevInteriores;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ProjetoEmJavaCodigoCompleto {

	// vetores
	static Scanner scanner = new Scanner(System.in);
	static double valor[] = { 119.99, 799.99, 109.99, 380.99, 539.99, 649.99, 850.99, 999.99, 220.99, 950.99 };
	static int carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	static int estoque[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
	static double valorTotal = 0.0, valorFinal = 0.0, valorImposto = 0.0, imposto = 0.00, juros = 0.0, taxaCartao = 0.0;
	static double somatorio;
	static int tipoPagamento = 1;
	static String nomeUsuario = "Usuario anonimo";
	static String cpfUsuario = "000.000.000-0";
	static String produtosNome[] = { 
			"Luminaria de mesa", 
			"Poltrona", 
			"Abajur", 
			"Estante", 
			"Escrivaninha",
			"Cadeira de Escritorio",
			"Cama",
			"Cadeira Gamer",
			"Mesa de centro",
			"Sofa" };
	
	static String produtosNomeEspaco[] = {
		"Luminaria de Mesa            ",
		"Poltrona                     ",
		"Abajur                       ",
		"Estante                      ",
		"Escrivaninha                 ",
		"Cadeira de escritório        ",
		"Cama Box                     ",
		"Cadeira Gamer                ",
		"Mesa de centro               ",
		"Sofá                         "
	};
	
	static String codigo[] = { "G5-1", "G5-2", "G5-3", "G5-4", "G5-5", "G5-6", "G5-7", "G5-8", "G5-9", "G5-10" };

	public static void main(String[] args) throws InterruptedException {
		Scanner leia = new Scanner(System.in);
		
		paginaPrincipal();
	}

	public static void paginaPrincipal() throws InterruptedException {

		Scanner leia = new Scanner(System.in);

		char resposta = 0;

		cabecalho();
		System.out.println("Olá, deseja comprar algo? ");
		System.out.print("Digite S/N: ");
		resposta = leia.next().charAt(resposta);
		if (resposta == 'S' || resposta == 's') {
//			limpa();
			pular();
			cadastrarUsuario();
			limpa();
			cabecalho();
			pular();
			System.out.print("Iremos te apresentar agora os nossos" + "\n" + "produtos!\n");
			linha();
			Thread.sleep(2000);
			desenho();
			Thread.sleep(2000);
			limpa();
			cabecalho();
			menuCarrinho();
		} else if (resposta == 'N' || resposta == 'n') {
			cabecalho();
			despede();
			linha();
			pular();
			System.out.println("Até breve!!\n");
			System.exit(0);
			
		}

	}
	
	public static void cadastrarUsuario() {		
		System.out.print("Insira o seu nome: ");
		nomeUsuario = scanner.nextLine();
		System.out.print("Insira o seu CPF: ");
		cpfUsuario = scanner.nextLine();
	}
	
	public static void desenho() throws InterruptedException {
		System.out.print("\n\n         /@@@@@@@@@@@@@@@@@@@@@@@%                  |||   &@@@@@@@@@@@@@@@@@@  \n");
		Thread.sleep(100);
		System.out.print("	 /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.            |||   &@@@@@@@@@@@@@@@@@@  \n");
		Thread.sleep(100);
		System.out.print("	 /@@@@@@@@&*@@@@@@@@@@@@*  @@@@@@@,         |||   &@@@@@@@@/%@@@@@@@@  \n");    
		Thread.sleep(100);
		System.out.print("	 /@@@@@@@@&*@@@@@@@@@@@@@@@@@..@@@@@*       |||   &@@@@@@@@/%@@@@@@@@  \n"); 
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@         &@@@@@@ @@@@@      |||        @@@@/%@@@@      \n");   
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@            @@@@@ &@@@@     |||        @@@@/%@@@@      \n");   
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@             .@@@@ @@@@%    |||        @@@@/%@@@@      \n");  
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@              @@@@#(@@@@    |||        @@@@/%@@@@      \n");    
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");     
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");    
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");    
		Thread.sleep(100);  
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n"); 
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@              @@@@#*@@@@    |||        @@@@/%@@@@      \n");  
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@             @@@@@ @@@@     |||        @@@@/%@@@@      \n");  
		Thread.sleep(100);
		System.out.print("	      @@@@&*@@@@           @@@@@# @@@@*     |||        @@@@/%@@@@      \n");  
		Thread.sleep(100);
		System.out.print("         *&&&&@@@@&*@@@@&&&&&@@@@@@@@@% @@@@@       |||   %&&&&@@@@/%@@@@&&&& \n"); 
		Thread.sleep(100);
		System.out.print("	 /@@@@@@@@&*@@@@@@@@@@@@@@@. @@@@@@*        |||   &@@@@@@@@/%@@@@@@@@  \n");      
		Thread.sleep(100);
		System.out.print("	 /@@@@,,,,,,,,,,,,,,,,/&@@@@@@@@@           |||   &@@@@,,,,,,,,,,@@@@  \n");       
		Thread.sleep(100);
		System.out.print("	 /@@@@@@@@@@@@@@@@@@@@@@@@@@@               |||   &@@@@@@@@@@@@@@@@@@  \n\n");    
		Thread.sleep(100);
	}

	public static void menu() {
		Scanner leia = new Scanner(System.in);

		System.out.print("\n-------------------------------------------------------------------------------\n");
		System.out.print("\n\t\tLISTA DE PRODUTOS DISPONÍVEIS\n\n");
		System.out.printf("CODIGO\tPRODUTO\t\t\t\t VALOR\t\tESTOQUE\n");

		for (int x = 0; x < 10; x++) {

			System.out.printf("%s\t%s \t R$ %.2f \t     %d\n", codigo[x], produtosNomeEspaco[x], valor[x], estoque[x]);
			
		}

	}

	public static void itensNoCarrinho() {
		System.out.println("CARRINHO DE COMPRAS\n");
		System.out.print("Item                    Un      VlrUn      VlrTotal\n");
		for (int i = 0; i < 10; i++) {
			if (carrinho[i] != 0) {
				System.out.print(produtosNome[i]);
				espacoNome(produtosNome[i]);
				System.out.printf(carrinho[i] + "      " + valor[i] + "     " + "%.2f" + "\n", (valor[i] * carrinho[i]));
			}
		}
	}

	public static void menuCarrinho() {
		Scanner leia = new Scanner(System.in);

		int codigoLer = 1, quantidade = 0, localVetor = 0;
		String codigoCompleto = "";

		while (codigoLer != (-1)) {
			int v = 1;
			menu();
			System.out.print("\n");
			itensNoCarrinho();
			System.out.print("\nDigite o código do produto a ser adicionado ao carrinho" + "\n"
					+ "ou aperte '0' para encerrar compra: ");
			codigoCompleto = leia.next().toUpperCase(Locale.ROOT);

			do {
				for (int x = 0; x < 10; x++) {

					if (codigoCompleto.intern() == codigo[x] || codigoCompleto.intern() == "0") {
						localVetor = x;
						v = 0;
					}
				}
				if (v != 0) {
					System.out.print("Código Incorreto\n");
					System.out.print("Digite o código do produto a ser adicionado ao carrinho" + "\n"
							+ "ou aperte '0' para encerrar compra: ");
					codigoCompleto = leia.next();
				}
			} while (v != 0);

			// System.out.print(codigoCompleto+"\n");
			codigoLer = localVetor;
			// System.out.print(codigoLer);

			if (codigoCompleto.intern() == "0") {
				metodoDePagamento();

			} else if (codigoLer != -1 && estoque[codigoLer] <= 10) {
				System.out.print("Qual a quantidade? ");
				try {
					quantidade = leia.nextInt();
				} catch (InputMismatchException erro1) {
					System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
					leia.nextLine();
				}
				while (quantidade < 0) {
					System.out.println("Quantidade negativa, digite novamente: ");
					quantidade = leia.nextInt();
				}

				if (quantidade <= estoque[codigoLer]) {
					carrinho[codigoLer] = carrinho[codigoLer] + quantidade;
				} else {
					System.out.println("Desculpe, mas nosso estoque não possui essa quantidade\n");
					System.out.println("Quantidade disponível em estoque: " + estoque[codigoLer]);

				}
			} else {
				break;
			}

		}

	}

	public static void metodoDePagamento() {
		
        cabecalho();
        
        System.out.printf("O valor do seu carrinho é de: R$ %.2f\n", calculaTotal());
        System.out.printf("O valor de imposto é de:      R$ %.2f\n", calculaTotal()*0.09);
//        System.out.println("\n\n\nPressione 'Enter' para continuar.");
//        leia(pressione)
//        cabecalho()
        pular();
        System.out.println("Escolha uma opção de pagamento:\n");
//        linha()
        System.out.println("1 - À vista - Promoção de 10% de Desconto!");
        System.out.printf("    Sai por: R$ %.2f", calculaTotal()*0.9);
        System.out.println("\n\n2 - No cartão - Acréscimo de 10% de Taxa!");
        System.out.printf("    Sai por: R$ %.2f", calculaTotal()*1.1);
        System.out.println("\n\n3 - Em 2x - Acréscimo de 15% de Juros e Taxa!");
        System.out.printf("    Sai por 2x de: R$ %.2f", calculaTotal()*0.575);
        System.out.printf(" Total: R$ %.2f", calculaTotal()*1.15);
//        Total: R$"+mat.arredondar(valorTotal*1.15,2))
        pular();
        System.out.print("\nQual a forma de pagamento desejado? ");
        tipoPagamento = scanner.nextInt();
        
        notaFiscal();
	}

	public static void notaFiscal() {
		
		limpa();
//		cabecalho();
		pular();

		System.out.print("\n\t\t\t N O T A    F I S C A L\n");
		System.out.print("---------------------------------------------------------------------------\n");
		System.out.print("Itens \t\t\t\t  QtUnit \t VlUnit \t TotalUnit\n\n");

		for (int i = 0; i < 10; i++) {
			if (carrinho[i] != 0) {
				System.out.print(produtosNomeEspaco[i]);
				somatorio = carrinho[i] * valor[i];
				System.out.printf("     " + carrinho[i] + "\t\t " + valor[i] + "\t\t " + "%.2f \n", somatorio);

			}
		}

		System.out.print("\n---------------------------------------------------------------------------\n");
		System.out.printf("Total:                                                                      R$ " 
				+ "%.2f\n\n", (calculaTotal()));
		
		System.out.printf("Imposto:                                                         " 
				+ "R$ %.2f\n", calculaTotal()*0.09);
		if (tipoPagamento == 1) { // EDITAR A VARIAVEL TIPOPAGAMENTO
			System.out.printf("Desconto:\t\t\t\t\t\t\t R$ %.2f\n", calculaTotal()*0.1);
			System.out.printf("\nValor final:                                                     " 
					+ "R$ %.2f\n", calculaTotal()*0.9);
		}

		if (tipoPagamento == 2) { // EDITAR A VARIAVEL TIPOPAGAMENTO
			System.out.printf("Taxa:                                                            " 
					+ "R$ %.2f\n", calculaTotal()*0.1);
			System.out.printf("\nValor final:                                                     " 
					+ "R$ %.2f\n", calculaTotal()*1.1);
		}

		if (tipoPagamento == 3) { // EDITAR A VARIAVEL TIPOPAGAMENTO
			System.out.printf("Taxa:                                                            " 
					+ "R$ %.2f\n", calculaTotal()*0.1);
			System.out.printf("Juros:                                                           " 
					+ "R$ %.2f\n", calculaTotal()*0.05);
			System.out.printf("\nValor final:                                                     " 
					+ "R$ %.2f\n", calculaTotal()*1.15);
		}

		System.out.print("---------------------------------------------------------------------------\n");
		System.out.printf("Cliente - %s", nomeUsuario);
		System.out.printf("\t\t\t       CPF - %s\n", cpfUsuario);

		retiraItensEstoque();

		zeraCarrinho();
		
		try {
			qrCode();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		agradece();

		Scanner leia = new Scanner(System.in);
		System.out.print("\n\n\nPressione 'Enter' para voltar ao menu principal.");
		leia.nextLine();
		
		try {
			paginaPrincipal(); 
		} catch (Exception e) {
			System.out.println("Ocorreu um erro");
		}

	}

	public static double calculaTotal() {

		double total = 0.0;
		for (int i = 0; i < 10; i++) {
			total += carrinho[i] * valor[i];
		}

		return total;
	}

	public static void retiraItensEstoque() {
		
		for (int i = 0; i < 10; i++) {
			estoque[i] -= carrinho[i];
		}

	}
	
	public static void qrCode() throws InterruptedException {
		System.out.println("\n\nEmissão do seu QR Code ... \n");
		
		Thread.sleep(100);
		System.out.print("\t\t\t@@@@@@@@@@@  @@@@@@@@@@@\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@       @@  @@       @@\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@  @@@  @@  @@  @@@  @@\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@       @@  @@       @@\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@@@@@@@@@@  @@@@@@@@@@@\n");
		Thread.sleep(100);
		System.out.print("\t\t\t                        \n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@@@@@@@@@@  @@@#    . @\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@       @@     ,@@@    \n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@  @@@  @@  @@@%   @@@@\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@       @@  @@@%      @\n");
		Thread.sleep(100);
		System.out.print("\t\t\t@@@@@@@@@@@  @@@%   @@@@\n");
		Thread.sleep(100);
	}

	public static void zeraCarrinho() {

		double carrinho[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 10; i++) {
			carrinho[i] = 0;
		}
	}

	public static void agradece() {
		System.out.println("\n\nObrigada por comprar com a Devs de int[e]=riores!\n");
	}

	public static void despede() {
		System.out.println("Obrigada por vir à Devs de int[e]=riores!");
	}

	public static void cabecalho() {
		limpa();
		linha();
		nome();
		slogan();
		linha();
		pular();
	}

	public static void nome() {
		System.out.println("---Bem-vinde à Devs de int[e]=riores----");
	}
	public static void espacoNome(String nome) {
		int espacos = 25 - nome.length();
		
		for (int x = 0; x < espacos; x++) {
			System.out.print(" ");
		}		
	}

	public static void slogan() {
		System.out.println("-------Programando o seu conforto!------");
	}

	public static void linha() {
		System.out.println("----------------------------------------");
	}

	public static void pular() {
		System.out.println("\n");
	}

	public static void limpa() {
		for (int clear = 0; clear < 20; clear++) {
			System.out.println(" ");
		}
	}
}