package aula02.exercicioException;

public class Login {

    private String usuarioCorreto = "Admin";
    private String senhaCorreta = "123";

    public void autenticar(String usuario, String senha) 
        throws LoginInvalidException {
            if(!usuario.equals(usuarioCorreto) || !senha.equals(senhaCorreta)) {
                throw new LoginInvalidException("Usuário ou senha incorretos");
            }
    }
    
}
