package irvine.oeis.a219;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A219180Test extends TestCase {

  public void testB() {
    assertEquals("[0, 1]", Arrays.toString(new A219180().get(2, 1)));
    assertEquals("[0, 0, 1, 1]", Arrays.toString(new A219180().get(12, 5)));
    assertEquals("[0, 1, 1]", Arrays.toString(new A219180().get(13, 6)));
  }
}
