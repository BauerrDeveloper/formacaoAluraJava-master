package byteBankParte2;

public class TesteReferencias {
	public static void main(String[] args) {
				Conta primeiraConta = new Conta();	
				primeiraConta.saldo = 300;
				System.out.println("saldo da primeira R$ " + primeiraConta.saldo);
				
				Conta segundaConta = primeiraConta;
				System.out.println("saldo da segunda: R$: " + segundaConta.saldo);
	
				segundaConta.saldo += 100;
				System.out.println("saldo da segunda conta apos o deposito R$ " + segundaConta.saldo);
	}
}
