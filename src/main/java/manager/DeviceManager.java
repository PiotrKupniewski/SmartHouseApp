package manager;

import output.Device;
import output.DeviceFactory;
import output.PrinterDevice;
import output.Projector;
import output.TvDevice;

import java.util.List;
import java.util.stream.Collectors;

public class DeviceManager{
    private final DeviceFactory factory = new DeviceFactory();
    private final List<Device> devices = List.of(
            factory.createDevice("BossPrinter"),
            factory.createDevice("BossTV"),
            factory.createDevice("Projector")
    );

    public void turnOffDevices() {
        devices.forEach(Device::turnOffDevice);
    }

    public void printFile(String content) {
        List<Device> printersAvailable = getAllDeviceByName("PRINTER");
        var chosenPrinter = (PrinterDevice) printersAvailable.get(0);
        chosenPrinter.printFile(content);
    }

    public void changeChannel() {
        var bossTV = (TvDevice) getAllDeviceByName("TV").get(0);
        bossTV.changeChannel(2);
    }

    private List<Device> getAllDeviceByName(String deviceName) {
        return devices.stream()
                .filter(d -> d.deviceType().equalsIgnoreCase(deviceName))
                .collect(Collectors.toList());
    }

    public void turnOnTheProjector() {
        var projector = (Projector) getAllDeviceByName("PROJECTOR").get(0);
        projector.projectFilm("W pustyni i w puszczy");
    }
}
