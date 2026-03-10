package aula02.exercicioInterface01;

public class Teste {
    public static void main(String[] args) {
        
        Retangulo f1 = new Retangulo();
        f1.base = 6.0;
        f1.altura = 2.0;
        System.out.println("Área: " + f1.calcularArea() + "cm");
        System.out.println("Perímetro: " + f1.calcularPerimetro() + "cm");

        Circulo f2 = new Circulo();
        f2.raio = 14.4;
        System.out.println("Área: " + f2.calcularArea() + "cm");
        System.out.println("Perímetro: " + f2.calcularPerimetro() + "cm");

    }
    
}