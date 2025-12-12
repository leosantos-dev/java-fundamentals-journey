/**
 Projeto: Java Fundamentals Journey
 Arquivo: OperadorTernario.java
 Descrição: Operador Ternário ( ? : ).
 Autor: Leonardo
 */

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==============================================================
        // TERNÁRIO
        // Estrutura: (condicao) ? valorSeVerdadeiro : valorSeFalso;
        // Serve pra fazer uma atribuição simples só se a condição bater

        System.out.println("--- Estudo de Operador Ternário ---");

        // ==============================================================
        // EXEMPLO 1: SISTEMA DE NOTAS (Aprovado ou Reprovado)
        // ==============================================================

        System.out.print("Digite a sua pontuação (0-100): ");
        int pontuacao = scanner.nextInt();

        // Se pontuacao maior ou igual a 70, retorna "Passou'', senão "Reprovou"
        String resultado = (pontuacao >= 70) ? "Aprovado! :D" : "Reprovado! :(";

        System.out.println("Status do Aluno: " + resultado);


        // ==============================================================
        // EXEMPLO 2: PAR OU ÍMPAR
        // ==============================================================

        System.out.print("\nDigite um número inteiro para checar se é Par: ");
        int numero = scanner.nextInt();

        String parOuImpar = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.printf("O número %d é %s.\n", numero, parOuImpar);

        scanner.close();
    }
}