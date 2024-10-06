package Exercicios4;
//Renda                         Imposto
//de 0.00 a 2000.00             Isento
//de 2000.01 até 3000.00          8%
//de 3000.01 até 4500.00          18%
//acima de 4500.00                28%


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        double imposto;

        System.out.println("Informe o seu salário: ");
        double salario = sc.nextDouble();

        if (salario <= 2000.00) {
            imposto = salario * 0.00;
        } else if (salario <= 3000.00) {
            imposto = (salario - 2000.00) * 0.08;
        } else if (salario <= 4500.00) {
            imposto = (salario - 3000.00) * 0.18 + 1000.00 * 0.08;
        } else {
            imposto = (salario - 4500.00) * 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
        }

        if (imposto == 0) {
            System.out.println("Isento");
        } else {
            System.out.printf("Imposto: R$ %.2f", imposto);
        }

        sc.close();
    }
}
