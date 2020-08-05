package br.com.rodrigo.java.io;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

       Cliente cliente = new Cliente();
       cliente.setNome("Rodrigo Paulo");
       cliente.setProfissao("Desenvolvedor");
       cliente.setCpf("05234095916");

       //serializa��o
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
       oos.writeObject(cliente);
       oos.close();


        //desserializa��o
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
//        Cliente cliente = (Cliente) ois.readObject();
//        ois.close();
//        System.out.println(cliente.getNomeCPF());

    }

}

//A transforma��o do objeto em um fluxo bin�rio � chamada de serializa��o.
//A transforma��o de um fluxo bin�rio em um objeto � chamada de desserializa��o.