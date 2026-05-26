package questao5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TemperaturaTest {
    @Test
    public void deveConverterCelsiusParaFahrenheit() {
        Temperatura temperatura = new Temperatura();

        assertEquals(86.0, temperatura.converterCelsiusParaFahrenheit(30.0), 0.001);
    }

    @Test
    public void deveIdentificarTemperaturaAlta() {
        Temperatura temperatura = new Temperatura();

        assertTrue(temperatura.temperaturaAlta(31.0));
    }

    @Test
    public void naoDeveIdentificarTemperaturaAlta() {
        Temperatura temperatura = new Temperatura();

        assertFalse(temperatura.temperaturaAlta(30.0));
    }
}
