package irvine.math.group;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CyclicGroupTest extends TestCase {

  public void testC4() {
    final CyclicGroup c4 = new CyclicGroup(4);
    assertEquals(Z.ZERO, c4.zero());
    assertEquals(Z.ZERO, c4.negate(Z.ZERO));
    assertEquals(Z.ONE, c4.add(Z.ZERO, Z.ONE));
    assertEquals(Z.ONE, c4.add(Z.THREE, Z.TWO));
    assertEquals(Z.TWO, c4.negate(Z.TWO));
    assertEquals(Z.ONE, c4.negate(Z.THREE));
    assertEquals(Z.FOUR, c4.size());
    final Iterator<Z> it = c4.iterator();
    for (int k = 0; k < 4; ++k) {
      assertTrue(it.hasNext());
      assertEquals(k, it.next().intValue());
    }
    assertFalse(it.hasNext());
    assertTrue(c4.isAbelian());
    final String cg = c4.cycleIndex().toString();
    assertEquals(cg, "Z(C4) = (1/2)x_4 + (1/4)x_2^2 + (1/4)x_1^4", cg);
    assertEquals("C_{4}", c4.toString());
    assertTrue(c4.isCyclic());
    assertFalse(c4.contains(null));
    assertFalse(c4.contains(Z.NEG_ONE));
    assertFalse(c4.contains(Z.FOUR));
    assertTrue(c4.contains(Z.THREE));
    try {
      new CyclicGroup(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(Z.ONE, new CyclicGroup(1).size());
  }

  public void testC6() {
    final CycleIndex ci = new CyclicGroup(6).cycleIndex();
    final String s = ci.toString();
    assertEquals(s, "Z(C6) = (1/3)x_6 + (1/3)x_3^2 + (1/6)x_2^3 + (1/6)x_1^6", s);
    assertEquals("Z(C6)", ci.getName());
  }
}
