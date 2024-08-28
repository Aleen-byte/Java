
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class IMCCal {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            
            
            
            while (continuar) {
                
                System.out.println("Bem vindo a Calculinha de IMC");
                System.out.println("Digite sua Altura, Ex: 1,72");
                double altura = scanner.nextDouble();
                
                System.out.println("Digite seu peso, Ex 88");
                double peso = scanner.nextDouble();
                
                //
                
                double altura2 = altura * altura;
                
                BigDecimal altdec = new BigDecimal(altura2);
                
                BigDecimal alturaform = altdec.setScale(2, RoundingMode.HALF_UP);
                
                Double altformd = alturaform.doubleValue();
                
                double imc = peso / altformd;
                
                System.out.printf("Resultado do IMC: %.2f\n" , imc);
                
                //
                if (imc < 18.5) {
                    System.out.println("Você está abaixo do peso.");
                } else if (imc >= 18.5 && imc < 24.9) {
                    System.out.println("Seu peso está normal.");
                } else if (imc >= 25.0 && imc < 29.9) {
                    System.out.println("Você está com sobrepeso.");
                } else {
                    System.out.println("Você está com obesidade.");
                }
                
                System.out.println("Deseja realizar outra operação? (s/n): ");
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase("n")) {
                    continuar = false;
                    System.out.println("Obrigado por usar a Calculinha de IMC");
                }
                
            }
        }
    }
    
}
