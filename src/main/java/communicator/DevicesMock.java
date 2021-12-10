package communicator;

import java.util.List;

public class DevicesMock {
    private final static List<Device> devices = List.of(
            new TvDevice("Drukarka1"),
            new PrinterDevice("Telewizor2")
    );

    public List<Device> getDevices() {
        return devices;
    }
}
