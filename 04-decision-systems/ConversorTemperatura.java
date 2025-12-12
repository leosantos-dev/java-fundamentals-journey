/**
 Projeto: Java Fundamentals Journey
 Arquivo: ConversorTemperatura.java
 Descrição: Conversor de Celsius e Fahrenheit.
 Autor: Leonardo
 */

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temperaturaInicial;
        double temperaturaFinal;
        String unidade;

        System.out.println("--- Conversor de Temperatura ---");

        System.out.print("Digite o valor da temperatura: ");
        temperaturaInicial = scanner.nextDouble();

        System.out.print("Converter para Celsius ou Fahrenheit? (Digite C ou F): ");
        // .toUpperCase() vai garantir que mesmo se digitar 'c' minúsculo, o código entende 'C'
        unidade = scanner.next().toUpperCase();

        // ==============================================================
        // LÓGICA DE CONVERSÃO
        // ==============================================================

        // .equals() para comparar Strings (aparenta mais seguro que .contains() nesse caso)
        if (unidade.equals("C")) {
            // Fórmula: Fahrenheit -> Celsius
            // (F - 32) * 5 / 9
            temperaturaFinal = (temperaturaInicial - 32) * 5.0 / 9.0;

            System.out.printf("Resultado: %.1f°C\n", temperaturaFinal);

        } else if (unidade.equals("F")) {
            // Fórmula: Celsius -> Fahrenheit
            // (C * 9 / 5) + 32

            // Ex.: 9/5 resulta em 1 (divisão inteira).
            // Para ter 1.8, uso 9.0/5.0 ou multiplicar por 1.8 direto.
            temperaturaFinal = (temperaturaInicial * 1.8) + 32;

            System.out.printf("Resultado: %.1f°F\n", temperaturaFinal);

        } else {
            System.out.println("Erro: Unidade inválida. Por favor digite C ou F.");
        }

        scanner.close();
    }
}