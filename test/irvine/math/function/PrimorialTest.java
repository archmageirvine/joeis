package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PrimorialTest extends TestCase {

  public void test() {
    final Function1 f = new Primorial();
    assertEquals(1, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(210, f.l(7));
    assertEquals(210, f.l(8));
    assertEquals(210, f.l(8));
    assertEquals(210, f.l(10));
    assertEquals(2310, f.l(11));
    assertEquals(6, f.l(3));
  }
}
