package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int idades[] = new int[5];
        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade4 = idades[3];
        System.out.println("Idade da posição 4 do vetor: " + idade4 + ".");
        System.out.println("Tamanho do vetor: " + idades.length + " posições.");

        //iniciando o array dentro de um laço
        //for (int i = 0; i < idades.length; i++) {
        //idades[i] = i * i;
        //}

        // laço para imprimir cada elemento do array
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }


    }

}