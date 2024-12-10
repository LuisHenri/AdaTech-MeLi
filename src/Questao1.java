/*
Um motorista precisa abastecer seu carro para uma viagem. O carro tem um consumo médio
de combustível de 12 km por litro e o motorista planeja percorrer uma distância de 360
km. Crie um programa que solicite o preço do combustível por litro ao usuário e calcule
o custo total da viagem. Além disso, informe quantos litros de combustível serão
necessários para completar a viagem.
 */


import java.util.Scanner;

public class Questao1 {
    static final double CONSUMO_MEDIO = 12.0;  // km/L
    static final double DISTANCIA = 360.0;  // km


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do combustível por litro: ");
        double precoCombustivel = scanner.nextDouble();

        double litrosNecessarios = DISTANCIA / CONSUMO_MEDIO;
        double custoTotal = litrosNecessarios * precoCombustivel;

        System.out.printf("Litros necessários: %.2f%n", litrosNecessarios);
        System.out.printf("Custo total: R$ %.2f%n", custoTotal);

        scanner.close();
    }
}
