package aula04.exercicioMicroservico01.Sisgeb.model;

public class Livro {

    int id;
    String titulo;

    public Livro(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    
}