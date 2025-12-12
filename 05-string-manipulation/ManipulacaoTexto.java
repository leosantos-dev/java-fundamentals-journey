/**
 Projeto: Java Fundamentals Journey
 Arquivo: ManipulacaoTexto.java
 Descrição: Usando os principais métodos da classe String.
 Autor: Leonardo
 */

public class ManipulacaoTexto {

    public static void main(String[] args) {

        // String com espaços a mais apenas para teste
        String nome = "   Leonardo dos Santos   ";

        System.out.println("--- Texto Original: [" + nome + "] ---");

        // ==============================================================
        // 1. Análise de Dados
        // ==============================================================

        // length(): Retorna a quantidade total de caracteres (incluindo espaços)
        int totalCaracteres = nome.length();
        System.out.println("Total de caracteres: " + totalCaracteres);

        // charAt(index): Pega o caractere na posição X.
        // O java considera o primeiro item o 0 e não o 1
        char letraIndex3 = nome.charAt(3); // Vai pegar o QUARTO caractere podendo ser espaço ou letra
        System.out.println("Caractere no índice 3: " + letraIndex3);

        // indexOf(): mostra a posição da primeira vez que um texto/palavra aparece
        int primeiroIndex = nome.indexOf("e");
        System.out.println("Índice da primeira letra 'e': " + primeiroIndex);

        // lastIndexOf(): Encontra a posição da ÚLTIMA vez que um texto/palavra aparece
        int ultimoIndex = nome.lastIndexOf("o");
        System.out.println("Índice do último 'o': " + ultimoIndex);


        System.out.println("\n--- Transformações ---");

        // trim(): Remove espaços em branco no início e no final
        nome = nome.trim();
        // Colocamos colchetes [] para visualizar que os espaços sumiram
        System.out.println("Sem espaços (trim): [" + nome + "]");

        // toUpperCase() e toLowerCase(): Mudança de caixa
        System.out.println("Maiúsculas: " + nome.toUpperCase());
        System.out.println("Minúsculas: " + nome.toLowerCase());

        // replace(): Substituição de caracteres (ex: 'o' por 'w')
        nome = nome.replace("o", "w");
        System.out.println("Substituindo 'o' por 'w': " + nome);


        // ==============================================================
        // 3. VALIDAÇÃO
        // ==============================================================

        System.out.println("\n--- Validação ---");

        // isEmpty(): Verifica se o texto está vazio (length == 0)
        if (nome.isEmpty()) {
            System.out.println("Erro: O campo NOME está vazio");
        } else {
            System.out.println("Validação: O campo NOME está preenchido");
        }

        // contains(): Verifica se um trecho existe dentro da String
        if (nome.contains("w")) {
            System.out.println("Busca: O nome contém a letra 'w'.");
        }

        // equals(): Comparação EXATA de texto
        // equalsIgnoreCase(): Comparação ignorando maiúsculas/minúsculas
        String comparacao = "lewnardw dws santws";

        if (nome.equalsIgnoreCase(comparacao)) {
            System.out.println("Comparação: O texto é o esperado.");
        } else {
            System.out.println("Comparação: O texto é diferente.");
        }
    }
}