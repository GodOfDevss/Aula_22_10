import java.util.Scanner;

public class exercicio3 {
    //3. Criar um programa que calcule a média de salários de uma empresa,
    // pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.
    public static void main(String[] args) {
        double n1, n2, n3, n4, media;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o 1º salário: ");
        n1 = input.nextDouble();

        System.out.println("Informe o 2º salário: ");
        n2 = input.nextDouble();

        System.out.println("Informe o 3º salário: ");
        n3 = input.nextDouble();

        System.out.println("Informe o 4º salário: ");
        n4 = input.nextDouble();

        media = (n1 + n2 + n3 + n4)/ 4;

        System.out.println(String.format("A media de salarios da emprresa é R$ %.2f",media));
    }
}
