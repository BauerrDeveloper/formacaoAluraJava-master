package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(234, 987);
		c.deposita(1000);
		
		System.out.println("Saldo R$: " + c.getSaldo());
		
	}
	
}
