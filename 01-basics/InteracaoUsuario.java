/**
 Projeto: Java Fundamentals Journey
 Arquivo: InteracaoUsuario.java
 Descrição: Sistema interativo via console utilizando a classe Scanner para capturar dados.
 Autor: Leonardo
 */


// Importando a classe para ler os dados
import java.util.Scanner;

public class InteracaoUsuario {

    public static void main(String[] args) {

        // Criando o Scanner para ler o que o usuário vai digitar com o teclado(System.in é o teclado)
        Scanner scanner = new Scanner(System.in);

        // ==============================================
        // CAPTURAR O TEXTO
        // ==============================================

        System.out.print("Digite seu nome: ");
        // nextLine() pega todo o texto que o usuário digitar
        String name = scanner.nextLine();

        System.out.println("Certo, então " + name + " é o seu nome. Prazer em te conhecer!");

        System.out.print("Agora me diga o que você esperava que eu perguntasse: ");
        String segundaFala = scanner.nextLine();

        System.out.println("Interessante! Então você imaginou que eu diria: '" + segundaFala + "'.");

        // ==============================================
        // CAPTURAR OS NÚMEROS
        // ==============================================

        System.out.print("Para continuar, me informe a sua idade: ");
        // nextInt() pega apenas a parte numérica que o usuário digitou
        int idade = scanner.nextInt();

        System.out.println("Entendi! Você tem " + idade + " anos.");

        // ==============================================
        // FUNCIONAMENTO DO BOOLEAN
        // ==============================================

        System.out.print("Só pra confirmar, você está sendo sincero(a) comigo?\n");
        // nextBoolean() espera o usuário digitar "true" ou "false"
        boolean falandoAVerdade = scanner.nextBoolean();

        // Decisão baseada na resposta
        if (falandoAVerdade) {
            //Esse bloco será executado se o usuário digitar "true"
            System.out.print("Maravilha, obrigado pela sinceridade.");
        }
        else{
            //E esse será executado se o usuário digitar "false"
            System.out.println("Tudo bem, obrigado pela honestidade em admitir.");
        }

        // Necessário fechar o Scanner para liberar recursos do sistema.
        scanner.close();
    }
}
