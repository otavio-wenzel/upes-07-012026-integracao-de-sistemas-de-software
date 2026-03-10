package aula02.exercicioInterface01;

public class Retangulo implements Forma{

    double base;
    double altura;

    @Override
    public double calcularArea() {
        double area = this.base * this.altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * (this.base + this.altura);
        return perimetro;
    }
}