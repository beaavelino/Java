package entities;

public class ContaEstudantil extends Conta {
	private double limiteEstudantil;
	
	//Atributos
	
	//Construtor # HERANÇA
	public ContaEstudantil(String cpf, int numero, double limiteEstudantil) {
		super(cpf, numero);
		this.limiteEstudantil = limiteEstudantil;
	}
	
	//Encapsulamento
	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	

}
