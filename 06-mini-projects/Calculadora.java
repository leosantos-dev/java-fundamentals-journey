import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {

     Scanner scanner = new Scanner(System.in);
     double numero1;
     double numero2;
     double resultado = 0;
     char operador;
     boolean operadorValido = true;

        System.out.print("Digite o primeiro numero: ");
        numero1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, , /, ^): ");
        operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo numero: ");
        numero2 = scanner.nextDouble();

        switch (operador) {
            case '+' -> resultado = numero1 + numero2;
            case '-' -> resultado = numero1 - numero2;
            case '*' -> resultado = numero1 * numero2;
            case '/' -> {
                if (numero2 == 0) {
                    System.out.println("Não é possível dividir por zero");
                    operadorValido = false;
                }
                else {
                    resultado = numero1 / numero2;
                }
            }
            case '^' -> resultado = Math.pow(numero1, numero2);
            default -> {
                System.out.println("Operador invalido!");
                operadorValido = false;
            }
        }

        if(operadorValido) {
            System.out.printf("Resultado: %,.3f", resultado);
        }
     scanner.close();
    }
}
