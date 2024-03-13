// Escreva um algoritmo que leia os valores de dois números inteiros distintos nasvariáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informarao usuário que a sequência de números informados é inválida
public class Exercicio03 {
    public static void executar() {
        int A = Prompt.lerInteiro("Digite um numero A: ");
        int B = Prompt.lerInteiro("Digite outro numero B: ");

        if (A > B) {
            Prompt.imprimir("O numero A é maior que B");
        } else if (A < B) {
            Prompt.imprimir("O numero B é maior que A");
        } else {
            Prompt.imprimir("Sequência de números inválida");
        }
    }
}
