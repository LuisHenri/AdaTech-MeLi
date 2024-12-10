/*
Um número para ser considerado primo deve ser divisível apenas por 1 e ele mesmo.
Considerando isso, crie um programa que vai solicitar um número para o usuário e dizer
se ele é primo.
 */

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();

        boolean primo = true;
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        System.out.printf("O número %d %s primo%n", numero, primo ? "é" : "não é");

        scanner.close();
    }
}
