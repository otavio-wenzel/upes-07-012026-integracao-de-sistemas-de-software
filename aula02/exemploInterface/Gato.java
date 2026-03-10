package aula02.exemploInterface;

class Gato implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}