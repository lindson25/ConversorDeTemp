public class Formulas {
    public double celsius;
    public double fahrenheit;

    // Método para converter °C em °F
    public double setCelsius(double celsius){
        this.celsius = celsius;
        return (celsius * 1.8) + 32;
    }

    // Método para converter °F em °C
    public double setFahrenheit(double fahrenheit){
        this.fahrenheit = fahrenheit;
        return (fahrenheit - 32) / 1.8;
    }
}
