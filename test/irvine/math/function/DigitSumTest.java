package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitSumTest extends TestCase {

  public void test() {
    final Function2 f = new DigitSum();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(1, f.l(10));
    assertEquals(10, f.l(1234));
    assertEquals(2, f.l(2, 10));
  }
}
