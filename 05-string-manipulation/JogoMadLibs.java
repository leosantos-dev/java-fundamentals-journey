/**
 Projeto: Java Fundamentals Journey
 Arquivo: JogoMadLibs.java
 Descrição: Jogo de palavras interativo
 Autor: Leonardo
 */

// Importando a classe para fazer a leitura de dados
import java.util.Scanner;

public class JogoMadLibs {
    public static void main (String[] args) {

        // ==============================================
        // DECLARAÇÃO DE VARIÁVEIS/CONFIGURAÇÃO
        // ==============================================

        Scanner scanner = new Scanner(System.in);

        // Declarando as variáveis em String para armazenar palavras/frases do usuário.
        String adjetivo1;
        String adjetivo2;
        String adjetivo3;
        String verbo;
        String substantivo;

        // ==============================================
        // COLETA DE DADOS
        // ==============================================

        System.out.println("--- Bem-vindo ao Jogo Mad Libs! ---");
        System.out.println("Preencha os dados abaixo para criar uma história maluca.\n");

        System.out.print("Me diga um adjetivo (descrição): ");
        adjetivo1 = scanner.nextLine();
        System.out.print("Outro adjetivo (descrição): ");
        adjetivo2 = scanner.nextLine();
        System.out.print("Mais um adjetivo (descrição): ");
        adjetivo3 = scanner.nextLine();
        System.out.print("Agora um verbo (terminando com ndo): ");
        verbo = scanner.nextLine();
        System.out.print("E um substantivo (animal ou pessoa): ");
        substantivo = scanner.nextLine();

        // ==============================================
        // UNIÃO DOS DADOS RECEBIDOS (A HISTÓRIA)
        // ==============================================

        // Aqui usei o operador '+' para juntar as variáveis dentro do texto.
        // O '\n' no início cria uma linha em branco.
        System.out.println("\nEu fui pra um parque de diversão MUITO " + adjetivo1 + "...");
        System.out.println("E nele tinha um " + substantivo + ".");
        System.out.println("O " + substantivo + " estava " + adjetivo2 + " e " + verbo + "!");
        System.out.println("Eu estava muito " + adjetivo3 + "!");

        // Encerrando fechando o Scanner para não continuar a consumir recursos do sistema.
        scanner.close();
    }
}
