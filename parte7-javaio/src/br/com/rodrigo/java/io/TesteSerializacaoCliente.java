package br.com.rodrigo.java.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //String s = "Rodrigo Paulo Bauernfeind";

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        oos.writeObject(s);
        oos.close();*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        String nome = (String) ois.readObject();
        ois.close();

        System.out.println(nome);

    }

}

//A transforma��o do objeto em um fluxo bin�rio � chamada de serializa��o.
//A transforma��o de um fluxo bin�rio em um objeto � chamada de desserializa��o.