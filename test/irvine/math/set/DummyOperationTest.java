package irvine.math.set;

import irvine.math.api.Operation;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.util.Pair;

import java.util.HashMap;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DummyOperationTest extends TestCase {

  public void testDurbin3p1() {
    final Operation<Z> o = new AbstractOperation<Z>(Integers.SINGLETON, false, true) {
      @Override
      public Z op(final Z a, final Z b) {
        return a.multiply(b).add(1);
      }
    };
    assertFalse(o.isAssociative());
    assertTrue(o.isCommutative());
    assertEquals(Integers.SINGLETON, o.codomain());
    assertEquals(Z.SEVEN, o.image(new Pair<>(Z.TWO, Z.THREE)));
    assertEquals(Z.SEVEN, o.op(Z.TWO, Z.THREE));
    assertEquals(Z.SEVEN, o.op(Z.THREE, Z.TWO));
    assertFalse(o.isIdentity(Z.ZERO));
  }

  public void testDurbin3p3() {
    final Operation<Z> o = new AbstractOperation<Z>(Integers.SINGLETON, true, false) {
      @Override
      public Z op(final Z a, final Z b) {
        return a;
      }
    };
    assertTrue(o.isAssociative());
    assertFalse(o.isCommutative());
    assertEquals(Z.TWO, o.image(new Pair<>(Z.TWO, Z.THREE)));
    assertEquals(Z.TWO, o.op(Z.TWO, Z.THREE));
    assertEquals(Z.THREE, o.op(Z.THREE, Z.TWO));
  }

  public void testDurbin3p12a() {
    final FiniteSet<String> s = new FiniteSet<>("u", "v", "w");
    final Operation<String> o = new AbstractOperation<String>(s, true, false) {

      private final HashMap<Pair<String, String>, String> mMap = new HashMap<>();
      {
        mMap.put(new Pair<>("u", "u"), "u");
        mMap.put(new Pair<>("u", "v"), "w");
        mMap.put(new Pair<>("u", "w"), "w");
        mMap.put(new Pair<>("v", "u"), "v");
        mMap.put(new Pair<>("v", "v"), "v");
        mMap.put(new Pair<>("v", "w"), "v");
        mMap.put(new Pair<>("w", "u"), "w");
        mMap.put(new Pair<>("w", "v"), "u");
        mMap.put(new Pair<>("w", "w"), "v");
      }

      @Override
      public String op(final String a, final String b) {
        return mMap.get(new Pair<>(a, b));
      }
    };
    assertTrue(o.isAssociative());
    assertFalse(o.isCommutative());
    for (final String e : s) {
      assertFalse(o.isIdentity(e));
    }
  }

  public void testDurbin3p12b() {
    final FiniteSet<String> s = new FiniteSet<>("u", "v", "w");
    final Operation<String> o = new AbstractOperation<String>(s, true, false) {

      private final HashMap<Pair<String, String>, String> mMap = new HashMap<>();
      {
        mMap.put(new Pair<>("u", "u"), "u");
        mMap.put(new Pair<>("u", "v"), "v");
        mMap.put(new Pair<>("u", "w"), "w");
        mMap.put(new Pair<>("v", "u"), "v");
        mMap.put(new Pair<>("v", "v"), "v");
        mMap.put(new Pair<>("v", "w"), "v");
        mMap.put(new Pair<>("w", "u"), "w");
        mMap.put(new Pair<>("w", "v"), "u");
        mMap.put(new Pair<>("w", "w"), "v");
      }

      @Override
      public String op(final String a, final String b) {
        return mMap.get(new Pair<>(a, b));
      }
    };
    assertTrue(o.isIdentity("u"));
    assertFalse(o.isIdentity("v"));
    assertFalse(o.isIdentity("w"));
  }

  public void testInfinite() {
    final Operation<Z> o = new AbstractOperation<Z>(Integers.SINGLETON, true, true) {
      @Override
      public Z op(final Z a, final Z b) {
        return a.add(b);
      }
    };
    o.setInfiniteEffort(5);
    try {
      o.isIdentity(Z.ZERO);
      fail();
    } catch (final EffortException e) {
      // ok
    }
    assertFalse(o.isIdentity(Z.ONE));
    final Operation<Z> o2 = new AbstractOperation<Z>(Integers.SINGLETON, true, true) {
      @Override
      public Z op(final Z b, final Z a) {
        return a.add(b.compareTo(Z.TWO) < 0 ? b : b.add(1));
      }
    };
    o2.setInfiniteEffort(4);
    assertFalse(o2.isIdentity(Z.ZERO));
    assertFalse(o2.isIdentity(Z.ONE));
  }
}
