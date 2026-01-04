import java.util.Scanner;

public class LojaDePocoes {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int ouro = 100;
        int precoPocao = 15;
        int quantidade;
        int custoTotal;

        System.out.println("------- Bem-Vindo(a) a minha Loja de Poções-------");
        System.out.println("Seu saldo atual: " + ouro + " moedas");
        System.out.println("Poção de vida: " + precoPocao + " moedas");

        System.out.print("Quantas poções você quer comprar?: ");
        quantidade = scanner.nextInt();

        custoTotal = quantidade * precoPocao;

        if(custoTotal > ouro){
            System.out.println("Você não tem moedas o suficiente para comprar!");
        }
        else{
            System.out.println("Você comprou " + quantidade + " poções");
        }


    }


}
