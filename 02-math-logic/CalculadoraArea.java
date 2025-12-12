/**
 Projeto: Java Fundamentals Journey
 Arquivo: CalculadoraArea.java
 Descrição: Programa para cálculo de área em m²
 Autor: Leonardo
 */

// Importando a classe para fazer a leitura de dados
import java.util.Scanner;

public class CalculadoraArea {

    public static void main(String[] args){

        // ==============================================
        // VARIÁVEIS
        // ==============================================

        // Iniciamos com 0, mas utilizamos o DOUBLE para permitir os números decimais (Ex.: Uma parede pode ter 2.5 metros (INT não aceitaria isso))

        double largura = 0;
        double comprimento = 0;
        double metroQuadrado = 0;

        // Criando o Scanner para capturar entrada de dados
        Scanner scanner = new Scanner(System.in);

        // ==============================================
        // USUÁRIO DIGITA OS DADOS
        // ==============================================

        System.out.println("--- Calculadora de Metro Quadrado ---");
        System.out.println("Digite as medidas do cômodo/terreno abaixo:");

        System.out.print("Digite a largura (m): ");
        largura = scanner.nextDouble();

        System.out.print("Digite o comprimento (m): ");
        comprimento = scanner.nextDouble();

        // ==============================================
        // PROCESSAMENTO
        // ==============================================

        // Aplicação da fórmula matemática: Área = Largura * Comprimento
        metroQuadrado = largura * comprimento;

        // ==============================================
        // SAÍDA DE DADOS
        // ==============================================

        // Vai exibir o resultado com a unidade de medida calculada
        System.out.println("Resultado: " + metroQuadrado + "m²");

        // Fechando o Scanner para liberar recursos do sistema.
        scanner.close();

    }
}
