package questao2;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTest {
    @Test
    public void deveAutenticarLoginCorreto() {
        Login login = new Login();

        assertTrue(login.autenticar("admin", "123"));
    }

    @Test
    public void naoDeveAutenticarLoginIncorreto() {
        Login login = new Login();

        assertFalse(login.autenticar("usuario", "senha"));
    }
}
