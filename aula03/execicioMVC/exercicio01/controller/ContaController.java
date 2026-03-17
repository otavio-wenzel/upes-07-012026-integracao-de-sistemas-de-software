package execicioMVC.exercicio01.controller;

import java.util.ArrayList;
import java.util.List;
import execicioMVC.exercicio01.model.*;
import execicioMVC.exercicio01.view.*;

public class ContaController {

    private List<Conta> contas;
    private ContaView view;

    public ContaController(ContaView view){
        this.contas = new ArrayList<>();
        this.view = view;
    }

    public void criarConta(String nome, double saldo) {
        Conta conta = new Conta(nome, saldo);
        contas.add(conta);
        view.mostrarMensagem("Conta criada!");
    }

    public void exibirConta(){
        Conta contas;
        view.exibirConta(contas);
        return;
    }
    
}
