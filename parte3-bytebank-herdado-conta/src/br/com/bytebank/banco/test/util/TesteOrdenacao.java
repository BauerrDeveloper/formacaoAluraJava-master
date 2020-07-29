package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.*;

public class TesteOrdenacao {

    public static void main(String[] args) {

        Conta cc1 = new ContaCorrente(354, 7654);
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Rodrigo Paulo Bauernfeind");
        cc1.setTitular(cliente1);
        cc1.deposita(890);

        Conta cc2 = new ContaPoupanca(1011, 35987);
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria Ana França de Oliveira Bauernfeind");
        cc2.setTitular(cliente2);
        cc2.deposita(1908);

        Conta cc3 = new ContaCorrente(888, 541);
        Cliente cliente3 = new Cliente();
        cliente3.setNome("Laura França de Oliveira Bauernfeind");
        cc3.setTitular(cliente3);
        cc3.deposita(90876);

        Conta cc4 = new ContaPoupanca(659, 1111);
        Cliente cliente4 = new Cliente();
        cliente4.setNome("Bernardo França de Oliveira Bauernfeind");
        cc4.setTitular(cliente4);
        cc4.deposita(1567899);

        List<Conta> listaContas = new ArrayList<>();
        listaContas.add(cc1);
        listaContas.add(cc2);
        listaContas.add(cc3);
        listaContas.add(cc4);

        System.out.println("################# Criação da Lista #################");

        for (Conta conta : listaContas) {
            System.out.println(conta  + ", Titular: " + conta.getTitular().getNome());
        }

        //NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        listaContas.sort(null);

        System.out.println("");

        System.out.println("-_-_-_-_-_-_-_- Lista Ordenada pelo Número da conta -_-_-_-_-_-_-_-");
        for (Conta conta : listaContas) {
            System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
        }

        System.out.println("");

        System.out.println("-_-_-_-_-_-_-_- Lista Ordenada pelo Nome do Titular -_-_-_-_-_-_-_-");
        listaContas.sort(new TitularDaContaComparator());
        for (Conta conta : listaContas) {
            System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
        }

        System.out.println("");
        System.out.println("_-_-_-_-_-_-_-_- Lista Ordenada pelo Saldo da Conta _-_-_-_-_-_-_-_-");
        Collections.sort(listaContas);
        for (Conta conta : listaContas) {
            System.out.println(conta + ", Titular: " + conta.getTitular().getNome());
        }

    }
}

class NumeroDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        return Integer.compare(c1.getNumero(), c2.getNumero());

/*
		return c1.getNumero() - c2.getNumero();
		if(c1.getNumero() < c2.getNumero()) {
			return -1;
		}
		if(c1.getNumero() > c2.getNumero()) {
			return 1;
		}
		return 0;
*/

    }
}

class TitularDaContaComparator implements Comparator<Conta> {

    @Override
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2);
    }
}