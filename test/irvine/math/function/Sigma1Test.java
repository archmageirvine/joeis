package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Sigma1Test extends TestCase {

  public void test() {
    final Function1 f = new Sigma1();
    assertEquals(1, f.l(1));
    assertEquals(3, f.l(2));
    assertEquals(96, f.l(42));
  }
}
