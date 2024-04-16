package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class OmegaTest extends TestCase {

  public void test() {
    final Function1 f = new Omega();
    assertEquals(0, f.l(1));
    assertEquals(1, f.l(2));
    assertEquals(1, f.l(4));
    assertEquals(2, f.l(6));
    assertEquals(3, f.l(42));
    assertEquals(18, f.l(Z.ONE.shiftLeft(200).subtract(1)));
  }
}
