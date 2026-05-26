package questao4;

public class Aluno {
    // Calcula a media entre duas notas.
    public double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2;
    }

    // Retorna true quando a media for maior ou igual a 7.
    public boolean aprovado(double media) {
        return media >= 7;
    }
}
