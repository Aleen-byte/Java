package Ecercicios2;
//Ler dois valores e mostrar se eles são multiplos entre sí


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois números inteiros para descobrir se eles são multiplos entre sí: ");
        int A = sc.nextInt();
        int B = sc.nextInt();



        if (A % B == 0 || B % A == 0) {
            System.out.println("Os números são multiplos entre sí");
        } else {
            System.out.println("Os números não são multiplos entre sí");
        }


    }
}
