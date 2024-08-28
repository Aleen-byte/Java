
import java.util.Scanner;

public class medianotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {

            System.out.println("Digite a sua primeira nota.");
            double n1 = entrada.nextDouble();

            System.out.println("Digite sua segunda nota.");
            double n2 = entrada.nextDouble();

            System.out.println("Digite a sua terceira nota.");
            double n3 = entrada.nextDouble();

            double resultado = (n1 + n2 + n3) / 3;

            System.out.println("Sua média é: " + resultado);

            System.out.println("Deseja continuar? Ex: (s/n");
            String resposta = entrada.next();
                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Obrigado por usar a calculadora de médias.");
                }

        }
        entrada.close();
    }
}
