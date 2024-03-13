//  Leia dois números nas variáveis A e B e identifique se os valores são iguais oudiferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.Caso sejam diferentes, informe que são diferentes e qual número é o maior
public class Exercicio09 {
    public static void executar() {
        double A = Prompt.lerDecimal("Digite um número: ");
        double B = Prompt.lerDecimal("Digite outro número: ");

        if (A == B) {
            Prompt.imprimir("Números iguais");
        } else {
            Prompt.imprimir("Números diferentes");
        }
        
    }
}
