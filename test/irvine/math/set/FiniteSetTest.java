package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.z.Z;

import java.util.Collections;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FiniteSetTest extends TestCase {

  public void testEmpty() {
    final Set<Z> set = new FiniteSet<>();
    assertTrue(set.isEmpty());
    assertFalse(set.isInfinite());
    assertEquals(Z.ZERO, set.size());
    assertFalse(set.contains(Z.ZERO));
    assertEquals("\\emptyset", set.toString());
  }

  public void testFinite() {
    final Set<Z> set = new FiniteSet<>(Z.ZERO);
    assertFalse(set.isEmpty());
    assertFalse(set.isInfinite());
    assertEquals(Z.ONE, set.size());
    assertTrue(set.contains(Z.ZERO));
    assertFalse(set.contains(Z.ONE));
    assertEquals("\\{0\\}", set.toString());
  }

  public void testFinite2() {
    final Set<Z> set = new FiniteSet<>(Z.ZERO, Z.ONE);
    assertEquals("\\{0,1\\}", set.toString());
  }

  public void testFaulty() {
    try {
      new FiniteSet<>((java.util.Set<Z>) null);
    } catch (final NullPointerException e) {
      // ok
    }
    assertEquals(Z.ONE, new FiniteSet<>(Collections.singleton(Z.ZERO)).size());
  }
}
