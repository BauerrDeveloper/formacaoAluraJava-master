package br.com.rodrigo.java.io;

import java.io.*;
import java.net.Socket;

public class TesteEntradaTeclado {
    public static void main(String[] args) throws IOException {

        //usado para conexões de rede.
        Socket socket = new Socket();

        InputStream fileInput =  socket.getInputStream(); // System.in; > teclado. // new FileInputStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\lorem.txt");
        Reader readFile = new InputStreamReader(fileInput);
        BufferedReader bufferLeitura = new BufferedReader(readFile);

        OutputStream fileOutput = socket.getOutputStream(); // System.out; //System.out > console. //new FileOutputStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremCopiado.txt");
        Writer readFileOut = new OutputStreamWriter(fileOutput);
        BufferedWriter bufferEscrita = new BufferedWriter(readFileOut);

        String linha = bufferLeitura.readLine();

        while (linha != null&& !linha.isEmpty()) {
            bufferEscrita.write(linha);
            linha = bufferLeitura.readLine();
            bufferEscrita.flush();
            bufferEscrita.newLine();

        }
        bufferEscrita.newLine();
        bufferEscrita.write("Finalizando o projeto.");
        bufferEscrita.close();
        bufferLeitura.close();

    }
}
