package br.com.rodrigo.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaSimplificado {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremFileWriter.txt");
        fileWriter.write("Esta linha foi adicionada pelo FileWriter.");
        fileWriter.write("\n\n");
        fileWriter.write("Pulando linha com o System.lineSeparator().");
        fileWriter.write(System.lineSeparator());
        fileWriter.write(System.lineSeparator());
        fileWriter.write("Finalizando o projeto.");


     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\parte7-javaio\\loremBufferedWriterFileWriter.txt"));
     bufferedWriter.write("Esta linha foi criada usando o BufferedWriter.");
     bufferedWriter.newLine();
     bufferedWriter.newLine();
     bufferedWriter.newLine();
     bufferedWriter.write("Finalizando o projeto.");


        fileWriter.close();
        bufferedWriter.close();

    }

}
