package Classes;

public class funcionario_ed {
	
	//atributos
	protected static String matricula;
	private int horasTrabalhadas;
	private double valorHora;
	protected static String nome;
	
	//construtor
	
	public funcionario_ed(String matricula, String nome){
			
		this.matricula = matricula;
		this.nome = nome;
		
		
	}

	public funcionario_ed(String matricula, int horasTrabalhadas, double valorHora, String nome) {
		super();
		this.matricula = matricula;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
		this.nome = nome;
	}

	public static String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public static String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//metodo
	public double salario() {
		return (this.horasTrabalhadas*this.valorHora);
	}

}
