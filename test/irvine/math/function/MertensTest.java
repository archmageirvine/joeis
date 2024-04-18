package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MertensTest extends TestCase {

  public void test() {
    final Function1 f = new Mertens();
    assertEquals(1, f.l(1));
    assertEquals(-1, f.l(10));
    assertEquals(-1, f.l(16));
    assertEquals(2, f.l(2040));
  }
}
