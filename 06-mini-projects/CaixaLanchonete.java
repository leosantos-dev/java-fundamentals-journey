import java.util.Scanner;

public class CaixaLanchonete {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numero1 = 15.00;
        double numero2 = 22.50;
        double numero3 = 12.00;
        double numero4 = 5.00;
        double valorTotal = 0;
        int numeroPedido;
        int quantidadePedido;
        boolean pedidoValido = true;

        System.out.println("---- Menu da Lanchonete ----");
        System.out.println("Número 1: Hambúrguer   - R$15,00");
        System.out.println("Número 2: X-Bacon      - R$22,50");
        System.out.println("Número 3: Batata Frita - R$12,00");
        System.out.println("Número 4: Refrigerante - R$5,00");
        System.out.print("Digite o número do item que gostaria de comprar: ");
        numeroPedido = scanner.nextInt();

        System.out.print("Qual a quantidade desejada?: ");
        quantidadePedido = scanner.nextInt();

        switch(numeroPedido) {
            case 1 -> valorTotal = numero1 * quantidadePedido;
            case 2 -> valorTotal = numero2 * quantidadePedido;
            case 3 -> valorTotal = numero3 * quantidadePedido;
            case 4 -> valorTotal = numero4 * quantidadePedido;
            default -> {
                System.out.println("Voce não digitou certo!");
                pedidoValido = false;
            }
        }

        if(pedidoValido){
            System.out.printf("Total do pedido: R$%.2f", valorTotal);
        }

        scanner.close();
    }
}
