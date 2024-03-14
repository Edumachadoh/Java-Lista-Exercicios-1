//  media ponderada
public class Exercicio17 {
    public static void executar() {
        double n1 = Prompt.lerDecimal("Nota 1: ");
        double n2 = Prompt.lerDecimal("Nota 2: ");
        double n3 = Prompt.lerDecimal("Nota 3: ");
        
        double p1 = Prompt.lerDecimal("Peso 1: ");
        double p2 = Prompt.lerDecimal("Peso 2: ");
        double p3 = Prompt.lerDecimal("Peso 3: ");

        double mediaP = (n1*p1 + n2*p2 + n3*p3) / (p1 +p2 +p3);

        System.out.printf("Média ponderada: %.1f", mediaP);
    }
}
