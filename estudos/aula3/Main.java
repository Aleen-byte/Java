package aula3;


import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {


        //ArrayList<Tipo> -> nome -> new ArrayList<Tipo>();
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Uva");          // posição 0
        frutas.add("Abacaxi");
        frutas.add("Banana");
        frutas.add("Manga");
        frutas.add("Maçã");
        frutas.add("Laranja");      // posição 5
        frutas.add(0,"Abacate");
        frutas.add(0,"Amora");

        Collections.sort(frutas,Collections.reverseOrder());

        for (String elemento : frutas) {
            System.out.println(elemento);
        }






    }
}

