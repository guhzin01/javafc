package questao3;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class VerificadorTest {
    @Test
    public void deveIdentificarNumeroPar() {
        Verificador verificador = new Verificador();

        assertTrue(verificador.ehPar(10));
    }

    @Test
    public void deveIdentificarNumeroImpar() {
        Verificador verificador = new Verificador();

        assertFalse(verificador.ehPar(7));
    }

    @Test
    public void deveIdentificarNumeroPositivo() {
        Verificador verificador = new Verificador();

        assertTrue(verificador.ehPositivo(5));
    }

    @Test
    public void deveIdentificarNumeroNegativo() {
        Verificador verificador = new Verificador();

        assertFalse(verificador.ehPositivo(-3));
    }
}
