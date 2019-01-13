package irvine.math.q;

import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RationalsTest extends TestCase {

  public void test() {
    final Rationals rat = Rationals.SINGLETON;
    assertNull(rat.size());
    assertTrue(rat.isAbelian());
    assertTrue(rat.isCommutative());
    assertTrue(rat.contains(Q.ZERO));
    assertTrue(rat.contains(Q.ONE_THIRD));
    assertFalse(rat.contains(null));
    assertFalse(rat.isCyclic());
    assertEquals("\\Q", rat.toString());
    assertEquals(Z.ZERO, rat.characteristic());
    assertEquals(Q.ZERO, rat.zero());
    assertEquals(Q.ONE, rat.one());
    assertEquals(new Q(3, 2), rat.add(Q.ONE, Q.HALF));
    assertEquals(Q.ONE_QUARTER, rat.multiply(Q.HALF, Q.HALF));
    assertEquals(Q.TWO.negate(), rat.negate(Q.TWO));
    try {
      rat.add(null, Q.ONE);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      rat.add(Q.ONE, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      rat.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      rat.pow(Q.TWO, 2147483648L);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    final Q[] expected = {Q.ZERO, Q.ONE, Q.HALF, Q.TWO, Q.ONE_THIRD};
    final Iterator<Q> it = rat.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals(expected[k], it.next());
    }
  }

  public void testCompare() {
    final Rationals rat = Rationals.SINGLETON;
    assertEquals(0, rat.compare(Q.HALF, Q.HALF));
    assertEquals(0, rat.compare(Q.ONE, Q.ONE));
    assertEquals(1, rat.compare(Q.ONE, Q.HALF));
    assertEquals(-1, rat.compare(Q.HALF, Q.ONE));
  }

  public void testCoerce() {
    assertEquals(Q.TWO, Rationals.SINGLETON.coerce(2));
  }
}
