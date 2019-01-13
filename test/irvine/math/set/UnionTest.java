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
public class UnionTest extends TestCase {

  public void testFinite() {
    final IntegerSet a = new IntegerSet(1, 3);
    final IntegerSet b = new IntegerSet(2, 4);
    final Set<Integer> u = Union.union(a, b);
    assertEquals("(\\{2,...,4\\})\\cup(\\{1,...,3\\})", u.toString());
    assertTrue(u.contains(1));
    assertTrue(u.contains(2));
    assertTrue(u.contains(3));
    assertTrue(u.contains(4));
    assertFalse(u.contains(5));
    assertEquals(Z.FOUR, u.size());
    assertEquals(Z.FOUR, u.size());
    final Iterator<Integer> it = u.iterator();
    assertTrue(it.hasNext());
    assertEquals(1, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(2, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(3, it.next().intValue());
    assertTrue(it.hasNext());
    assertEquals(4, it.next().intValue());
    assertFalse(it.hasNext());
    assertEquals(u, u);
    assertEquals(u, Union.union(b, a));
    assertTrue(a == Union.union(a, a));
    final FiniteSet<Integer> empty = new FiniteSet<>();
    assertTrue(a == Union.union(a, empty));
    assertTrue(a == Union.union(empty, a));
    try {
      Union.union(empty, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      Union.union(null, empty);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    assertTrue(a == Union.union(a, new FiniteSet<>(1, 2, 3)));
  }

  public void testInfinite() {
    final FiniteSet<Z> a = new FiniteSet<>(Z.ONE);
    final Set<Z> u = Union.union(a, Integers.SINGLETON);
    assertNull(u.size());
    assertTrue(u.contains(Z.ONE));
    assertTrue(u.contains(Z.TWO));
    final Set<Z> v = Union.union(Integers.SINGLETON, a);
    assertNull(v.size());
    assertTrue(v.contains(Z.ONE));
    assertTrue(v.contains(Z.TWO));
  }
}
