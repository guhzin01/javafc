package questao1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProdutoTest {
    @Test
    public void deveCalcularDescontoDeDezPorCento() {
        Produto produto = new Produto();

        assertEquals(90.0, produto.calcularDesconto(100.0), 0.001);
    }

    @Test
    public void deveTerFreteGratisAcimaDeCem() {
        Produto produto = new Produto();

        assertTrue(produto.freteGratis(150.0));
    }

    @Test
    public void naoDeveTerFreteGratisAteCem() {
        Produto produto = new Produto();

        assertFalse(produto.freteGratis(100.0));
    }
}
