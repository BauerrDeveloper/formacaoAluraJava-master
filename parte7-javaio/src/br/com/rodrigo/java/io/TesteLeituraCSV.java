package br.com.rodrigo.java.io;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("C:\\Users\\Casal\\Downloads\\formacaoAluraJava-master\\formacaoAluraJava-master\\contasNovo.csv"), "UTF-8");//for�ando o encoding

         while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println("Leitura do arquivo original: " + linha);

            Scanner linhaScanner = new Scanner(linha);//cria��o do Scanner baseado na linha
            linhaScanner.useLocale(Locale.US); //define o idioma do c�digo, evitando problemas de identifica��o de doubles por exemplo. ("," ou ".")
            linhaScanner.useDelimiter(","); //defini��o do caracter separador das informa��es.

            String tipoDeConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numeroDaConta = linhaScanner.nextInt();
            String titularDaConta = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            String[] valores = linha.split(",");
            System.out.println(Arrays.toString(valores));
            System.out.println(valores[3]);
            System.out.println("");

            System.out.println("Tipo de Conta: " + tipoDeConta + System.lineSeparator() + "N�mero da Ag�ncia: " + agencia + System.lineSeparator() + "N�mero da Conta: " + numeroDaConta + System.lineSeparator() +
                     "Nome do Titular: " + titularDaConta + System.lineSeparator() + "Saldo: R$ " + saldo);
            System.out.println("");

            String valoresFormatados = String.format("Tipo de conta: %s %nAg�ncia: %04d %nN�mero da Conta: %08d %nNome do Titular: %s %nSaldo: R$ %.2f", tipoDeConta, agencia, numeroDaConta, titularDaConta, saldo);
            System.out.println(valoresFormatados);
            System.out.println("");

            System.out.format("Tipo de conta: %s %nAg�ncia: %04d %nN�mero da Conta: %08d %nNome do Titular: %s %nSaldo: R$ %.2f%n", tipoDeConta, agencia, numeroDaConta, titularDaConta, saldo);
            System.out.println("");
            linhaScanner.close();
        }
         scanner.close();
    }
}
