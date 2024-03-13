// Escreva um algoritmo que leia dois números digitados pelo usuário e exiba oresultado da sua soma
public class Exercicio02 {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Digite o primeiro número: ");
        double n2 = Prompt.lerDecimal("Digite o segundo número: ");

        Prompt.imprimir("A soma de n1 + n2: " + (n1 + n2));
    }
}
