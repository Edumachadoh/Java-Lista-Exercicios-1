//  media harmonica
public class Exercicio20 {
    public static void executar() {
        double horas = Prompt.lerDecimal("Horas de viajem: ");
        double velMedia = Prompt.lerDecimal("Velocidade média: ");

        double distancia = horas * velMedia;
        double litros = distancia / 12;

        System.out.printf("Distâmcia percorrida: %.1fkm\n", distancia);
        System.out.printf("Quantidade de litros gasta: %.1fL", litros);


    }
}
