package input;

import manager.DeviceManager;

public class Mobile implements UserDevice {

    private final DeviceManager deviceManager = new DeviceManager();

    public void processUserInput(String input) {
        if (input.equals("1")) {
            deviceManager.turnOffDevices();
        } else if (input.equals("2")) {
            deviceManager.printFile("content do druku");
        } else if (input.equals("3")) {
            deviceManager.changeChannel();
        } else if (input.equals("9")) {
            System.exit(1);
        }
    }

}
