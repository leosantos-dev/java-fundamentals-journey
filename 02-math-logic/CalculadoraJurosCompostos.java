/**
 Projeto: Java Fundamentals Journey
 Arquivo: TutorialPrintf.java
 Descrição: Tutorial de formatação de saída, controlando quantidade de decimais, alinhamento, preenchimento e formatação monetária
 Autor: Leonardo
 */
import java.util.Scanner;

public class CalculadoraJurosCompostos {

    public static void main(String[] args) {

        // ==============================================================
        // CONFIGURAÇÃO E VARIÁVEIS
        // ==============================================================
        Scanner scanner = new Scanner(System.in);

        // Variáveis financeiras
        double principal;       // Valor Inicial
        double rate;            // Taxa de Juros Anual
        int timesCompounded;    // Frequência de composição por ano
        int years;              // Tempo em anos
        double amount;          // Montante Final

        // ==============================================================
        // ENTRADA DE DADOS
        // ==============================================================

        System.out.println("--- Calculadora de Juros Compostos ---");

        System.out.print("Digite o valor do investimento inicial: R$ ");
        principal = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (%): ");
        // Dividimos por 100 pra converter porcentagem (5) em decimal (0.05), isso facilita o cálculo matemático depois.
        rate = scanner.nextDouble() / 100;

        System.out.print("Quantas vezes os juros são compostos por ano? (Ex: 12 para mensal, 1 para anual): ");
        timesCompounded = scanner.nextInt();

        System.out.print("Por quantos anos o dinheiro ficará investido? ");
        years = scanner.nextInt();

        // ==============================================================
        // PROCESSAMENTO
        // ==============================================================

        // Aplicação da fórmula: A = P * (1 + r/n)^(n*t)
        // Math.pow(base, expoente).
        double base = 1 + (rate / timesCompounded);
        double exponent = timesCompounded * years;

        amount = principal * Math.pow(base, exponent);

        // ==============================================================
        // RESULTADO JÁ FORMATADO
        // ==============================================================

        System.out.println("\n--- Resultados ---");

        // %,.2f -> A vírgula (,) adiciona separador de milhar (ex: 10.000,00)
        // O .2f garante duas casas decimais para os centavos.
        System.out.printf("Investimento Inicial: R$ %,.2f\n", principal);
        System.out.printf("Taxa de Juros: %.1f%%\n", (rate * 100)); // Mostramos a taxa original
        System.out.printf("Montante Final após %d anos: R$ %,.2f\n", years, amount);
        System.out.printf("Lucro Total (Juros): R$ %,.2f\n", (amount - principal));

        scanner.close();
    }
}
