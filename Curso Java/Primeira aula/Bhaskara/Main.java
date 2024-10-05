package Bhaskara;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, delta;
        double x1, x2;
        System.out.println("Bem vindo à Calculadora de Bhaskara!");
        System.out.println("Digite os valores das variaveis (a, b, c) ");
        System.out.println("Valor de (a) :");
        a = sc.nextDouble();
        sc.nextLine();
        System.out.println("Valor de (b) :");
        b = sc.nextDouble();
        sc.nextLine();
        System.out.println("Valor de (c) :");
        c = sc.nextDouble();
        sc.nextLine();

        delta = Math.pow(b,2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("Aqui estão suas respostas:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
