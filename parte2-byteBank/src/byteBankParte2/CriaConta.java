package byteBankParte2;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		Conta segundaConta = new Conta();
		
		
		primeiraConta.saldo = 200;
		System.out.println("Saldo da primeiraConta: R$ " + primeiraConta.saldo);
	
		primeiraConta.saldo +=100;
		System.out.println("Saldo Atual da primeiraConta: R$ " + primeiraConta.saldo);
		System.out.println(" ");
		
		segundaConta.saldo = 50;
		System.out.println("Saldo da segundaConta: R$ " + segundaConta.saldo);
	}
}
