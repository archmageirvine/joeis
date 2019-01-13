package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A005333Test extends AbstractSequenceTest {

  public void testC() {
    final A005333 c = new A005333();
    assertEquals(Z.ONE, c.get(1, 0));
    assertEquals(Z.ONE, c.get(1, 1));
    assertEquals(Z.ONE, c.get(2, 1));
    assertEquals(Z.FIVE, c.get(2, 2));
    assertEquals(Z.ONE, c.get(3, 1));
    assertEquals(Z.valueOf(37898120011L), c.get(9, 4));
  }
}
