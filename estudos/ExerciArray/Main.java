package ExerciArray;

public class Main {
    public static void main(String[] args) {


        Contato[] agenda = new Contato[5];
        Contato c1 = new Contato("Kleiton", 988654738);

        agenda[0] = c1;
        agenda[1] = new Contato("Thiago", 9746351);
        agenda[2] = new Contato("Craudin", 7459060);
        agenda[3] = new Contato("Michael", 988654738);
        agenda[4] = new Contato("Julia", 988654738);

        for (int i = 0; i < agenda.length; i++) {
            System.out.println("Nome do contato: " + agenda[i].getNome());
            System.out.println("Telefone do contato: " + agenda[i].getTelefone());
            System.out.println(" ");
        }




    }
}
