package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;
import br.com.bytebank.banco.modelo.Object;

public class TesteGuardadorReferencias {

	public static void main(String[] args) {

		GuardadorDeReferencias guardador = new GuardadorDeReferencias();

		ContaCorrente cc = new ContaCorrente(22, 11);
		guardador.adiciona(cc);

		ContaCorrente cc2 = new ContaCorrente(22, 22);
		guardador.adiciona(cc2);

		int tamanho = guardador.getQuantidadeDeElementos();
		System.out.println(tamanho);

		Object ref =guardador.getReferencia(1);
		System.out.println(ref.getNumero());

	}

}
