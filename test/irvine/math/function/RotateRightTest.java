package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RotateRightTest extends TestCase {

  public void test() {
    final Function2 f = new RotateRight();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(1, f.l(10));
    assertEquals(4123, f.l(1234));
  }
}
