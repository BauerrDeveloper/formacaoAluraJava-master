package br.com.rodrigo.java.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        //PrintStream printStream = new PrintStream(new File("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremPrintStream.txt"))
        //PrintWriter printWriter = new PrintWriter("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremPrintStream.txt")

        PrintStream printStream = new PrintStream("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremPrintStream.txt");
        printStream.println("Esta linha foi escrita com o método println da classe printStream.");
        printStream.println();
        printStream.print("Finalizando o projeto.");

        printStream.close();

    }

}
