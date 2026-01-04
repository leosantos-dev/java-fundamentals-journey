import java.util.Scanner;

public class EnhancedSwitches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nomeMonstro;

        System.out.print("Digite o nome de um monstro que você JÁ encontrou: ");
        nomeMonstro = scanner.nextLine();

        switch (nomeMonstro) {
            case "Slime", "Cogumelo", "Porco", "Lesma"       -> System.out.println("Esse monstro é FÁCIL, tem <100 HP");
            case "Polvo", "Cogumelo Zombie", "Golem"         -> System.out.println("Esse monstro é MÉDIO, tem >100 HP");
            case "Balrog", "Pianus", "Zakum", "Papulatus"    -> System.out.println("Esse monstro é DIFÍCIL, tem >1000 HP");
            default                                          -> System.out.println("O(A) " + nomeMonstro + " você ainda não conhece, tenha cuidado!");
        }

        scanner.close();
    }

}

