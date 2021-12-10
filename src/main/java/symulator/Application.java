package symulator;

import input.Tablet;
import input.UserDevice;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        UserDevice mobile = new Tablet();
        startProgram(mobile);
    }

    private static void startProgram(UserDevice device) {
        System.out.println("        ");
        System.out.println("====================  MENU   =====================");
        System.out.println("1. Switch off all devices");
        System.out.println("2. Print file");
        System.out.println("3. Change TV channel");
        System.out.println("4. Project film");
        System.out.println("9. Exit");

        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        device.processUserInput(inputNumber);

        startProgram(device);
    }
}
// kolejny use case
// wskazać plik do wydrukowania i zmienić kanał w telewizoze

