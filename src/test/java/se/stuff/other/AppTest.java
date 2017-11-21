package se.stuff.other;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    Assert.assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }
}
