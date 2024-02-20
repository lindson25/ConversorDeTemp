import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu_conv;
        String menu;
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("[1] Converter temperatura de celsius para fahrenheit.");
        System.out.println("[2] Converter temperatura de fahrenheit para celsius.");
        menu = scan.nextLine();
        menu_conv = Integer.parseInt(menu);

        while (menu_conv != 1 && menu_conv != 2) {
            System.out.println("Opção inválida. Tente novamente.");
            menu_conv = 0;
        }










    }
}
