package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SyndromeTest extends TestCase {

  public void test() {
    final Function1 f = new Syndrome();
    assertEquals(1, f.i(0));
    assertEquals(2, f.i(1));
    assertEquals(4, f.l(2));
    assertEquals(6, f.i(21));
    assertEquals(0b1111111111, f.i(9876543210L));
  }
}
