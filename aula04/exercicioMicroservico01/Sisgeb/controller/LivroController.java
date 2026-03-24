package aula04.exercicioMicroservico01.Sisgeb.controller;

import java.util.*;
import aula04.exercicioMicroservico01.Sisgeb.model.Livro;
import aula04.exercicioMicroservico01.Sisgeb.view.LivroView;

public class LivroController {

    private List<Livro> livros;
    private List<LivroView> view;

    public LivroController(LivroView view) {
        this.livros = new ArrayList<>();
        this.view = view;
    }
    
}
