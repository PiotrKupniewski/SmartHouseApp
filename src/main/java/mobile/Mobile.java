package mobile;

import manager.DeviceManager;

import java.util.Scanner;

public class Mobile {

    public void listenClientInput() {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        processUserInput(inputNumber);
    }

    private void turnOffDevices() {
        DeviceManager deviceManager = new DeviceManager();
        deviceManager.turnOffDevices();
    }

    private void processUserInput(String inputNumber) {
        if (inputNumber.equals("1")) {
            turnOffDevices();
        } else if (inputNumber.equals("2")) {
            System.out.println("You look incredible!");
        } else if (inputNumber.equals("9")) {
            System.exit(1);
        }
    }
}
