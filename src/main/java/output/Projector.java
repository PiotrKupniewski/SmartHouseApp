package output;

public class Projector implements Device, ProjectorFunctions {

    private final String name;
    private final String type;

    Projector(String name) {
        this.name = name;
        this.type = "PROJECTOR";
    }


    @Override
    public void turnOffDevice() {
        System.out.println("Projector " + name + " is turned off ");
    }

    @Override
    public String deviceType() {
        return type;
    }

    @Override
    public void projectFilm(String filmName) {
        System.out.println("Film '" + filmName + "' has been projected ");
    }
}
