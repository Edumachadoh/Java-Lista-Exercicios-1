// Escreva um algoritmo que leia três valores inteiros distintos e escreva-os emordem crescente
public class Exercicio11 {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Digite o valor 1: ");
        double n2 = Prompt.lerDecimal("Digite o valor 2: ");
        double n3 = Prompt.lerDecimal("Digite o valor 3: ");

        if (n1 > n2 && n2 > n3) {
            Prompt.imprimir(n3 +" "+ n2 +" "+ n1);
        } else if (n2 > n1 && n1 > n3) {
            Prompt.imprimir(n3 +" "+ n1 +" "+ n2);
        } else if (n1 > n3 && n3 > n2) {
            Prompt.imprimir(n2 +" "+ n3 +" "+ n1);
        } else if (n2 > n3 && n3 > n1) {
            Prompt.imprimir(n1 +" "+ n3 +" "+ n2);
        } else if (n3 > n2 && n2 > n1) {
            Prompt.imprimir(n1 +" "+ n2 +" "+ n3);
        } else if (n3 > n1 && n1 > n2) {
            Prompt.imprimir(n2 +" "+ n1 +" "+ n3);
        } else if (n1 == n2 && n3 > n1) {
            Prompt.imprimir(n2 +" "+ n1 +" "+ n3);
        } else if (n1 == n2 && n3 < n1) {
            Prompt.imprimir(n3 +" "+ n2 +" "+ n1);
        } else if (n2 == n3 && n1 > n2) {
            Prompt.imprimir(n3 +" "+ n2 +" "+ n1);
        } else if (n2 == n3 && n1 < n2) {
            Prompt.imprimir(n1 +" "+ n2 +" "+ n3);
        } else if (n1 == n3 && n1 < n2) {
            Prompt.imprimir(n3 +" "+ n1 +" "+ n2);
        } else if (n1 == n3 && n1 > n2) {
            Prompt.imprimir(n3 +" "+ n2 +" "+ n1);
        }
    }
}
