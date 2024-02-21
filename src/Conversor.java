import java.util.InputMismatchException;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Formulas formulas = new Formulas();

        try {
            // Exibe o menu para o usuário
            System.out.println("<<< Bem vindo ao Conversor de Temperatura! >>>");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("[0] Sair");
            System.out.println("[1] Converter temperatura de celsius para fahrenheit.");
            System.out.println("[2] Converter temperatura de fahrenheit para celsius.");
            double menu = scan.nextDouble();
            
            // Opção para sair do programa
            if (menu == 0) {
                System.out.println("Saindo do programa... Até logo!");
                System.exit(0);
            }

            // Opção para conversão de °C para °F
            else if (menu == 1) {
                System.out.println("Agora, digite o valor em °C para realizar a conversão para °F: ");
                menu = scan.nextDouble();
                double calculation = formulas.convertCelsiusToFahrenheit(menu);
                System.out.println("O valor convertido é " + calculation + " °F." );
                System.out.println("Obrigado por utilizar nossa calculadora de temperatura!" );

            // Opção para conversão de °F para °C
            } else if (menu == 2) {
                System.out.println("Agora, digite o valor em °F para realizar a conversão para °C: ");
                menu = scan.nextDouble();
                double calculation = formulas.convertFahrenheitToCelsius(menu);
                System.out.println("O valor convertido é " + calculation + " °C." );
                System.out.println("Obrigado por utilizar nossa calculadora de temperatura!" );

            // Caso o usuário não digite um número do menu, será exibido a mensagem abaixo 
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        // Caso ocorra algum erro na conversão, será exibido a mensagem abaixo.
        } catch (NumberFormatException e) {
            System.out.println("[ERRO] Digite um número válido! (NumberFormatException)");
        } catch (InputMismatchException e) {
            System.out.println("[ERRO] Digite um número válido! (InputMismatchException)");
        } finally {
            scan.close();
        }
    }
}
