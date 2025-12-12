/**
 Projeto: Java Fundamentals Journey
 Arquivo: OperadoresBasicos.java
 Descrição: Uma demonstração prática de operadores aritméticos, atribuições com aumento,
 incrementos/decrementos e a ordem de precedência na matemática (PEMDAS)
 Autor: Leonardo
 */

public class OperadoresBasicos {

    public static void main(String[] args) {

        // ==============================================
        // 1: OPERADORES ARITMÉTICOS BÁSICOS
        // ==============================================

        int x = 10;
        int y = 3;
        int z;

        System.out.println("--- Aritmética Básica (x=10, y=3) ---");

        z = x + y;
        System.out.println("Soma (x + y): " + z);

        z = x - y;
        System.out.println("Subtração (x - y): " + z);

        z = x * y;
        System.out.println("Multiplicação (x * y): " + z);

        z = x / y;
        // Divisão de inteiros (10 / 3) resulta em 3, porque o decimal não é contado
        System.out.println("Divisão Inteira (x / y): " + z);

        z = x % y;
        // O operador % devolve só o resto da divisão. (10 dividido por 3 sobra 1).
        System.out.println("Módulo/Resto (x % y): " + z);

        // ==============================================
        // 2: ATRIBUIÇÃO AUMENTADA (ATALHOS)
        // ==============================================
        // Jeito de escrever código mais limpo e rápido

        System.out.println("\n--- Atribuição Aumentada ---");

        int a = 10;
        // Forma longa: a = a + 2;
        a += 2;
        System.out.println("10 += 2 resulta em: " + a);

        a -= 5; // Agora 'a' vale 12, então 12 - 5 = 7
        System.out.println("12 -= 5 resulta em: " + a);

        a *= 2; // 7 * 2 = 14
        System.out.println("7 *= 2 resulta em: " + a);

        // ==============================================
        // 3: INCREMENTO E DECREMENTO
        // ==============================================

        System.out.println("\n--- Incremento e Decremento ---");

        int contador = 0;
        contador++; // O mesmo que contador = contador + 1
        System.out.println("Contador++: " + contador);

        contador--; // O mesmo que contador = contador - 1
        System.out.println("Contador--: " + contador);

        // ==============================================
        // 4: ORDEM DE OPERAÇÕES (PEMDAS)
        // ==============================================
        // P (Parênteses) -> E (Expoentes) -> M/D (Multiplicação/Divisão) -> A/S (Adição/Subtração)

        System.out.println("\n--- Ordem de Operações (P-E-M-D-A-S) ---");

        // Se fizer sem parênteses: 3 + 4 * 2 / 2.0 = 7.0
        // Com parênteses forçamos o (7-5) primeiro.
        // Usar '2.0' força o resultado a ser double (decimal).
        double resultado = 3 + 4 * (7 - 5) / 2.0;

        System.out.println("Expressão: 3 + 4 * (7 - 5) / 2.0");
        System.out.println("Resultado: " + resultado);
    }
}