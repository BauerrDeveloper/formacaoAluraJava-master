package br.com.rodrigo.java.io;

import java.io.*;

public class TesteEscrita {

    public static void main(String[] args) throws IOException {

        OutputStream fos = new FileOutputStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Adicionando uma nova linha!");
        bw.newLine();
        bw.newLine();
        bw.newLine();
        bw.write("Adicionando uma nova linha após pular três linhas!");

        bw.close();

    }
}
