package aula02.exemploInterface;

public class Teste {
    public static void main(String[] args) {

        Animal a1 = new Gato();
        Animal a2 = new Cachorro();

        a1.emitirSom();
        a2.emitirSom();

    }
    
}