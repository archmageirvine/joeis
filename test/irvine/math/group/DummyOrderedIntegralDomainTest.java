package irvine.math.group;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyOrderedIntegralDomainTest extends TestCase {

  public void testCompare() {
    assertEquals(0, Integers.SINGLETON.compare(Z.ONE, Z.ONE));
    assertEquals(-1, Integers.SINGLETON.compare(Z.ONE, Z.THREE));
    assertEquals(1, Integers.SINGLETON.compare(Z.THREE, Z.ONE));
    assertFalse(Integers.SINGLETON.gt(Z.ONE, Z.ONE));
    assertTrue(Integers.SINGLETON.gt(Z.THREE, Z.ONE));
    assertFalse(Integers.SINGLETON.lt(Z.ONE, Z.ONE));
    assertTrue(Integers.SINGLETON.lt(Z.ONE, Z.THREE));
    assertEquals(Z.ONE, Integers.SINGLETON.abs(Z.ONE));
    assertEquals(Z.ONE, Integers.SINGLETON.abs(Z.NEG_ONE));
    assertEquals(Z.ZERO, Integers.SINGLETON.abs(Z.ZERO));
  }
}
