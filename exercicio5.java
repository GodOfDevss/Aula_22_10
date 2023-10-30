import java.util.Scanner;

public class exercicio5 {

    //5. Calcular e apresentar o valor do volume de uma lata de óleo,
    // utilizando fórmula: V = 3.14159 * R * R * A, em que
    // as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
    //Vamos declarar as variáveis V, R e A como double e definir um valor qualquer para as variáveis de altura e
    // de raio.

    public static void main(String[] args) {
        double r, v, a;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do Raio da lata: ");
        r = input.nextDouble();

        System.out.println("Digite a altura da lata: ");
        a = input.nextDouble();

        v = 3.14159 * r * r * a;

        System.out.println(String.format("O volume da lata de oleo é %.2f cm³", v));
    }
}
