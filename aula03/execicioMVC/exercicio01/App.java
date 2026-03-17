package execicioMVC.exercicio01;

import execicioMVC.exercicio01.controller.*;
import execicioMVC.exercicio01.view.ContaView;
import execicioMVC.exercicio01.model.*;

public class App {

    public static void main(String[] args) {
        
        ContaView v = new ContaView();
        ContaController c = new ContaController(v);

        c.criarConta("João", 12);
        c.exibirConta();

    }
    
}
