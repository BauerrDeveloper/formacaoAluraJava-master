package br.com.rodrigo.dominandoCollections.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {

        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);
        System.out.println("----------------------------");

        aulas.remove(0);
        System.out.println(aulas);
        System.out.println("----------------------------");

        //pode ser usado para qualquer coleção, incluindo arrays
        //para cada string s dentro de aulas, faça o seguinte:
        for (String s : aulas ) {
            System.out.println("Aula: " + s);
        }
        System.out.println("----------------------------");

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula é: " + primeiraAula);
        System.out.println("----------------------------");

        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula: " + aulas.get(i));
        }
        System.out.println("----------------------------");

        aulas.forEach(aula -> {System.out.println("Percorrendo: " + aula);});
        System.out.println("----------------------------");


        aulas.add("Aumentando nosso conhecimento");
        System.out.println(aulas);
        Collections.sort(aulas);
        System.out.println("----------------------------");
        System.out.println("Lista ordenada de Aulas: " + aulas);
        System.out.println("----------------------------");

    }

}
