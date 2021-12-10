import mobile.Mobile;

public class Application {

  public static void main(String[] args) {
    Mobile mobile = new Mobile();
    startProgram(mobile);
  }


  //TODO
  private static void startProgram(Mobile mobile) {
    System.out.println("        ");
    System.out.println("====================  MENU   =====================");
    System.out.println("1. Switch off all devices");
    System.out.println("2. I would like to hear something pleasant");
    System.out.println("9. Exit");

    mobile.listenClientInput();
    startProgram(mobile);
  }
}
