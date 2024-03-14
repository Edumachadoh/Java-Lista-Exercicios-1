//  Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2,y2), calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz(((x2 - x1)2) + ((y2 - y1)2)). Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03
public class Exercicio15 {
    public static void executar() {
        int x1 = Prompt.lerInteiro("x1:");
        int y1 = Prompt.lerInteiro("y1:");
        int x2 = Prompt.lerInteiro("x2:");
        int y2 = Prompt.lerInteiro("y2:");

        double d = Math.sqrt((Math.pow(x2-x1, 2)) + (Math.pow(y2-y1, 2)));

        System.out.printf("Distancia entre os pontos p1(%d,%d) p2(%d,%d): %.1f", x1, y1, x2, y2, d);
    }
}
