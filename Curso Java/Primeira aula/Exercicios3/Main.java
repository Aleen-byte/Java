package Exercicios3;
//Calcular a duração de um Jogo



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horainicio;
        int horafinal;

        System.out.println("Informe o horário de incio do Jogo: (Ex: 16)");
        horainicio = sc.nextInt();
        System.out.println("Informe o horário do fim do Jogo: (Ex: 18)");
        horafinal = sc.nextInt();

        int duracao;

        if (horainicio >= 0 && horainicio <= 23 && horafinal >= 0 && horafinal <= 23) {
            if (horainicio < horafinal) {
                duracao = horafinal - horainicio;
            } else {
                duracao = (24 - horainicio) + horafinal;
            }
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }else {
            System.out.println("Valor digitado incorreto!");
        }




        sc.close();

    }
}
