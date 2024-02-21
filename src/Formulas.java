public class Formulas {
    private double celsius;
    private double fahrenheit;

    // Obtém o valor atual da temperatura em Celsius
    public double getCelsius() {
        return celsius;
    }

    // Obtém o valor atual da temperatura em Fahrenheit
    public double getFahrenheit() {
        return fahrenheit;
    }

    // Converte uma temperatura de Celsius para Fahrenheit
    public double convertCelsiusToFahrenheit(double celsius) {
        this.celsius = celsius;
        return (celsius * 1.8) + 32;
    }

    // Converte uma temperatura de Fahrenheit para Celsius
    public double convertFahrenheitToCelsius(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        return (fahrenheit - 32) / 1.8;
    }
}
