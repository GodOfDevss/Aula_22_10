import java.util.Scanner;

public class exercicio4 {
    //4. Uma parede em formato retangular, cuja altura é hp (altura da parede)
    // e a largura lp (largura da parede) precisa ser coberta por azulejos também retangulares.
    // O azulejo retangular tem dimensões ha (altura do azulejo) e la (largura do azulejo).
    // Escreva um programa que leia as quatro medidas hp, lp, ha e la,
    // calcule e imprima quanto azulejos com as medidas dadas são necessários para cobrir a parede dada.

    public static void main(String[] args) {
        double hp, lp, ha, la, qtd;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a altura da parede: ");
        hp = input.nextDouble();

        System.out.println("Informe a largura da parede: ");
        lp = input.nextDouble();

        System.out.println("Informe a altura do azulejo: ");
        ha = input.nextDouble();

        System.out.println("Informe a largura do azulejo: ");
        la = input.nextDouble();

        qtd = (hp * lp) / (ha * la);

        System.out.println(String.format("A quantidade de azulejos nescessaria para revestir esta parede é %.2f m² de azulejos.", qtd));

    }
}
