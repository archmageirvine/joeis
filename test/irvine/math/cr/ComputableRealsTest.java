package irvine.math.cr;

import java.util.Iterator;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ComputableRealsTest extends TestCase {

  private static void assertEqualsApproximate(final double x, final double y) {
    assertTrue(Math.abs(x - y) <= 0.000001);
  }

  public void test() {
    final ComputableReals r = ComputableReals.SINGLETON;
    assertNull(r.size());
    assertTrue(r.isAbelian());
    assertTrue(r.isCommutative());
    assertTrue(r.contains(CR.ZERO));
    assertTrue(r.contains(CR.ONE));
    assertFalse(r.contains(null));
    assertEquals("\\R", r.toString());
    assertEquals(CR.ZERO, r.zero());
    assertEquals(Z.ZERO, r.characteristic());
    assertEquals(CR.ONE, r.one());
    final CR half = CR.ONE.divide(CR.TWO);
    assertEqualsApproximate(0.5, half.doubleValue());
    assertEqualsApproximate(1.5, r.add(CR.ONE, half).doubleValue());
    assertEqualsApproximate(0.25, r.multiply(half, half).doubleValue());
    assertEqualsApproximate(-2.0, r.negate(CR.TWO).doubleValue());
    assertEqualsApproximate(0.5, r.inverse(CR.TWO).doubleValue());
    assertEqualsApproximate(1.0, r.subtract(CR.FOUR, CR.THREE).doubleValue());
    try {
      r.add(null, CR.ONE);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      r.add(CR.ONE, null);
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
    final Iterator<CR> it = r.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals(k, it.next().intValue());
    }
    assertEqualsApproximate(1.0, r.sqrt(CR.ONE).doubleValue());
    assertEqualsApproximate(1.4142135623730950, r.sqrt(CR.TWO).doubleValue());
    assertFalse(r.isCyclic());
  }
  
  public void testHyperbolic() {
    final ComputableReals r = ComputableReals.SINGLETON;
    assertEqualsApproximate(Math.sinh(1), r.sinh(CR.ONE).doubleValue());
    assertEqualsApproximate(Math.cosh(1), r.cosh(CR.ONE).doubleValue());
    assertEqualsApproximate(Math.tanh(1), r.tanh(CR.ONE).doubleValue());
    assertEqualsApproximate(1 / Math.tanh(1), r.coth(CR.ONE).doubleValue());
    assertEqualsApproximate(1 / Math.cosh(1), r.sech(CR.ONE).doubleValue());
    assertEqualsApproximate(1 / Math.sinh(1), r.csch(CR.ONE).doubleValue());
  }

  public void testTrigonometric() {
    final ComputableReals r = ComputableReals.SINGLETON;
    assertEqualsApproximate(Math.sin(1), r.sin(CR.ONE).doubleValue());
    assertEqualsApproximate(Math.cos(1), r.cos(CR.ONE).doubleValue());
    assertEqualsApproximate(Math.tan(1), r.tan(CR.ONE).doubleValue());
    assertEqualsApproximate(1 / Math.tan(1), r.cot(CR.ONE).doubleValue());
  }

  public void testPow() {
    assertEqualsApproximate(36.46215960720791177, ComputableReals.SINGLETON.pow(CR.PI, CR.PI).doubleValue());
  }

  public void testEi() {
    assertEquals("40.185275355803177455091421793796", ComputableReals.SINGLETON.ei(CR.FIVE).toString(30));
    assertEquals("-0.0011482955912753257973305619", ComputableReals.SINGLETON.ei(CR.FIVE.negate()).toString(30).substring(0, 31));
  }

  public void testCompare() {
    assertEquals(0, ComputableReals.SINGLETON.compare(CR.TWO, CR.TWO));
    assertEquals(1, ComputableReals.SINGLETON.compare(CR.TWO, CR.ONE));
    assertEquals(-1, ComputableReals.SINGLETON.compare(CR.ONE, CR.TWO));
  }

  public void testCoerce() {
    assertEquals(2, ComputableReals.SINGLETON.coerce(2).intValue());
  }
}
