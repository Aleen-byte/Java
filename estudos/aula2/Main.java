package aula2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        //ArrayList<Tipo> -> nome -> new ArrayList<Tipo>();
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("Uva");          // posição 0
        frutas.add("Abacaxi");
        frutas.add("Banana");
        frutas.add("Manga");
        frutas.add("Maçã");
        frutas.add("Laranja");      // posição 5

        System.out.println(frutas.get(4)); //print: Maçã

        System.out.println("Array fixo: ");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println(" ");

        System.out.println("Array dinamico: ");

        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        System.out.println(" ");

        for (String elemento : frutas) {
            System.out.println(elemento);
        }





    }
}
