package Agenda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda minhaAgenda = new Agenda();
        String nome;
        int telefone;
        int opcoes = 1;


        System.out.println("Bem vindo a sua Agenda!");
        while (opcoes != 0) {
            System.out.println("Qual opção deseja executar?");
            System.out.println("1 - registrar Contato");
            System.out.println("2 - listar Contatos");
            System.out.println("0 - Sair da Agenda");
            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes) {
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    nome = sc.nextLine();
                    System.out.println("Digite o telefone do contato: ");
                    telefone = sc.nextInt();
                    sc.nextLine();
                    Contato contato = new Contato(nome, telefone);
                    minhaAgenda.registrarContato(contato);

                    System.out.println(" ");
                    break;

                case 2:
                    minhaAgenda.listarContatos();
                    break;

                case 0:
                    System.out.println("Até mais!");
                    break;

                default:
                    System.out.println("Digite uma opção válida!");

            }
        }




    }
}
