package aula8; // Estudando if e else

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Que horas são?");
        hora = sc.nextInt();

        if (hora >= 5 && hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora >= 12 && hora < 18) {
            System.out.println("Boa tarde!");
        } else if (hora >= 18 && hora < 24 || hora >= 0 && hora <= 4) {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Horário inexistente!");
        }

        sc.close();
    }
}
