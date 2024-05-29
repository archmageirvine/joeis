package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitLengthTest extends TestCase {

  public void test() {
    final Function2D f = new DigitLength();
    assertEquals(1, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(2, f.l(10));
    assertEquals(4, f.l(1234));
    assertEquals(4, f.l(2, 10));
    assertEquals(3, f.l(3, 10));
  }
}
