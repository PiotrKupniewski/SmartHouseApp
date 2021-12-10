package manager;

import communicator.Device;
import communicator.DeviceCommunicator;

import java.util.List;

public class DeviceManager {


  public DeviceManager() {
  }

  public void turnOffDevices() {
    DeviceCommunicator communicator = new DeviceCommunicator();
    List<Device> allDevices = communicator.getAllDevices();
    allDevices.stream()
            .forEach(Device::turnOffDevice);
  }
}
