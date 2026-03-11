package aula02.exercicioInterface02;

public interface Pagamento {

    void pagar();
    default void imprimirRecibo() {
        System.out.println("Imprimindo recibo...");
    }
    
}