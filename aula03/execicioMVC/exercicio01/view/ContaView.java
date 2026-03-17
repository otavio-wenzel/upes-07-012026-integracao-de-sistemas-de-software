package execicioMVC.exercicio01.view;

import java.util.ArrayList;
import java.util.List;
import execicioMVC.exercicio01.model.Conta;

public class ContaView {

    public void exibirConta(Conta conta){
        System.out.println("Nome: " + conta.getNome());
        System.out.println("Saldo: " + conta.getSaldo());
    }

    public void mostrarMensagem(String msg){
        System.out.println(msg);
    }
    
}
