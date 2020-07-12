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
		System.out.println("Saldo da contaDaMarcela após a transferência R$ " + contaDaMarcela.saldo);
		System.out.println("Saldo da contaDoPaulo após a transferência R$ " + contaDoPaulo.saldo);
	}
	
	
	
}
