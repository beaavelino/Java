package exercicio2;

public class aplicacao {

	public static void main(String[] args) {
		aviao aviao1 = new aviao();
		
		aviao1.empresa = "GOL";
		aviao1.cor = "Laranja";
		aviao1.destino = "Bahia";
		aviao1.tanque=20;
		
		//Aviso que precisa abastecer!
		if(aviao1.tanque <50) {
			System.out.println("O avião da empresa "+aviao1.empresa+", com destino a "+aviao1.destino+" precisa abastecer..");
			System.out.println("Tem apenas "+aviao1.tanque+" litros de querosene");
		}

	}

}
