package questao2;

public class Login {
    // Autentica apenas o usuario admin com a senha 123.
    public boolean autenticar(String usuario, String senha) {
        return "admin".equals(usuario) && "123".equals(senha);
    }
}
