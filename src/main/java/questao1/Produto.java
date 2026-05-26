package questao1;

public class Produto {
    // Aplica 10% de desconto sobre o valor informado.
    public double calcularDesconto(double valor) {
        return valor * 0.90;
    }

    // Retorna true quando o valor da compra permite frete gratis.
    public boolean freteGratis(double valor) {
        return valor > 100;
    }
}
