package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

    public static void main (String[] args) {

    //forma literal de criação de arrays
    //int refs [] = {1,2,3,4,5}

        //ContaCorrente[] contas = new ContaCorrente[5];
        Object[] referencias = new Object[5]; //array q guarda qualquer tipo de referência

        ContaCorrente cc1 = new ContaCorrente(237, 23157);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(732, 75132);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        cc1.deposita(300);
        cc2.deposita(500);
        cliente.setCpf("0523409591-16");

        ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());

        System.out.println(cc1.toString());
        System.out.println(cc2.toString());
        System.out.println(cliente.getCpf());


    }



}
