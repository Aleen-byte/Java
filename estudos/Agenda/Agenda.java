package Agenda;



import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void registrarContato(Contato novoContato){
        contatos.add(novoContato);
        System.out.println("Contato cadastrado com sucesso!");
    }

    public void listarContatos(){
        System.out.println("###########################   Agenda   ####################################");
        System.out.println(" ");
        for (Contato contato : contatos) {
            System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone());
        }
        System.out.println(" ");
        System.out.println("##########################################################################");
    }
}
