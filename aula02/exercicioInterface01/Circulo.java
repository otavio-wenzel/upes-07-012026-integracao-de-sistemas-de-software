package aula02.exercicioInterface01;

public class Circulo implements Forma {

    double raio;

    @Override
    public double calcularArea() {
        double area = 3.1415 * this.raio * this.raio;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * 3.1415 * raio;
        return perimetro;
    }
    
}