package questao5;

public class Temperatura {
    // Converte uma temperatura em Celsius para Fahrenheit.
    public double converterCelsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Retorna true quando a temperatura for maior que 30 graus.
    public boolean temperaturaAlta(double celsius) {
        return celsius > 30;
    }
}
