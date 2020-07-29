package br.com.bytebank.banco.test.util;

import java.util.*;

public class OPadraoIterador {


    public static void main(String[] args) {
/*      List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
*/

        Set<String> nomes = new HashSet<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}