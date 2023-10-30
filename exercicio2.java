import java.util.Scanner;

public class exercicio2 {
    //2. Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas.
    // Fazer um algoritmo que calcule e escreva:
    //a. a maior e a menor altura do grupo;
    //b. média de altura dos homens;
    //c. o número de mulheres.
    public static void main(String[] args) {
            int sexo, homens = 0, mulheres = 0;
            float altura, somaH = 0, mediaH = 0, maior = 0, menor = Float.MAX_VALUE;

            Scanner input = new Scanner(System.in);

            for (int i = 0; i < 10; i++) {
                System.out.println("1-HOMEM \n2-MULHER");
                System.out.println("Digite o sexo: ");
                sexo = input.nextInt();

                System.out.println("Digite a altura: ");
                altura = input.nextFloat();

                if (sexo == 1) {
                    homens++;
                    somaH = somaH + altura;
                } else if (sexo == 2) {
                    mulheres++;
                } else {
                    System.out.println("Opção inválida");
                }

                if (altura > maior) {
                    maior = altura;
                }
                if (altura < menor) {
                    menor = altura;
                }
                mediaH = somaH / homens;
            }
            System.out.println(String.format("A maior altura é de %.2f m e a menor é de %.2f m", maior, menor));
            System.out.println(String.format("A média de altura dos Homens é de %.2f m", mediaH));
            System.out.println(String.format("O número de Mulheres é de %d", mulheres));
            input.close();
    }
}


