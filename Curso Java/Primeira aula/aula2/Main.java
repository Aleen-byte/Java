package aula2;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 31;
        double salario = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$:%.2f%n", nome, idade, salario); //%f = ponto flutuante - %d = inteiro - %s = texto - %n = quebra de linha

        //double x = 10.35784;
        //int y = 32;
        //System.out.println(y);
        //System.out.println(x);
        //System.out.printf("%.2f%n", x);     //numeração com apenas duas casas decimais
        //System.out.printf("%.4f%n", x);
        //System.out.println("Bom dia!");
        //Locale.setDefault(Locale.US);       //numeração em formato Americano
        //System.out.printf("%.2f%n", x);
        //System.out.println("Resultado = " + x + " metros");
        //System.out.printf("Resultado = %.2f metros%n", x);

    }
}
