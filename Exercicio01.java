/* Escreva um algoritmo que leia um número digitado pelo usuário e mostre amensagem “Número maior do que 10!”, caso este número seja maior, ou “Númeromenor ou igual a 10!”, caso este número seja menor ou igual */

public class Exercicio01 {
    public static void executar() {
          double n = Prompt.lerDecimal("Digite um número: ");

          if (n > 10) {
            Prompt.imprimir("Número maior que 10!");
          } else {
            Prompt.imprimir("Número menor ou igual a 10!");
          }
    }
}
