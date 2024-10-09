package Aula1;
// Declarando vetores

public class Main {
    public static void main(String[] args) {

        //Tipo[] -> nome -> new Tipo[10]
        int[] notas = new int[5];
        notas[0] = 8;
        notas[1] = 7;
        notas[2] = 6;
        notas[3] = 35;
        notas[4] = 26;

        System.out.println(notas[2]);
        System.out.println(notas.length);       //tamanho do vetor


        for (int i = 0; i < notas.length; i++) {    //utilizar o for para conseguir informar todos os valores do vetor
            System.out.println(notas[i]);           //printa todos os valores do vetor
        }


    }
}
