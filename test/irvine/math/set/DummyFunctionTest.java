package irvine.math.set;

import irvine.math.api.Function;
import irvine.math.api.Set;
import irvine.math.z.Integers;
import irvine.math.q.Rationals;
import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DummyFunctionTest extends TestCase {

  public void testInfiniteDomain() {
    final Function<Z, Q> f = new AbstractFunction<Z, Q>(Integers.SINGLETON, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a);
      }
    };
    assertEquals(Integers.SINGLETON, f.domain());
    assertEquals(Rationals.SINGLETON, f.codomain());
    assertEquals(Q.ONE, f.image(Z.ONE));
    final FiniteSet<Z> s = new FiniteSet<>(Z.ZERO, Z.ONE);
    final Set<Q> im = f.image(s);
    assertEquals(Z.TWO, im.size());
    assertTrue(im.contains(Q.ZERO));
    assertTrue(im.contains(Q.ONE));
    try {
      f.image();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    try {
      f.isOnto();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    try {
      f.isOneToOne();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
    assertTrue(f.equals(f));
    assertFalse(f.equals(null));
    assertFalse(f.equals(new Object()));
    final Function<Z, Q> f2 = new AbstractFunction<Z, Q>(Integers.SINGLETON, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a);
      }
    };
    try {
      assertFalse(f.equals(f2));
      fail();
    } catch (final EffortException e) {
      // ok
    }
    f.setInfiniteEffort(4);
    final Function<Z, Q> f3 = new AbstractFunction<Z, Q>(Integers.SINGLETON, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a.compareTo(Z.TWO) < 0 ? a : a.add(1));
      }
    };
    assertFalse(f.equals(f3));
    assertEquals(1201474758, f.hashCode());
  }

  public void testFiniteDomain() {
    final FiniteSet<Z> z = new FiniteSet<>(Z.ONE);
    final Function<Z, Q> f = new AbstractFunction<Z, Q>(z, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a);
      }
    };
    assertEquals(z, f.domain());
    assertEquals(Rationals.SINGLETON, f.codomain());
    assertEquals(Q.ONE, f.image(Z.ONE));
    final Set<Q> im = f.image(z);
    assertEquals(Z.ONE, im.size());
    assertTrue(im.contains(Q.ONE));
    assertEquals(new FiniteSet<>(Q.ONE), f.image());
    assertFalse(f.isOnto());
    assertTrue(f.isOneToOne());
    assertFalse(f.isInvertible());
    assertEquals(f, f);
    assertEquals(f.hashCode(), f.hashCode());
    final Function<Z, Q> f2 = new AbstractFunction<Z, Q>(z, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a);
      }
    };
    assertTrue(f.equals(f2));
    assertEquals(f.hashCode(), f2.hashCode());
    final Function<Z, Q> f3 = new AbstractFunction<Z, Q>(z, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a, Z.TWO);
      }
    };
    assertFalse(f.equals(f3));
    assertFalse(f.hashCode() == f3.hashCode());
  }

  public void testTiny() {
    final FiniteSet<Z> s = new FiniteSet<>(Z.ONE);
    final FiniteSet<Q> q = new FiniteSet<>(Q.ONE);
    final Function<Z, Q> f = new AbstractFunction<Z, Q>(s, q) {
      @Override
      public Q image(final Z a) {
        return new Q(a);
      }
    };
    assertEquals(s, f.domain());
    assertEquals(q, f.codomain());
    assertEquals(q, f.image());
    assertTrue(f.isOnto());
    assertTrue(f.isOneToOne());
    assertTrue(f.isInvertible());
    assertEquals(f, f);
    final Function<Z, Q> f2 = new AbstractFunction<Z, Q>(s, Rationals.SINGLETON) {
      @Override
      public Q image(final Z a) {
        return new Q(a);
      }
    };
    assertFalse(f.equals(f2));
  }

}
