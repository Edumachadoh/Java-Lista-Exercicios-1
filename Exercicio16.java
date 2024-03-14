//  Elabore um algoritmo que receba três notas de um aluno e retorne a sua médiaaritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83
public class Exercicio16 {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Nota 1: ");
        double n2 = Prompt.lerDecimal("Nota 2: ");
        double n3 = Prompt.lerDecimal("Nota 3: ");

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("Média: %.1f", media);
    }
}
