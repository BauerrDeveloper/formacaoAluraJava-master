package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteDesserializacao {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("cc.bin"));
        ContaCorrente contaCorrente = (ContaCorrente) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println("SALDO R$: " + contaCorrente.getSaldo() + ", TITULAR: " + contaCorrente.getTitular());

    }
}
