package br.com.rodrigo.java.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        InputStream fis = new FileInputStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\lorem.txt"); //criando o fluxo concreto com o arquivo, mas binário
        Reader isr = new InputStreamReader(fis, "UTF-8"); //melhorando os dados binários para caracteres //forçando encoding
        BufferedReader br = new BufferedReader(isr); //lendo os caracteres

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }

}
