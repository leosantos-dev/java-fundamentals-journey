/**
 Projeto: Java Fundamentals Journey
 Arquivo: SintaxeBasica.java
 Descrição: Introdução na prática do Java, tipos de dados primitivos e variáveis de referência.
 Autor: Leonardo
 */

public class SintaxeBasica {

    public static void main(String[] args){

        // ==============================================
        // SAÍDA DE DADOS
        // ==============================================
        // Aqui estou demonstrando o uso de System.out.print com quebra de linha manual (\n)
        System.out.print("Java é muito divertido!\n");
        System.out.print("Eu estou adorando Java!\n");
        System.out.print("Simplesmente incrível!1!!1\n");

        // ==============================================
        // VARIÁVEIS DE TIPOS PRIMITIVOS
        // ==============================================

        // INT: Utilizado para números INTeiros (até +/- 2 bilhões)
        int idade = 65;
        int ano = 2025;

        // Juntando variáveis inteiras com Strings na saída
        System.out.println(idade);
        System.out.println("O ano atual é " + ano);

        // DOUBLE: Utilizado para números com precisão decimal
        double valor = 9.99;
        System.out.println("O valor é " + valor);

        // CHAR: Armazena um único caractere (usar aspas simples)
        char moeda = '$';
        char nota = 'A';

        System.out.println("A moeda utilizada é " + moeda);
        System.out.println("A nota dada foi " + nota);

        // BOOLEAN: Representa valores de verdadeiro ou falso
        boolean eMentiroso = false;

        // Condicional simples (If/Else) usando um valor booleano
        if (eMentiroso){
            System.out.println("Ah não! você É um mentiroso!");
        }
        else{
            System.out.println("Parabéns, você NÃO é um mentiroso!");
        }

        // ==============================================
        // VARIÁVEIS DE REFERÊNCIA
        // ==============================================

        // STRING: Representa uma sequência de caracteres
        // A classe String possui os métodos próprios (lenght, upperCase, etc)
        String nome = "Leonardo";
        String comida = "Pizza";

        System.out.println("Olá " + nome + ", seja bem vindo!");
        System.out.println("Sabemos que " + comida + " é a sua comida favorita.");
    }
}
