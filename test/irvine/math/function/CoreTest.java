package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CoreTest extends TestCase {

  public void test() {
    final Function1 f = new Core();
    assertEquals(1, f.l(1));
    assertEquals(2, f.l(2));
    assertEquals(3, f.l(3));
    assertEquals(1, f.l(4));
    assertEquals(3, f.l(12));
  }
}
