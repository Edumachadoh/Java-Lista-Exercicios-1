//  media harmonica
public class Exercicio18 {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Nota 1: ");
        double n2 = Prompt.lerDecimal("Nota 2: ");
        double n3 = Prompt.lerDecimal("Nota 3: ");

        double mediaA = (3 / ((1 / n1) + (1/n2) + (1/n3))); 

        System.out.printf("Média harmônica: %.1f", mediaA);
    }
}
