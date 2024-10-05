package aula5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y;
        y = sc.nextInt();
        System.out.println("Você digitou: " + y);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        double z;
        z = sc.nextDouble();
        System.out.println("Você digitou: " + z); // Saída padrão

        System.out.printf("Você digitou: %.2f%n", z); // Saída padrão do Sistema

        char a;
        a = sc.next().charAt(0); // Salva apenas a primeira letra do que for escrito
        System.out.println("Você digitou: " + a);

        sc.close();
    }
}
