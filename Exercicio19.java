//  media harmonica
public class Exercicio19 {
    public static void executar() {
        double raio = Prompt.lerDecimal("Raio: ");
        double altura = Prompt.lerDecimal("Altura: ");

        double volume = 3.14 * (raio * raio) * altura;

        System.out.printf("Volume do cilindro: %.1f", volume);
    }
}
