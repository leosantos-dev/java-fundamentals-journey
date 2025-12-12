/**
 Projeto: Java Fundamentals Journey
 Arquivo: TutorialPrintf.java
 Descrição: Tutorial de formatação de saída, controlando quantidade de decimais, alinhamento, preenchimento e formatação monetária
 Autor: Leonardo
 */

public class TutorialPrintf {
    public static void main(String[] args){

        // ==============================================
        // ESTRUTURA DO PRINTF
        // ==============================================
        // %[flags][width][.precision][specifier-character]
        //printf() = é o método para formatar o output
        //Char = c / String = s / Int = d / Double = f / Boolean = b

        System.out.println("--- 1. ESPECIFICADORES DE TIPO (Specifiers) ---");

        String nome = "Roberto";
        char primeiraLetra = 'R';
        int idade = 50;
        double altura = 1.80;
        boolean estaEmpregado = true;

        System.out.printf("Olá %s\n", nome);
        System.out.printf("Seu nome começa com a letra %c\n", primeiraLetra);
        System.out.printf("Você tem %d anos\n", idade);
        System.out.printf("Você tem %.2f metros de altura\n", altura); // .2 limita a 2 casas decimais
        System.out.printf("Empregado: %b\n\n", estaEmpregado);

        // Combinando tudo junto
        System.out.printf("%s tem %.2f metros de altura", nome, altura);


        // ==============================================
        // PRECISÃO E FLAGS (Formatação Financeira)
        // ==============================================

        System.out.println("\n--- 2. FLAGS E FORMATAÇÃO FINANCEIRA ---");

        double preco1 = 9.99;
        double preco2 = 1000.99;
        double preco3 = -139.13;
        double preco4 = -1100000.99;

        // O '+': Mostra o sinal positivo
        System.out.printf("Com sinal (+): %+ .2f\n", preco1);

        // O ',': Adiciona separador de milhar
        System.out.printf("Com separador de milhar: %,.2f\n", preco2);

        // O '(': Números negativos ficam entre parênteses
        System.out.printf("Negativo: %(.2f\n", preco3);

        // O ' ' (Espaço): Deixa um espaço em branco se for positivo (faz alinhar com os negativos)
        System.out.printf("Alinhamento com espaço (Positivo): % .2f\n", preco2);
        System.out.printf("Alinhamento com espaço (Negativo): % .2f\n", preco3);

        // Combinando Flags: Separador de milhar + Negativo
        System.out.printf("Valor alto formatado: %,.2f\n", preco4);


        // ==============================================
        // LARGURA E ALINHAMENTO (WIDTH & PADDING)
        // ==============================================

        System.out.println("\n--- 3. LARGURA E PREENCHIMENTO ---");

        int id1 = 1;
        int id2 = 44;
        int id3 = 999;
        int id4 = 5655;

        // %04d -> Preenche com zeros à esquerda até completar 4 dígitos
        System.out.printf("Zero Padding (%%04d): %04d\n", id1);
        System.out.printf("Zero Padding (%%04d): %04d\n", id2);

        // %4d -> Alinha à DIREITA ocupando 4 espaços
        System.out.println("\nAlinhado à Direita:");
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id4);

        // %-4d -> Alinha à ESQUERDA ocupando 4 espaços
        System.out.println("\nAlinhado à Esquerda:");
        System.out.printf("%-4d (ID gerado)\n", id3);
        System.out.printf("%-4d (ID gerado)\n", id4);
    }
}