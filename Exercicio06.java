//  Ler uma temperatura em graus Celsius e apresentá-la convertida em grausFahrenheit. 
// A fórmula de conversão é:F = (9 * C + 160) / 5
public class Exercicio06 {
    public static void executar() {
        double C = Prompt.lerDecimal("Digite a temperatura em Celcius: ");

        double F = (9 * C + 160) / 5;

        Prompt.imprimir("Convertida em Fahrenheit: " + F);
        
    }
}
