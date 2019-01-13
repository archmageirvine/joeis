package irvine.math.set;

import irvine.math.api.Set;
import irvine.math.group.IntegerMultiples;
import irvine.math.z.Integers;
import irvine.math.z.Z;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DummySetTest extends TestCase {

  public void testEmpty() {
    final Set<Z> set = new FiniteSet<>();
    assertTrue(set.isEmpty());
    assertFalse(set.isInfinite());
    assertEquals(Z.ZERO, set.size());
    assertFalse(set.contains(Z.ZERO));
    assertEquals(set, set);
    assertEquals(set, new FiniteSet<Z>());
    assertFalse(set.equals(new FiniteSet<>(Z.ONE)));
    assertFalse(set.equals(Integers.SINGLETON));
    assertFalse(set.equals(new Object()));
    assertTrue(set.asList().isEmpty());
    assertTrue(set.isSubset(set));
    assertTrue(set.isSubset(new FiniteSet<>()));
    assertFalse(set.isSubset(new FiniteSet<>(Z.ONE)));
  }

  public void testFinite() {
    final Set<Z> set = new FiniteSet<>(Z.ZERO);
    assertFalse(set.isEmpty());
    assertFalse(set.isInfinite());
    assertEquals(Z.ONE, set.size());
    assertEquals(Z.TWO, set.powerset().size());
    assertTrue(set.contains(Z.ZERO));
    assertFalse(set.contains(Z.ONE));
    assertEquals(set, set);
    assertEquals(set, new FiniteSet<>(Z.ZERO));
    assertFalse(set.equals(new FiniteSet<>()));
    assertFalse(set.equals(new FiniteSet<>("1")));
    assertFalse(set.equals(Integers.SINGLETON));
    assertTrue(set.intersection(new FiniteSet<>(Z.ZERO)).size().equals(Z.ONE));
    assertTrue(set.intersection(new FiniteSet<>(Z.ONE)).isEmpty());
    assertTrue(set.union(new FiniteSet<>(Z.ZERO)).size().equals(Z.ONE));
    assertTrue(set.union(new FiniteSet<>(Z.ONE)).size().equals(Z.TWO));
    assertNotNull(set.identityFunction());
    final List<Z> l = set.asList();
    assertEquals(1, l.size());
    assertEquals(Z.ZERO, l.get(0));
    assertEquals(0, set.hashCode());
    assertEquals(1, new FiniteSet<>(Z.ONE).hashCode());
    assertTrue(set.isSubset(set));
    assertTrue(set.isSubset(new FiniteSet<>()));
    assertFalse(set.isSubset(new FiniteSet<>(Z.ONE)));
    assertTrue(set.isSubset(new FiniteSet<>(Z.ZERO)));
    assertFalse(set.isSubset(Integers.SINGLETON));
  }

  public void testLargeFinite() {
    final Set<Z> set = new AbstractSet<Z>() {
      @Override
      public Iterator<Z> iterator() {
        return null;
      }
      @Override
      public boolean contains(final Z a) {
        return false;
      }
      @Override
      public Z size() {
        return Z.valueOf((1L << 31) + 1L);
      }
    };
    try {
      set.asList();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

  public void testInfinite() {
    final Set<Z> set = Integers.SINGLETON;
    assertFalse(set.isEmpty());
    assertTrue(set.isInfinite());
    assertNull(set.size());
    assertTrue(set.contains(Z.ZERO));
    assertTrue(set.contains(Z.ONE));
    assertEquals(set, set);
    assertFalse(set.equals(new FiniteSet<>(Z.ZERO)));
    assertFalse(set.equals(new FiniteSet<>()));
    try {
      set.asList();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    final Set<Z> union = set.union(new IntegerMultiples(2));
    assertNull(union.size());
    set.setInfiniteEffort(5);
    try {
      assertFalse(set.equals(union));
      fail();
    } catch (final EffortException e) {
      // ok
    }
    try {
      assertFalse(set.isSubset(union));
      fail();
    } catch (final EffortException e) {
      // ok
    }
    final Set<Z> pseudoz = new AbstractSet<Z>() {
      @Override
      public Iterator<Z> iterator() {
        return Integers.SINGLETON.iterator();
      }
      @Override
      public boolean contains(final Z a) {
        return !a.equals(Z.TWO.negate());
      }
      @Override
      public Z size() {
        return null;
      }
    };
    assertFalse(set.equals(pseudoz));
    assertTrue(set.isSubset(set));
    assertTrue(set.isSubset(new FiniteSet<>()));
    assertTrue(set.isSubset(new FiniteSet<>(Z.ONE, Z.ZERO, Z.TWO)));
    assertEquals(444, new IntegerMultiples(7).hashCode());
  }
}
