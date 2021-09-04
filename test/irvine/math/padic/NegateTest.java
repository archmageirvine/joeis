package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NegateTest extends TestCase {

  public void test1() {
    final PAdic p = PAdic.create(7, 320);
    assertEquals("2,3,0,6,6", new Negate(p).toString(4));
  }

  public void test2() {
    final PAdic z = PAdic.create(5, 1, 2, 2);
    final PAdic zneg = new Negate(z);
    assertEquals("0,0,0", new Add(z, zneg).toString(2));
    assertEquals("0,0,0", new Add(zneg, z).toString(2));
  }
}
