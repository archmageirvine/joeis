package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.z.Integers;
import irvine.math.z.Z;

import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IntersectionTest extends TestCase {

  public void testFinite() {
    final IntegerSet a = new IntegerSet(1, 3);
    final IntegerSet b = new IntegerSet(2, 4);
    final Set<Integer> u = Intersection.intersection(a, b);
    assertEquals("(\\{2,...,4\\})\\cap(\\{1,...,3\\})", u.toString());
    assertFalse(u.contains(1));
    assertTrue(u.contains(2));
    assertTrue(u.contains(3));
    assertFalse(u.contains(4));
    assertFalse(u.contains(5));
    assertEquals(Z.TWO, u.size());
    assertEquals(Z.TWO, u.size());
    final Iterator<Integer> it = u.iterator();
    assertTrue(it.hasNext());
    assertEquals(2, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(3, it.next().intValue());
    assertFalse(it.hasNext());
    assertEquals(u, u);
    assertEquals(u, Intersection.intersection(b, a));
    assertTrue(a == Intersection.intersection(a, a));
    final FiniteSet<Integer> empty = new FiniteSet<>();
    assertTrue(empty == Intersection.intersection(a, empty));
    assertTrue(empty == Intersection.intersection(empty, a));
    try {
      Intersection.intersection(empty, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      Intersection.intersection(null, empty);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    assertTrue(a == Intersection.intersection(a, new FiniteSet<>(1, 2, 3)));
  }

  public void testInfinite() {
    final FiniteSet<Z> a = new FiniteSet<>(Z.ONE);
    final Set<Z> u = Intersection.intersection(a, Integers.SINGLETON);
    assertEquals(Z.ONE, u.size());
    assertTrue(u.contains(Z.ONE));
    assertFalse(u.contains(Z.TWO));
    final Set<Z> v = Intersection.intersection(Integers.SINGLETON, a);
    assertEquals(Z.ONE, v.size());
    assertTrue(v.contains(Z.ONE));
    assertFalse(v.contains(Z.TWO));
  }
}
