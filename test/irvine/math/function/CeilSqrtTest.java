package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CeilSqrtTest extends TestCase {

  public void test() {
    final Function1 f = new CeilSqrt();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(4, f.l(10));
    assertEquals(4, f.l(16));
  }
}
