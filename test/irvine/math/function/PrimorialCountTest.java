package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PrimorialCountTest extends TestCase {

  public void test() {
    final Function1 f = new PrimorialCount();
    assertEquals(1, f.l(0));
    assertEquals(2, f.l(1));
    assertEquals(210, f.l(4));
    assertEquals(6, f.l(2));
  }
}
