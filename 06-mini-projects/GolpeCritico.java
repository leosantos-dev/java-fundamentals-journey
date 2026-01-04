import java.util.Random;

public class GolpeCritico {
    public static void main(String[] args){

        Random random = new Random();

        int danoBase = 20;
        int vidaDoInimigo = 40;
        int numeroSorteado;
        int danoTotal;

        System.out.println("------ Você encontrou um inimigo! ------");
        System.out.printf("Inimigo: Orc - %d\n", vidaDoInimigo);
        System.out.print("Girando o dado mágico do destino...\n");

        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(700); // Espera 0.7 segundos
                System.out.print("."); // Imprime um ponto
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();

        numeroSorteado = random.nextInt(1, 21);

        if(numeroSorteado <= 5){
            danoTotal = danoBase + numeroSorteado;
            vidaDoInimigo = vidaDoInimigo - danoTotal;
            System.out.printf("Você tirou %d, um ATAQUE NORMAL, o inimigo ficou com %d de vida", numeroSorteado, vidaDoInimigo);
        } else if(numeroSorteado <= 15){
            danoTotal = danoBase + numeroSorteado;
            vidaDoInimigo = vidaDoInimigo - danoTotal;
            System.out.printf("Você tirou %d, um ATAQUE FORTE, o inimigo ficou com %d de vida", numeroSorteado, vidaDoInimigo);
        } else{
            System.out.println("Você acertou um CRÍTICO!");
            System.out.println("O inimigo morreu!");
        }
    }
}
