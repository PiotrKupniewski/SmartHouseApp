package communicator;

public class PrinterDevice implements Device{

    private final String name;

    public PrinterDevice(String name) {
        this.name = name;
    }

    @Override
    public void turnOffDevice() {
        System.out.println("Printer is dead!");
    }
}
