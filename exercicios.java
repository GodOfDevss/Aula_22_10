import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class exercicios {

    //1. Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re),
    //Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8;
    // Ra = C * 1.8 + 32 + 459.67
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a temperatura em Graus celcius: ");
        double c = entrada.nextDouble();

        double F = c * 1.8 + 32;
        double K = c + 273.15;
        double re = c * 0.8;
        double ra = c * 1.8 + 32 + 459.67;

        System.out.println("A temperatura em Fahrenheit é " + F + " F");
        System.out.println("A temperatura em Kelvin é " + K + " K");
        System.out.println("A temperatura em Réamur é " + re + " Re");
        System.out.println("A temperatura em Rankine é " + ra + " Ra");

    }


}
