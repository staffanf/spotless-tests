package se.stuff.other;

import se.stuff.OtherClass;
import Im.An.Old.Lib.Whose.A.Fan.Of.PascalCase;

public class App {
  public String getGreeting() {
    PascalCase upperCaseImport = new PascalCase();
    OtherClass otherClass = new OtherClass();
    return "Hello world.";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
  }
}
