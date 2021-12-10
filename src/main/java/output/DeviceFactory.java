package output;

public class DeviceFactory {

    public Device createDevice(String name) {
        if (name.toLowerCase().contains("printer")) {
            return new PrinterDevice(name);
        } else if (name.toLowerCase().contains("tv")) {
            return new TvDevice(name);
        } else if (name.toLowerCase().contains("projector")) {
            return new Projector(name);
        } else {
            throw new UnsupportedOperationException("Unsupported device");
        }
    }

}
