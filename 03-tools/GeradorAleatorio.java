/*
 Projeto: Java Fundamentals Journey
 Arquivo: GeradorAleatorio.java
 Descrição: Uma demonstração da classe Random
 Autor: Leonardo
 */
import java.util.Random;

public class GeradorAleatorio {
    public static void main(String[] args){

        // Iniciando o gerador de números aleatórios
        Random random = new Random();

        // ==============================================
        // 1: GERAÇÃO DE NÚMEROS INTEIROS
        // ==============================================

        // Exemplo: Gerar um número entre 1 e 100
        // O 'nextInt(100) gera números de 0 a 99, então adicionamos '+1' para ser de 1 a 100

        int numeroAleatorio = random.nextInt(100) + 1;

        System.out.println("--- Geração de Números ---");
        System.out.println("Número sorteado (1-100): " + numeroAleatorio);

        // Exemplo: Rolagem de um dado de 20 lados
        int d20 = random.nextInt(20) + 1;
        System.out.println("Rolagem de dado D20: " + d20);

        // ==============================================
        // 2: SIMULAÇÃO DE PROBABILIDADE (BOOLEAN)
        // ==============================================

        System.out.println("\n--- Simulação: Cara ou Coroa ---");

        // nextBoolean() retorna true ou false aleatoriamente
        boolean isCara = random.nextBoolean();

        if(isCara){
            System.out.println("Resultado: Cara");
        } else{
            System.out.println("Resultado: Coroa");
        }

        // A classe Random não cria números realmente aleatórios.
        // Para criptografia ou segurança de bancos, se utilizaria 'SecureRandom'
        // Mas para jogos e outras utilizações simples, 'Random' já é suficiente
    }
}