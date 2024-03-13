//  Escreva um algoritmo que leia um número e mostre uma mensagem caso estenúmero seja maior ou igual a 50, outra se ele for menor que 50
public class Exercicio08 {
    public static void executar() {
        double n = Prompt.lerDecimal("Digite um número: ");

        if (n >= 50) {
            Prompt.imprimir("Número maior que 50");
        } else {
            Prompt.imprimir("Número menor que 50");
        }
        
    }
}
