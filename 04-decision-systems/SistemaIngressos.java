/**
 Projeto: Java Fundamentals Journey
 Arquivo: SistemaIngressos.java
 Descrição: Sistema de precificação dinâmica de ingressos.
 Autor: Leonardo
 */

import java.util.Scanner;

public class SistemaIngressos {

    public static void main(String[] args) {

        // ==============================================
        // 1. CONFIGURAÇÃO
        // ==============================================
        Scanner scanner = new Scanner(System.in);

        // Preço base do ingresso
        double preco = 20.00;

        // Variáveis
        int idade;
        boolean eEstudante;
        boolean eIdoso;
        boolean menorDeIdade;

        // ==============================================
        // 2. CAPTURAÇÃO DE DADOS
        // ==============================================
        System.out.println("--- Bilheteria ---");
        System.out.printf("Preço Base do Ingresso: R$ %.2f\n\n", preco);

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Você é estudante? (true/false): ");
        eEstudante = scanner.nextBoolean();

        // Processando as condições com base nos inputs do usuário
        eIdoso = (idade >= 60);
        menorDeIdade = (idade < 18);

        // ==============================================
        // 3. PRECIFICAÇÃO
        // ==============================================

        System.out.println("\n--- Aplicando Descontos ---");

        // Utilizando o operador && para verificar duas condições ao mesmo tempo.
        // Isso evita criar Ifs dentro de Ifs, deixando o código mais limpo.

        if (eIdoso && eEstudante) {
            System.out.println("Desconto Combo (Idoso + Estudante): 50% OFF");
            preco *= 0.50;
        }
        else if (eIdoso) {
            System.out.println("Desconto Melhor Idade: 30% OFF");
            preco *= 0.70;
        }
        else if (eEstudante && menorDeIdade) {
            System.out.println("Desconto Estudante Junior: 40% OFF");
            preco *= 0.60;
        }
        else if (eEstudante) {
            System.out.println("Desconto Estudante Padrão: 20% OFF");
            preco *= 0.80;
        }
        else {
            System.out.println("Nenhum desconto aplicável.");
        }

        // RESULTADO FINAL

        System.out.printf("Valor Final a Pagar: R$ %.2f\n", preco);

        scanner.close();
    }
}