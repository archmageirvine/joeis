package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GreatestPrimeFactorTest extends TestCase {

  public void test() {
    final Function1 f = new GreatestPrimeFactor();
    assertEquals(1, f.l(1));
    assertEquals(2, f.l(2));
    assertEquals(2, f.l(4));
    assertEquals(3, f.l(6));
    assertEquals(7, f.l(42));
    assertEquals("3173389601", f.z(Z.ONE.shiftLeft(200).subtract(1)).toString());
  }
}
