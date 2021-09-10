package entities;

public class ContaPoupanca extends Conta {
	
	//atributos
	private int diaAniversario;
	//construtor
	public ContaPoupanca(String cpf, int numero, int diaAniversario) {
		super(cpf, numero);
		this.diaAniversario = diaAniversario;
	}
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//encapsulamento 
	public int getDiaAniversario() {
		return diaAniversario;
	}
	
	//metodos
	
}
