package br.com.rodrigo.java.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TesteAplicando {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s1 = "13º Órgão Oficial";
        byte[] bytes = s1.getBytes();
        String s2 = new String(bytes, "UTF-8");
        System.out.println(s1);
        System.out.println(s2);

        try {
            Scanner scanner = new Scanner(new File("dados.txt", StandardCharsets.UTF_8.name()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
