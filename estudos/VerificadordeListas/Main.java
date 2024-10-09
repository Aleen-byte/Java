package VerificadordeListas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] idades = new int[]{15,22,18,25,30};

        System.out.println("Informe a idade que deseja pesquisar: ");
        int x = sc.nextInt();

        boolean resultado = VerificarNumero(idades,x);
        if (resultado) {
            System.out.println("A idade está na lista!");
        } else {
            System.out.println("A idade não está na lista!");
        }


    }

    public static boolean VerificarNumero(int[] idades, int x) {
        for (int i : idades) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
}
