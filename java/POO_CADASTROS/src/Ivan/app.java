package Ivan;
import java.awt.Menu;
import java.util.Scanner;

public class app {

	    public static void main(String[] args) {

	    	
	    	entities entities3 = new entities();
			entities3.boasVindas();

			Scanner ler = new Scanner(System.in);
			System.out.print("\nGostaria de iniciar as compras? Digite S/N: ");
			char opcaoCompra = ler.next().toUpperCase().charAt(0);	
	        entities entities2 = new entities();
			entities2.setOpcaoCompra(opcaoCompra);
	        entities entities = new entities();
			entities.opcoes(opcaoCompra);
	    }
	}