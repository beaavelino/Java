package AulasGravadasPOO;

public class Pessoa_1 {
	
	private String primeiroNome; //private � para dar seguran�a. Com isso outras classes n�o consigar acessar ou manupular
	private String ultimoNome;
	private String nomesDoMeio;
	
	public Pessoa_1 (String primeiro, String meio, String ultimo) {
		
		primeiroNome = primeiro;
		ultimoNome= ultimo;
		nomesDoMeio = meio;
	}
	
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	
	
}
