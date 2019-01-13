package irvine.math.group;

import java.util.Iterator;

import irvine.math.z.Z;
import irvine.util.Pair;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GaussianIntegersTest extends TestCase {

  public void testSimple() {
    final GaussianIntegers gi = GaussianIntegers.SINGLETON;
    assertNull(gi.size());
    assertTrue(gi.isAbelian());
    assertTrue(gi.isCommutative());
    assertTrue(gi.contains(gi.zero()));
    assertTrue(gi.contains(new Pair<>(Z.ONE, Z.THREE)));
    assertFalse(gi.contains(null));
    assertFalse(gi.contains(new Pair<>(null, null)));
    assertEquals("\\Z[i]", gi.toString());
    assertEquals(new Pair<>(Z.ZERO, Z.ZERO), gi.zero());
    assertEquals(Z.ZERO, gi.characteristic());
    assertEquals(new Pair<>(Z.ONE, Z.ZERO), gi.one());
    assertEquals(new Pair<>(Z.ONE, Z.ONE), gi.add(gi.one(), gi.i()));
    assertEquals(new Pair<>(Z.NEG_ONE, Z.ZERO), gi.multiply(gi.i(), gi.i()));
    assertEquals(new Pair<>(Z.NEG_ONE, Z.FOUR), gi.negate(new Pair<>(Z.ONE, Z.valueOf(-4))));
    try {
      gi.add(null, gi.one());
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      gi.add(gi.one(), null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      gi.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final Iterator<Pair<Z, Z>> it = gi.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals(new Pair<>(Z.valueOf(k), Z.ZERO), it.next());
    }
    assertFalse(gi.isCyclic());
  }

  public void testCoerce() {
    assertEquals(new Pair<>(Z.TWO, Z.ZERO), GaussianIntegers.SINGLETON.coerce(2));
  }

  public void testParts() {
    final Pair<Z, Z> n = new Pair<>(Z.THREE, Z.FOUR);
    assertEquals(Z.THREE, GaussianIntegers.SINGLETON.re(n));
    assertEquals(Z.FOUR, GaussianIntegers.SINGLETON.im(n));
  }

  public void testConjugate() {
    final Pair<Z, Z> n = new Pair<>(Z.THREE, Z.FOUR);
    assertEquals(new Pair<>(Z.THREE, Z.FOUR.negate()), GaussianIntegers.SINGLETON.conjugate(n));
  }
}
