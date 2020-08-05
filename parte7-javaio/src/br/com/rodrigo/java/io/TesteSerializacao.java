package br.com.rodrigo.java.io;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       Cliente cliente = new Cliente();
       cliente.setNome("Rodrigo Paulo");
       cliente.setProfissao("Desenvolvedor");
       cliente.setCpf("05234095916");

       //serialização
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
       oos.writeObject(cliente);
       oos.close();


        //desserialização
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//        Cliente cliente = (Cliente) ois.readObject();
//        ois.close();
//        System.out.println(cliente.getNomeCPF());

    }

}

//A transformação do objeto em um fluxo binário é chamada de serialização.
//A transformação de um fluxo binário em um objeto é chamada de desserialização.