package output;

public class PrinterDevice implements Device, PrinterFunctions {

    private final String name;
    private final String type;

    PrinterDevice(String name) {
        this.name = name;
        this.type = "PRINTER";
    }

    public void printFile(String fileName){
        //TODO walidacja czy printer is busy etc
        System.out.println("File " + fileName + " printed");
    }

    @Override
    public void turnOffDevice() {
        System.out.println(name + "  is dead!");
    }

    @Override
    public String deviceType() {
        return type;
    }

    @Override
    public String toString() {
        return "PrinterDevice{" +
                "name='" + name + '\'' +
                '}';
    }
}
