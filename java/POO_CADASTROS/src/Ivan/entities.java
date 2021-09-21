package Ivan;
import java.util.Scanner;
public class entities {
	private int codigo[] = {1,2,3,4,5,6,7,8,9,10}, codigoDigitado;
	private String produto[] = 
		{"Luminaria de Mesa             ",
		 "Poltrona                      ",
		 "Abajur                        ",
		 "Estante                       ",
		 "Escrivaninha                  ",
		 "Cadeira de escritório         ",
		 "Cama Box                      ",
		 "Cadeira Gamer                 ",
		 "Mesa de centro                ",
		 "Sofá                          "};
	private double valor[] = {119.99,799.99,109.99,380.99,539.99,649.99,850.99,999.99,220.99,950.99};
	private int estoque[] = {10,10,10,10,10,10,10,10,10,10};
	private char opcaoCompra;
	
	
	public int getCodigoDigitado() {
		return codigoDigitado;
	}
	public void setCodigoDigitado(int codigoDigitado) {
		this.codigoDigitado = codigoDigitado;
	}
	public char getOpcaoCompra() {
		return opcaoCompra;
	}
	public void setOpcaoCompra(char opcaoCompra) {
		this.opcaoCompra = opcaoCompra;
	}
	
	public void boasVindas() {
		System.out.print("Bem vindo a Devs de int[e]=riores!\n");
		System.out.print("\nProgramando o seu conforto!\n"); 
	}
	
	public void opcoes(char opcaoCompra) {
		if(this.opcaoCompra == 'S') {
			System.out.print("\n-------------------------------------------------------------------------------\n");
			System.out.print("\n\t\tLISTA DE PRODUTOS DISPONIVEIS\n\n");
			System.out.printf("CÓDIGO\tPRODUTO\t\t\t\t\tVALOR\t\tESTOQUE\n");
		for (int x=0; x<10; x++)
		{
			System.out.printf("G-%d\t %s \t R$ %.2f \t %d\n", codigo[x], produto[x], (valor[x]),estoque[x]);
		}
		Scanner ler = new Scanner(System.in);
		System.out.print("\nDigite o código do produto que deseja comprar G-: ");
		codigoDigitado = ler.nextInt();
		if (codigoDigitado <= 10 )
		{
			for (int x=0; x<10; x++)
			{
				if (codigoDigitado == codigo[x])
				{
					System.out.printf(produto[x]);
				}
			}
		}
		else if (codigoDigitado < 0 && codigoDigitado > 10)
		{
			System.out.print("Código invalido");
		}
	}
		else if (opcaoCompra == 'N')
		{
			System.out.print("\nObrigado, até breve!\n");
		}
		else if (opcaoCompra != 'S' || opcaoCompra != 'N')
		{
			System.out.print("\nOpção invalida!\n");
		}
	}
}