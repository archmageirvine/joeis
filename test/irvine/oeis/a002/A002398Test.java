package irvine.oeis.a002;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A002398Test extends TestCase {

  public void testAlef() {
    final A002398 seq = new A002398();
    assertEquals(Z.ONE, seq.alef(1));
    assertEquals(Z.FIVE, seq.alef(2));
    assertEquals(Z.valueOf(27), seq.alef(3));
  }

  public void testGamma() {
    final A002398 seq = new A002398();
    assertEquals(Z.NEG_ONE, seq.gamma(1, 1));
    assertEquals(Z.valueOf(-3), seq.gamma(1, 3));
    assertEquals(Z.SIX, seq.gamma(2, 4));
  }

}
