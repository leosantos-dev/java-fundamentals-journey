import java.util.Scanner;

public class ValidadorDeSenhas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senha;

        System.out.println("--- Validador de Senhas ---");
        System.out.print("Digite sua senha: ");
        senha = scanner.nextLine();

        if(senha.length() < 8 || senha.length() > 20) {
            System.out.println("A senha deve conter entre 8 e 20 caracteres");
        }
        else if(senha.contains("12345678") || senha.contains("87654321")) {
            System.out.println("Defina uma senha mais segura!");
        }
        else if(senha.contains(" ")){
            System.out.println("Não é permitido espaços!");
        }
        else {
            System.out.println("Sua senha foi definida!");
        }

    }
}
