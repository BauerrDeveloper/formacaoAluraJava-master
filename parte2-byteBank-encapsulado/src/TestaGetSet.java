
public class TestaGetSet {


	public static void main(String[] args) {
		Conta conta = new Conta (1337, 24226);
		//conta.setNumero(1337);
		System.out.println("Numero da conta:  " + conta.getNumero());
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		System.out.println("Titular da conta: " + conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println("Profiss�o: " + conta.getTitular().getProfissao());
			
	}
	
}
