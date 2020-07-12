package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Object;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {
	
	public static void main(String[] args) {
		Object conta = new ContaCorrente(123, 321);
		conta.deposita(200.0);
		
		try {
			conta.saca(210.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println("Mensagem da Exceção: " + ex.getMessage());
		}
		System.out.println("Saldo: R$" + conta.getSaldo());
		
	}

}
