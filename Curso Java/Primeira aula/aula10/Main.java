package aula10;
// Estudando condicional ternária




public class Main {
    public static void main(String[] args) {

        double preco = 34.5;
        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;

        System.out.printf("Seu desconto é de: %.2f",desconto);



    }
}
