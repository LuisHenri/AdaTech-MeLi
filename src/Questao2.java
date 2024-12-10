/*
Dada uma turma de alunos com N alunos, sendo que essa quantidade deve ser solicitada e
definida pelo usuário, solicite o nome e a nota de cada um dos alunos. Seu programa deve
imprimir apenas aqueles alunos que tiraram nota maior que a média da nota de todos os
alunos.
 */

// "maior que" (>) -> Se todos tiraram a mesma nota, ninguém vai ser impresso na tela.

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        String[] nomes = new String[quantidadeAlunos];
        double[] notas = new double[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.printf("Digite o nome do aluno %d: ", (i + 1));
            nomes[i] = scanner.next();

            System.out.printf("Digite a nota do aluno %d: ", (i + 1));
            notas[i] = scanner.nextDouble();
        }
        System.out.println();  // Skip a line

        double media = 0;
        for (int i = 0; i < quantidadeAlunos; i++) {
            media += notas[i];
        }
        media /= quantidadeAlunos;

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (notas[i] > media) {
                System.out.printf("Aluno: %s, nota: %.2f%n", nomes[i], notas[i]);
            }
        }

        scanner.close();
    }
}
