/*
 Projeto: Java Fundamentals Journey
 Arquivo: CarrinhoDeCompras.java
 Descrição: Simulação de sistema de checkout simples.
 Autor: Leonardo
 */
import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args) {

        // ==============================================
        // 1: DECLARAÇÃO DE VARIÁVEIS/CONFIGURAÇÃO
        // ==============================================

        Scanner scanner = new Scanner(System.in);

        int quantidade;
        double preco;
        double total;
        String item;
        String moeda = "R$";

        // ==============================================
        // 2: COLETA DE DADOS
        // ==============================================

        System.out.print("Qual item você deseja comprar?: ");
        item = scanner.nextLine();
        System.out.print("Qual seria a quantia desse item?: ");
        quantidade = scanner.nextInt();
        System.out.print("Qual valor você gostaria de gastar por item?: ");
        preco = scanner.nextDouble();

        // ==============================================
        // 3: PROCESSAMENTO
        // ==============================================

        // Cálculo simples de Preço * Quantidade
        total = preco * quantidade;

        // ==============================================
        // 4: MOSTRAR RESULTADOS
        // ==============================================

        // O '\n' cria um espaço antes do resultado final
        System.out.println("\n--- Resumo do Pedido ---");
        System.out.println("Produto: " + item);
        System.out.println("Quantidade: " + quantidade);

        // Exibe o total com a moeda escolhida
        System.out.println("TOTAL A PAGAR: " + moeda + " " + total);

        // Fechando o Scanner, mantendo boas práticas de liberar recursos
        scanner.close();
    }


}
