package questao4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AlunoTest {
    @Test
    public void deveCalcularMedia() {
        Aluno aluno = new Aluno();

        assertEquals(8.0, aluno.calcularMedia(7.0, 9.0), 0.001);
    }

    @Test
    public void deveAprovarAlunoComMediaMaiorOuIgualASete() {
        Aluno aluno = new Aluno();

        assertTrue(aluno.aprovado(7.0));
    }

    @Test
    public void deveReprovarAlunoComMediaMenorQueSete() {
        Aluno aluno = new Aluno();

        assertFalse(aluno.aprovado(6.9));
    }
}
