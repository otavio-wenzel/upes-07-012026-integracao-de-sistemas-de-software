package aula04.exemploMicroservico01.produtoServer;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class Servidor {

    public static void main(String[] args) throws Exception {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);

        server.createContext("/produtos", new ProdutoHandler());

        System.out.println("Microsserviço de Produtos rodando em http://localhost:8080/produtos");
        
        server.start();
    }
    
}