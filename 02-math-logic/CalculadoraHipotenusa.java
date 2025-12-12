/**
 Projeto: Java Fundamentals Journey
 Arquivo: CalculadoraHipotenusa.java
 Descrição: Aplicação do Teorema de Pitágoras usando métodos estáticos da classe Math.
 Autor: Leonardo
 */

import java.util.Scanner;

public class CalculadoraHipotenusa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double catetoA;
        double catetoB;
        double hipotenusa;

        System.out.println("--- Teorema de Pitágoras ---");

        System.out.print("Digite o valor do Cateto A (cm): ");
        catetoA = scanner.nextDouble();

        System.out.print("Digite o valor do Cateto B (cm): ");
        catetoB = scanner.nextDouble();

        // Fórmula: c = raizQuadrada(a² + b²)
        // Math.sqrt = Square Root (Raiz Quadrada)
        // Math.pow = Power (Potência)
        hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        // Formatando a saída para mostrar apenas 2 casas decimais
        System.out.printf("A hipotenusa é: %.2f cm\n", hipotenusa);

        scanner.close();
    }
}