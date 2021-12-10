package output;

public class TvDevice implements Device, TVFunctions {

    private final String name;
    private final String type;

    TvDevice(String name) {
        this.name = name;
        this.type = "TV";
    }

    @Override
    public void turnOffDevice() {
        System.out.println("Tv " + name + " is turned off ");
    }

    @Override
    public String deviceType() {
        return type;
    }

    @Override
    public void changeChannel(Integer channelNumber) {
        System.out.println("Channel was changed to number : 2 ");
    }
}
