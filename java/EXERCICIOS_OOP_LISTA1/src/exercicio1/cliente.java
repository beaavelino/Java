package exercicio1;

public class cliente {
	public String name;
	public int idade;
	public String cpf;
	
	public boolean negativado = false;
	
	//Lista o cliente
	public void listaCliente(){
		System.out.println(name);
	}
	//Lista o cliente negativado
	public void listarClienteNegativado(){
		negativado = true;
	}
	//Lista o cliente positivo
	public void listarClientePositivo(){
		negativado = false;
	}

}
