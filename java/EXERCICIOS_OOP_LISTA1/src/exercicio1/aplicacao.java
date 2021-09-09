package exercicio1;


public class aplicacao {

	public static void main(String[] args) {
		cliente cliente1 = new cliente();
		
		cliente1.name = "Beatriz";
		cliente1.idade = 20;
		cliente1.cpf = "34878943290";
		cliente1.negativado = true;
		
		cliente cliente2 = new cliente();
		
		cliente2.name = "Gabriela";
		cliente2.idade = 45;
		cliente2.cpf = "58915225";
		cliente2.negativado = false;
		
		if(cliente1.negativado == true){
			System.err.println(cliente1.name);
			System.out.println("Esse cliente está negativado!");
		}else if(cliente1.negativado == false) {
			System.err.println(cliente2.name);
			System.out.println("Esse cliente está positivo");
		}
		

	}



}


