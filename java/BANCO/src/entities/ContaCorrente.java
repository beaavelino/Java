package entities;

public class ContaCorrente extends Conta {
	private int contadorTalao;
	
	//Construtor classe Conta
	public ContaCorrente(String cpf, int numero) {
		super(cpf, numero);
		
	}
	
	//Encapsulamento
	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}

}
