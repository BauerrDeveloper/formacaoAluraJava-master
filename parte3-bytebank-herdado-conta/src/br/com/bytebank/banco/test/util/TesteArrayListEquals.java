package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {

    public static void main(String[] args) {
        ArrayList <Conta> lista = new ArrayList <Conta>();

        Conta cc1 = new ContaCorrente(237, 23175);
        Conta cc2 = new ContaCorrente(237, 23175);

        lista.add(cc1);

        boolean igual = cc1.equals(cc2);
        System.out.println("Já existe?? " + igual);

        for (Conta conta : lista) {
            System.out.println(conta);
        }


    }
}
