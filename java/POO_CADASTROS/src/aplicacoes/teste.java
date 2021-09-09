package aplicacoes;

import classes.pessoa;

public class teste {

	public static void main(String[] args) {
		
		pessoa fulano = new pessoa();
		pessoa cicrano = new pessoa();
		
		fulano.nome = "epaminondas";
		cicrano.nome = "João";
		fulano.anoNascimento = 2000;
		cicrano.anoNascimento = 1960;
		
		System.out.println(fulano.nome.toUpperCase());
		System.out.println(cicrano.nome);
		
		System.out.println(fulano.anoNascimento);
		fulano.mostraIdade();
	

	}

}
