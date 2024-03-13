// Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração,multiplicação e a divisão dos números lidos
public class Exercicio04 {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double n2 = Prompt.lerDecimal("Digite o segundo número: ");
        
        Prompt.imprimir("Soma: "+ (n1 + n2));
        Prompt.imprimir("Multiplicação: "+ (n1 * n2));
        Prompt.imprimir("Divisão: "+ (n1 / n2));
    }
}
