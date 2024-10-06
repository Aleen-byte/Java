package aula9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um numero referente aos dias de semana: ");
        int x = sc.nextInt();
        String dia = switch (x) {
            case 1 -> "Domingo";
            case 2 -> "Segunda";
            case 3 -> "Terceira";
            case 4 -> "Quarta";
            case 5 -> "Quinta";
            case 6 -> "Sexta";
            case 7 -> "Sabado";
            default -> "Valor invalido";
        };
        //switch (x) {
        //            case 1:
        //                dia = "Domingo";
        //                break;
        //            case 2:
        //                dia = "Segunda";
        //                break;
        //            case 3:
        //                dia = "Terceira";
        //                break;
        //            case 4:
        //                dia = "Quarta";
        //                break;
        //            case 5:
        //                dia = "Quinta";
        //                break;
        //            case 6:
        //                dia = "Sexta";
        //                break;
        //            case 7:
        //                dia = "Sabado";
        //                break;
        //            default:
        //                dia = "Valor invalido";
        //                break;
        //        }

        System.out.println("Dia da semana: " + dia);


        sc.close();
    }
}
