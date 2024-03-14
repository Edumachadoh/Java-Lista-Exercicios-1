// Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo deoperador em outra variável do tipo CARACTERE. Imprima o resultado da operação
//de A por B se o operador aritmético for válido; caso contrário deve ser impresso umamensagem de operador não definido. Tratar erro de divisão por zero.
public class Exercicio13 {
    public static void executar() {
        double A = Prompt.lerDecimal("Primeiro valor: ");
        double B = Prompt.lerDecimal("Segundo valor: ");

        char carac = Prompt.lerCaractere("Digite o operador: ");

        if (carac == '*') {
            Prompt.imprimir("Multiplicacao: " + (A * B));
        }

        if (carac == '/') {
            Prompt.imprimir("Divisao: " + (A / B));
        }

        if (carac == '+') {
            Prompt.imprimir("Soma: " + (A + B));
        }

        if (carac == '-') {
            Prompt.imprimir("Subtracao: " + (A - B));
        }
    }
}
