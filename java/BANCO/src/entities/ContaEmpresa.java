package entities;

public class ContaEmpresa extends Conta{
	
	//Atributos
	private double emprestimoEmpresa;
	
	//Construtor
	public ContaEmpresa(String cpf, int numero) {
		super(cpf, numero);
		// TODO Auto-generated constructor stub
	}
	
	
	//Encapsulamento
	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	
	
	

}
