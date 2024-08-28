
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) { // estrutura de repetição
            
        //entrada de dados e scan de dados

        System.out.println("Bem vindo a Calculinha");
        System.out.println("Digite o primeiro número");
        double num1 = scanner.nextDouble();


        System.out.println("Digite o segundo número");
        double num2 = scanner.nextDouble();


        //inicio de switch case

        System.out.println("Escolha a operação: ");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        int operação = scanner.nextInt();  //condição do switch case
        double resultado; 


        switch (operação) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma é:" + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração é:" + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação é:" + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão é:" + resultado);
             }  else {
                System.out.println("ERRO : Não é possível dividir por 0");
             }
             break;

            default:
                System.out.println("Opção inválida.");
                break;
        }
        
        System.out.println("Deseja realizar outra operação? (s/n): ");
        String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Obrigado por usar a Calculinha");
            }

        }
        scanner.close();
    }

    
}
