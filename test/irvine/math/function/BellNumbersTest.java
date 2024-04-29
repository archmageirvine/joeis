package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class BellNumbersTest extends TestCase {

  public void test() {
    final Function1 f = new BellNumbers();
    assertEquals(1, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(5, f.l(3));
    assertEquals(52, f.l(5));
  }
}
