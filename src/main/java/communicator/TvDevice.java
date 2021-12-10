package communicator;

public class TvDevice implements Device {

    private final String name;

    public TvDevice(String name) {
        this.name = name;
    }

    @Override
    public void turnOffDevice() {
        System.out.println("Tv " + name +" is turned off ");
    }
}
