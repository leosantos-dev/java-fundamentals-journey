/**
 Projeto: Java Fundamentals Journey
 Arquivo: ConversorPeso.java
 Descrição: Ferramenta de conversão de unidades (Libras e Quilogramas).
 Autor: Leonardo
 */

import java.util.Scanner;

public class ConversorPeso {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ===========================================
        // VARIÁVEIS
        // ===========================================

        // Em vez de usar o número 2.205 'solto' no código, criamos uma constante.
        // E se a taxa mudar algum dia, mudamos só aqui:
        final double FATOR_CONVERSAO = 2.205;

        double peso;
        double pesoConvertido;
        int opcao;

        // ==========================================
        // MENU INTERATIVO
        // ==========================================

        System.out.println("--- Conversor de Unidades de Peso ---");
        System.out.println("1: Converter Libras (lbs) -> Quilos (kgs)");
        System.out.println("2: Converter Quilos (kgs) -> Libras (lbs)");

        System.out.print("Escolha uma opção (1 ou 2): ");
        opcao = scanner.nextInt();

        // ===========================================
        // CONVERSÃO
        // ===========================================

        if (opcao == 1) {
            // Lbs para Kgs (Divisão)
            System.out.print("Digite o peso em Libras (lbs): ");
            peso = scanner.nextDouble();

            pesoConvertido = peso / FATOR_CONVERSAO;

            System.out.printf("Resultado: %.3f lbs equivalem a %.3f kgs.\n", peso, pesoConvertido);

        } else if (opcao == 2) {
            // Kgs para Lbs (Multiplicação)
            System.out.print("Digite o peso em Quilos (kgs): ");
            peso = scanner.nextDouble();

            pesoConvertido = peso * FATOR_CONVERSAO;

            System.out.printf("Resultado: %.3f kgs equivalem a %.3f lbs.\n", peso, pesoConvertido);

        } else {
            // Se der erro
            System.out.println("Erro: Opção inválida. Por favor reinicie o programa.");
        }

        scanner.close();
    }
}