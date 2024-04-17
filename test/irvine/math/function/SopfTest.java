package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SopfTest extends TestCase {

  public void test() {
    final Function1 f = new Sopf();
    assertEquals(0, f.l(1));
    assertEquals(2, f.l(2));
    assertEquals(2, f.l(4));
    assertEquals(5, f.l(6));
    assertEquals(12, f.l(42));
    assertEquals(3176863600L, f.l(Z.ONE.shiftLeft(200).subtract(1)));
  }
}
