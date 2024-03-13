//  Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Casoo usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Númeroinválido!”
public class Exercicio10 {
    public static void executar() {
        int n = Prompt.lerInteiro("Digite um numero entre 1 e 5: ");

        if (n == 1) {
            Prompt.imprimir("Um");
        }

        else if (n == 2) {
            Prompt.imprimir("Dois");
        }

        else if (n == 3) {
            Prompt.imprimir("Três");
        }

        else if (n == 4) {
            Prompt.imprimir("Quatro");
        }

        else if (n == 5) {
            Prompt.imprimir("Cinco");
        } else {
            Prompt.imprimir("Número inválido!");
        }

        
    }
}
