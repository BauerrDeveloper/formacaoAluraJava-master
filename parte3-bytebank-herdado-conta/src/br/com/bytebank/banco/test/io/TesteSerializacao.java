package br.com.bytebank.banco.test.io;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Rodrigo Paulo");
        cliente.setProfissao("Desenvolvedor");
        cliente.setCpf("05234095916");

        ContaCorrente contaCorrente = new ContaCorrente(12, 45);
        contaCorrente.setTitular(cliente);
        contaCorrente.deposita(1000.0);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
        oos.writeObject(contaCorrente);
        oos.close();

    }

}
