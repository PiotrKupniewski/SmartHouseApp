package communicator;

import java.util.List;

public class DeviceCommunicator {

    DevicesMock devicesMock = new DevicesMock();

    public List<Device> getAllDevices() {
        return devicesMock.getDevices();
    }
}
