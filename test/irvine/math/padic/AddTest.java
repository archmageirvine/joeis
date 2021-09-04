package irvine.math.padic;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class AddTest extends TestCase {

  public void test1() {
    final PAdic p = PAdic.create(7, 320);
    assertEquals("3,0,6,1,0", new Add(p, p).toString(4));
  }

  public void test2() {
    final PAdic x = PAdic.create(5, 1, 2, 2);
    final PAdic y = PAdic.create(5, 2, 2, 1);
    assertEquals("3,4,3", new Add(x, y).toString(2));
    assertEquals("2,4,4", new Add(x, x).toString(2));
    final PAdic z = PAdic.create(5, 0, 1);
    final PAdic zneg = PAdic.create(5, -5);
    assertEquals("0,0,0", new Add(z, zneg).toString(2));
    assertEquals("0,0,0", new Add(zneg, z).toString(2));
  }
}
