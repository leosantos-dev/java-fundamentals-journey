/*
 Projeto: Java Fundamentals Journey
 Arquivo: CalculadoraGeometrica.java
 Descrição: Calculadora para medir círculos e esferas
 Autor: Leonardo
 */
import java.util.Scanner;

public class CalculadoraGeometrica {

    public static void main(String[] args){

        /*System.out.println(Math.PI);
        System.out.println(Math.E);


        double resultado;

        // Eleva um número a uma potência (2³ = 8)
        resultado = Math.pow(2, 3);

        // Deixa o número sempre positivo
        resultado = Math.abs(-5);

        // Raiz quadrada
        resultado = Math.sqrt(9);

        // Arredonda pro número mais próximo
        resultado = Math.round(3.14);

        // Arredonda pra cima
        resultado = Math.ceil(3.14);

        // Arredonda pra baixo
        resultado = Math.floor(3.99);

        // Retorna o maior número
        resultado = Math.max(10, 20);

        // Retorna o menor número
        resultado = Math.min(10, 20);

        System.out.println(resultado);


        //HIPOTENUSA c = Math.sqrt((Math.pow(DENOMINADOR, 2) + Math.pow(DENOMINADOR, 2));

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Quanto mede o lado A?: ");
        a = scanner.nextDouble();
        System.out.print("Quanto mede o lado B?: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("A hipotenusa é: " + c + "cm²");

        scanner.close():

         */

        Scanner scanner = new Scanner(System.in);

        double raio;
        double circunferencia;
        double area;
        double volume;

        System.out.println("--- Calculadora Geométrica ---");
        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        // Cálculos matemáticos

        // 'Math.PI' traz o valor de Pi
        circunferencia = 2 * Math.PI * raio;

        // 'Math.pow' (base, exponente) é usado para potências
        area = Math.PI * Math.pow(raio, 2);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        // SAÍDA FORMATADA

        //USAR "%.NUMERO" PARA QUANTIDADE DE NUMEROS DEPOIS DA VIRGULA
        System.out.println("\n--- Resultados ---");
        System.out.printf("Circunferência: %.2fcm\n" , circunferencia);
        System.out.printf("Área do círculo: %.2fcm²\n" , area);
        System.out.printf("O volume é: %.2fcm³\n" , volume);



        scanner.close();

    }
}
