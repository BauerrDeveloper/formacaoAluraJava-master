package br.com.rodrigo.java.io;

import java.io.*;

public class TesteCopiaArquivo {
    public static void main(String[] args) throws IOException {

        InputStream fileInput = new FileInputStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\lorem.txt");
        Reader readFile = new InputStreamReader(fileInput);
        BufferedReader bufferLeitura = new BufferedReader(readFile);

        OutputStream fileOutput = new FileOutputStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremCopiado.txt");
        Writer readFileOut = new OutputStreamWriter(fileOutput);
        BufferedWriter bufferEscrita = new BufferedWriter(readFileOut);

        String linha = bufferLeitura.readLine();

        while (linha != null) {
            bufferEscrita.write(linha);
            linha = bufferLeitura.readLine();
            bufferEscrita.newLine();

        }
        bufferEscrita.newLine();
        bufferEscrita.write("Finalizando o projeto.");
        bufferEscrita.close();
        bufferLeitura.close();

    }
}
