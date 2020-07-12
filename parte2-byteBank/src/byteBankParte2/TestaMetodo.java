package byteBankParte2;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo da contaDoPaulo: R$ " + contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println("Saldo da contaDoPaulo: R$ " + contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDoPaulo);
		
		if (sucessoTransferencia) {
			System.out.println("Transferencia efetuada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Saldo da contaDaMarcela ap�s a transfer�ncia R$ " + contaDaMarcela.saldo);
		System.out.println("Saldo da contaDoPaulo ap�s a transfer�ncia R$ " + contaDoPaulo.saldo);
	}
	
	
	
}
