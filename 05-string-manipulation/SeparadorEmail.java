/**
 Projeto: Java Fundamentals Journey
 Arquivo: SeparadorEmail.java
 Descrição: Método de extrair uma porção da String
 Separa dinamicamente o usuário e o domínio de um e-mail utilizando manipulação de índices.
 Autor: Leonardo
 */

import java.util.Scanner;

public class SeparadorEmail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ==================================================
        // ENTRADA DE DADOS
        // ==================================================

        System.out.println("--- Extrator de Dados de E-mail ---");
        System.out.print("Digite o seu e-mail completo: ");

        // .trim() remove espaços acidentais que o usuário possa ter digitado antes ou depois
        String email = scanner.nextLine().trim();

        String username;
        String dominio;

        // ====================================================
        // VALIDAÇÃO E PROCESSAMENTO
        // ====================================================

        // Um e-mail precisa ter o símbolo '@'
        if (email.contains("@")) {

            // Encontrar o ponto de corte (o índice do arroba)
            int indexArroba = email.indexOf("@");

            // Extrair o Username
            // substring(inicio, fim) -> O fim é exclusivo (não inclui o caractere do índice final)
            // Então vai do 0 até o caractere ANTES do @
            username = email.substring(0, indexArroba);

            // Extrair o Domínio
            // substring(inicio) -> Quando passamos só um parâmetro, ele vai até o final da String.
            // 'indexArroba + 1' para começar DEPOIS do @.
            dominio = email.substring(indexArroba + 1);

            // ==============================================================
            // 3. SAÍDA DE DADOS
            // ==============================================================

            System.out.println("\n--- Dados Extraídos ---");
            System.out.println("E-mail: " + email);
            System.out.println("Usuário: " + username);
            System.out.println("Domínio: " + dominio);

        } else {
            System.out.println("ERRO: Por favor, digite um e-mail válido.");
        }

        scanner.close();
    }
}