package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import java.util.HashSet;
import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PowerSetTest extends TestCase {

  private Set<Z> getSet(final int size) {
    final HashSet<Z> s = new HashSet<>();
    for (int i = 0; i < size; ++i) {
      s.add(Z.valueOf(i));
    }
    return new FiniteSet<>(s);
  }

  public void testPowerSetBadArgs() {
    try {
      new PowerSet<Integer>(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  private void checkPowerSet(final int size) {
    final PowerSet<Z> ps = new PowerSet<>(getSet(size));
    assertFalse(ps.isEmpty());
    assertEquals(1 << size, ps.size().longValueExact());
    assertEquals(Z.ONE.shiftLeft(size), ps.size());
    for (int i = 0; i <= size; ++i) {
      assertTrue(String.valueOf(i), ps.contains(getSet(i)));
    }
    assertFalse(ps.contains(getSet(size + 1)));
    assertFalse(ps.contains(Integers.SINGLETON));
  }

  public void testSmallSizes() {
    for (int k = 0; k < 6; ++k) {
      checkPowerSet(k);
    }
  }
  
  public void testInfinite() {
    final PowerSet<Z> psz = new PowerSet<>(Integers.SINGLETON);
    assertNull(psz.size());
    assertTrue(psz.contains(Integers.SINGLETON));
    assertEquals("{\\cal P}(\\Z)", psz.toString());
  }
  
  public void testIterator() {
    final Iterator<Set<Z>> psit = new PowerSet<>(getSet(1)).iterator();
    assertTrue(psit.hasNext());
    assertEquals(Z.ZERO, psit.next().size()); // empty set
    assertTrue(psit.hasNext());
    assertEquals(getSet(1), psit.next());
    assertFalse(psit.hasNext());
  }
}
