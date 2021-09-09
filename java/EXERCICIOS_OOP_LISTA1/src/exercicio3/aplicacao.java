package exercicio3;

public class aplicacao {

		public static void main(String[] args) {
			//Interface //Produto 1
			produtoEletronico produto1 = new produtoEletronico();
			produto1.name = "Fogão brastemp";
			produto1.category = "FOGÃO";
			produto1.inventory = 5;
			produto1.price = 2.589;
			
			//Interface //Produto 2
			produtoEletronico produto2 = new produtoEletronico();
			produto2.name = "Fogão consul";
			produto2.category = "FOGÃO";
			produto2.inventory = 3;
			produto2.price = 2.589;
			
			//Interface //Produto 3
			produtoEletronico produto3 = new produtoEletronico();
			produto3.name = "Fogão LG";
			produto3.category = "FOGÃO";
			produto3.inventory = 7;
			produto3.price = 2.589;
			
			System.out.print("\t\t\tLista de produtos:\n\n");
			
			System.out.println("1° "+produto1.getName()+" R$"+produto1.price+" "+ produto1.inventory+" unidades");
			System.out.println("2° "+produto2.getName()+" R$"+produto2.price+" "+ produto2.inventory+" unidades");
			System.out.println("3° "+produto3.getName()+" R$"+produto3.price+" "+ produto3.inventory+" unidades");
			
		}

	
	}


