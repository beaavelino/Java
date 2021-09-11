package Classes;

public class terceiro {
	public class Terceiro extends funcionario {

		//Construtor
		public Terceiro(int horasTrabalhadas, double valorHora, String nome) {
			super(horasTrabalhadas, valorHora, nome);
			// TODO Auto-generated constructor stub
		}
		
		//Método
		@Override
		public double salario(){
			return (horasTrabalhadas * valorHora + adicional);
		}

	}
}
