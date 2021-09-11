package Classes;

public class terceiro_ed extends funcionario_ed {

		private double adicional;
		
	public terceiro_ed(String matricula, int horasTrabalhadas, double valorHora, String nome) {
		super(matricula, horasTrabalhadas, valorHora, nome);
		this.adicional = adicional;
		
	}

	public terceiro_ed() {
		super(getMatricula(), getNome());
		this.adicional = adicional;
	}

}
