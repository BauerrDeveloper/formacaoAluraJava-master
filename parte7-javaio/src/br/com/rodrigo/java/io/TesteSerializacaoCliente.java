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

//A transformação do objeto em um fluxo binário é chamada de serialização.
//A transformação de um fluxo binário em um objeto é chamada de desserialização.