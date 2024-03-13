//  Escreva um algoritmo que leia um número e diga, através de uma mensagem, seeste número está no intervalo entre 100 e 200. Caso o número esteja fora do intervaloo usuário também deverá ser informado
public class Exercicio07 {
    public static void executar() {
        double n = Prompt.lerDecimal("Digite um número: ");

        if (n > 100 && n < 200) {
            Prompt.imprimir(n + " está dentro do intervalo [100-200]");
        } else {
            Prompt.imprimir(n + " NÃO está dentro do intervalo [100-200]");
        }
        
    }
}
