
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente funcionario1 = new Gerente();
		funcionario1.setNome("Rodrigo Paulo Bauernfeind");
		funcionario1.setCpf("052.340.959-16");
		funcionario1.setSalario(2600.00);
		
		System.out.println("Nome do funcionario: " + funcionario1.getNome());
		System.out.println("Bonifica��o do funcion�rio: R$ " + funcionario1.getBonificacao());
		System.out.println("Sal�rio total do m�s: R$ " + (funcionario1.getSalario() + funcionario1.getBonificacao()));

	}

}
