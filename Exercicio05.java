//  Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valorda variável A passe a ser o valor da variável B e o valor da variável B passe a ser ovalor da variável A. Apresentar uma mensagem com o valor original de cada variávele outra com os valores trocados
public class Exercicio05 {
    public static void executar() {
        double A = Prompt.lerDecimal("Digite o primeiro número: ");
        double B = Prompt.lerDecimal("Digite o segundo número: ");
        
       Prompt.imprimir("Valor original A: " + A);
       Prompt.imprimir("Valor original B: " + B);

        double A1 = B;
        double B1 = A;

       Prompt.imprimir("Valor trocado A: " + A1);
       Prompt.imprimir("Valor trocado B: " + B1);
    }
}
