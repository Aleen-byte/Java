import java.text.DecimalFormat;

public class FormatacaoDecimal {
    public static void main(String[] args) {
        // Suponha que você tenha um número de ponto flutuante
        double numero = 123.456789;

        // Cria um objeto DecimalFormat para formatar o número
        DecimalFormat formato = new DecimalFormat("#.00");

        // Formata o número e exibe o resultado
        String resultadoFormatado = formato.format(numero);
        System.out.println("Número formatado: " + resultadoFormatado);
    }
}
//////////////////////////////////////////////////////////////////////////////
