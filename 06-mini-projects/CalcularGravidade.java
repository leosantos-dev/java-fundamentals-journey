import java.util.Scanner;

public class CalcularGravidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean planetaValido = true;
        double pesoTerra;
        double pesoFinal = 0;
        double gravidadeMercurio = 0.37;
        double gravidadeVenus = 0.88;
        double gravidadeMarte = 0.38;
        double gravidadeJupiter = 2.64;
        double gravidadeSaturno = 1.15;
        double gravidadeLua = 0.17;
        int planetaEscolhido;

        System.out.println("--- Conversor de Peso Interplanetário ---");
        System.out.print("Digite o seu peso (kg): ");
        pesoTerra = scanner.nextDouble();

        System.out.println("--- Digite o número do planeta de destino ---");
        System.out.println("1: Mercúrio");
        System.out.println("2: Vênus");
        System.out.println("3: Marte");
        System.out.println("4: Júpiter");
        System.out.println("5: Saturno");
        System.out.println("6: Lua");
        planetaEscolhido = scanner.nextInt();

        switch(planetaEscolhido){
            case 1 -> pesoFinal = pesoTerra * gravidadeMercurio;
            case 2 -> pesoFinal = pesoTerra * gravidadeVenus;
            case 3 -> pesoFinal = pesoTerra * gravidadeMarte;
            case 4 -> pesoFinal = pesoTerra * gravidadeJupiter;
            case 5 -> pesoFinal = pesoTerra * gravidadeSaturno;
            case 6 -> pesoFinal = pesoTerra * gravidadeLua;
            default -> {
                    System.out.println("Digite apenas os números mencionados acima!");
                    planetaValido = false;
            }
        }

        if(planetaValido){
            System.out.printf("Esse será o seu peso final: %.2fkg", pesoFinal);
        }

        scanner.close();
    }
}
