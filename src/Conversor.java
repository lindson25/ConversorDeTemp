import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Formulas formulas = new Formulas();

        try {
            // Menu
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("[1] Converter temperatura de celsius para fahrenheit.");
            System.out.println("[2] Converter temperatura de fahrenheit para celsius.");
            String menu = scan.nextLine();
            double menu_double = Double.parseDouble(menu);

            // Processo para conversão de °C para °F
            if (menu_double == 1) {
                System.out.println("Agora, digite o valor em °C para realizar a conversão para °F: ");
                menu = scan.nextLine();
                formulas.celsius = Double.parseDouble(menu);
                double calculation = formulas.setCelsius(formulas.celsius);
                System.out.println("O valor convertido é " + calculation + " °F." );

            // Processo para conversão de °F para °C
            } else if (menu_double == 2) {
                System.out.println("Agora, digite o valor em °F para realizar a conversão para °C: ");
                menu = scan.nextLine();
                formulas.fahrenheit = Double.parseDouble(menu);
                double calculation = formulas.setFahrenheit(formulas.fahrenheit);
                System.out.println("O valor convertido é " + calculation + " °C." );

            // Caso o usuário não digite um número do menu, será exibido a mensagem abaixo.
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        // Caso ocorra algum erro na conversão, será exibido a mensagem abaixo.
        } catch (NumberFormatException e) {
            System.out.println("[ERRO] Digite um número válido!");
        }
        scan.close();
    }
}
