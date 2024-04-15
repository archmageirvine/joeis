package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Sigma0Test extends TestCase {

  public void test() {
    final Function1 f = new Sigma0();
    assertEquals(1, f.l(1));
    assertEquals(2, f.l(2));
    assertEquals(8, f.l(42));
  }
}
