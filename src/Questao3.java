/*
Uma família está dividindo uma pizza entre seus membros. Crie um programa que solicite o
número de membros da família e o número de fatias da pizza. O programa deve calcular
quantas fatias cada membro vai receber, e informar se haverá sobras e quantas fatias
sobrarão. Se a pizza não puder ser igualmente dividida, o programa deve sugerir
quantas fatias adicionais são necessárias para que todos recebam a mesma quantidade.
 */

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de membros da família: ");
        int numeroMembros = scanner.nextInt();

        System.out.print("Digite o número de fatias da pizza: ");
        int numeroFatias = scanner.nextInt();

        int fatiasPorMembro = numeroFatias / numeroMembros;
        int sobras = numeroFatias % numeroMembros;

        System.out.printf("Cada membro recebe %d fatia%s.%n", fatiasPorMembro, fatiasPorMembro == 1 ? "" : "s");

        if (sobras > 0) {
            System.out.printf("Haver%s %d sobras.%n", sobras == 1 ? "á" : "ão", sobras);
        } else {
            System.out.println("Não haverão sobras.");
        }

        if (sobras > 0) {
            int fatiasNecessarias = numeroMembros - sobras;
            System.out.printf("Sugere-se adicionar %d fatia%s%n", fatiasNecessarias, fatiasNecessarias == 1 ? "" : "s");
        }

        scanner.close();
    }
}
