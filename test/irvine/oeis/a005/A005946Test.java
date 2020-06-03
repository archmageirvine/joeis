package irvine.oeis.a005;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A005946Test extends TestCase {

  public void testSmall() {
    assertEquals(Z.TWO, new A005946().compute(2, 2));
    assertEquals(Z.THREE, new A005946().compute(2, 3));
    assertEquals(Z.FIVE, new A005946().compute(3, 2));
    assertEquals(Z.valueOf(12), new A005946().compute(3, 3));
    assertEquals(Z.valueOf(15), new A005946().compute(4, 2));
  }
}
