package Exercicios1;
//Fazer um programa que indique se um número é par ou ímpar


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Informe um numero para ser verificado: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O seu número é Par");
        } else {
            System.out.println("O seu número é Ímpar");
        }

        sc.close();
    }
}
