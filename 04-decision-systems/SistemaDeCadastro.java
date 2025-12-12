/*
 Projeto: Java Fundamentals Journey
 Arquivo: SistemaDeCadastro.java
 Descrição: Sistema de validação de cadastro
 Autor: Leonardo
 */
import java.util.Scanner;

public class SistemaDeCadastro {
    public static void main (String[] args){

        // ==============================================
        // 1: DECLARAÇÃO DE VARIÁVEIS/CONFIGURAÇÃO
        // ==============================================

        Scanner scanner = new Scanner(System.in);

        int idade;
        String nome;
        boolean eEstudante;

        // ==============================================
        // 2: COLETA DE DADOS
        // ==============================================

        System.out.println("--- Ficha de Cadastro ---");

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.print("Você é um estudante? (true/false): ");
        eEstudante = scanner.nextBoolean();

        // ==============================================
        // 3: VALIDAÇÃO
        // ==============================================

        // o '.IsEmpty' verifica se o comprimento do texto é 0
        if(nome.isEmpty()){
            System.out.println("Você não digitou o seu nome!");
        } else{
            System.out.println("Olá " + nome + "!");
        }

        // É OU NÃO UM ESTUDANTE

        if(eEstudante){
            System.out.println("Você é um estudante!");
        } else{
            System.out.println("Você NÃO é um estudante!");
        }

        //IDADE

        if (idade >= 75){
            System.out.println("Você é um idoso!");
        }
        else if(idade >= 18){
            System.out.println("Você é um adulto!");
        }
        else if(idade == 0){
            System.out.println("Você é um bebê!");
        }
        else if(idade < 0){
            System.out.println("Você não nasceu ainda!");
        }
        else{
            System.out.println("Você é uma criança!");
        }

        scanner.close();
    }
}
