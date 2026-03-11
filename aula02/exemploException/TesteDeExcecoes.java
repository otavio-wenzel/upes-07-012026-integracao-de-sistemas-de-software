package aula02.exemploException;

public class TesteDeExcecoes {
    public static void main(String[] args) {

        try {

            int x = 10 / 0;
            System.out.println("Resultado: " + x);

        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por 0");
        }

        System.out.println("Continuação de execução...");        
    }
}