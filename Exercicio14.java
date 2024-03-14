//  expressão an = a1 + (n – 1) * r é denominada termo geral da ProgressãoAritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmoque encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n =7, r = 3. Resultado: an = 28
public class Exercicio14 {
    public static void executar() {
        int a1 = Prompt.lerInteiro("Digite a1: ");
        int r = Prompt.lerInteiro("Digite r: ");
        int n = Prompt.lerInteiro("Digite n: ");

        double an = a1 + (n - 1) * r;

        Prompt.imprimir("an: "+ an);
    }
}
