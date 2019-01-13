package irvine.math.r;

import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RealsTest extends TestCase {

  public void test() {
    final Reals r = Reals.SINGLETON;
    assertNull(r.size());
    assertTrue(r.isAbelian());
    assertTrue(r.isCommutative());
    assertTrue(r.contains(0.0));
    assertTrue(r.contains(1.0));
    assertEquals(Z.ZERO, r.characteristic());
    assertFalse(r.contains(null));
    assertEquals("\\R", r.toString());
    assertEquals(0.0, r.zero());
    assertEquals(1.0, r.one());
    assertEquals(1.5, r.add(1.0, 0.5), 1e-12);
    assertEquals(0.25, r.multiply(0.5, 0.5), 1e-12);
    assertEquals(-2.0, r.negate(2.0), 1e-12);
    assertEquals(0.5, r.inverse(2.0), 1e-12);
    assertEquals(0.5, r.divide(1.0, 2.0), 1e-12);
    assertEquals(1.0, r.subtract(4.0, 3.0), 1e-12);
    try {
      r.add(null, 1.0);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      r.add(1.0, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      r.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final Iterator<Double> it = r.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals((double) k, it.next(), 1e-12);
    }
    assertEquals(1.0, r.sqrt(1.0), 1e-12);
    assertEquals(1.4142135623730950, r.sqrt(2.0), 1e-10);
    assertFalse(r.isCyclic());
  }

  public void testFunctionProxies() {
    final Reals r = Reals.SINGLETON;
    assertEquals(Math.exp(1), r.exp(1.0));
    assertEquals(Math.sinh(1), r.sinh(1.0));
    assertEquals(Math.cosh(1), r.cosh(1.0));
    assertEquals(Math.tanh(1), r.tanh(1.0));
    assertEquals(1 / Math.tanh(1), r.coth(1.0));
    assertEquals(1 / Math.cosh(1), r.sech(1.0));
    assertEquals(1 / Math.sinh(1), r.csch(1.0));
    assertEquals(Math.sin(1), r.sin(1.0));
    assertEquals(Math.cos(1), r.cos(1.0));
    assertEquals(Math.tan(1), r.tan(1.0));
    assertEquals(1 / Math.tan(1), r.cot(1.0));
  }

  public void testEi() {
    assertEquals(-0.00114829559127532579, Reals.SINGLETON.ei(-5.0), 1e-14);
    assertEquals(40.185275355803177, Reals.SINGLETON.ei(5.0), 1e-14);
  }

  public void testGamma() {
    assertEquals(3.8543707171800725E247, Gamma.gamma(144), 1E240);
  }

  public void testCompare() {
    assertEquals(0, Reals.SINGLETON.compare(0.0, 0.0));
    assertEquals(1, Reals.SINGLETON.compare(0.1, 0.0));
    assertEquals(-1, Reals.SINGLETON.compare(0.0, 0.1));
  }

  public void testCoerce() {
    assertEquals(2.0, Reals.SINGLETON.coerce(2));
  }
}
