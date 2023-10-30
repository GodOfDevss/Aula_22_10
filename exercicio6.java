import java.util.Scanner;

public class exercicio6 {

    //6. Escreva um programa para determinar a quantidade de cavalos necessários para se levantar
    // uma massa de m quilogramas
    // a uma altura de h metros em t segundos. Considere cavalos = (m * h / t) / 745,6999

    public static void main(String[] args) {
        double m, h, t, vacalos;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe a massa a ser levantada: ");
        m = input.nextDouble();

        System.out.println("Informe a altura a qual essa massa deve ser levantada: ");
        h = input.nextDouble();

        System.out.println("Informe em quantos segundos tem que ser levantada: ");
        t = input.nextDouble();

        vacalos = (m * h / t) / 745.6999;

        System.out.println(String.format("A quantida de Cavalos nescessários é de %.2f ", vacalos));
    }
}
