package irvine.math.cc;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ComputableComplexFieldTest extends TestCase {

  public void test() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    assertNull(cc.size());
    assertTrue(cc.isAbelian());
    assertTrue(cc.isCommutative());
    assertFalse(cc.isCyclic());
    assertTrue(cc.contains(CC.ZERO));
    assertTrue(cc.contains(CC.ONE));
    assertFalse(cc.contains(null));
    assertEquals("\\C", cc.toString());
    assertEquals(CC.ZERO, cc.zero());
    assertEquals(Z.ZERO, cc.characteristic());
    assertEquals(CC.ONE, cc.one());
    assertEquals(CC.I, cc.i());
    try {
      cc.add(null, CR.ONE);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      cc.add(CC.ONE, (CC) null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      cc.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testAdd() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    final CC a = new CC(CR.ONE, CR.ONE);
    assertEquals(new CC(CR.THREE, CR.ONE), cc.add(a, CR.TWO));
    assertEquals(new CC(CR.ONE, CR.TWO), cc.add(a, CC.I));
    assertEquals(new CC(CR.ONE.negate(), CR.ONE), cc.subtract(a, CR.TWO));
    assertEquals(new CC(CR.ONE), cc.subtract(a, CC.I));
    assertEquals(new CC(CR.ONE, CR.ONE.negate()), cc.conjugate(a));
    assertEquals(new CC(CR.ONE.negate(), CR.ONE.negate()), cc.negate(a));
  }

  public void testMul() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    final CC a = new CC(CR.ONE, CR.ONE);
    assertEquals(new CC(CR.ZERO, CR.TWO), cc.multiply(a, a));
    assertEquals(new CC(CR.TWO, CR.TWO), cc.multiply(a, CR.TWO));
    assertEquals(CR.TWO.sqrt(), cc.abs(a));
    assertEquals(CR.PI.divide(CR.FOUR), cc.arg(a));
  }

  public void testDiv() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    final CC a = new CC(CR.ONE, CR.ONE);
    assertEquals(CC.ONE, cc.divide(a, a));
    assertEquals(a, cc.divide(a, CC.ONE));
    assertEquals(cc.inverse(a), cc.divide(CC.ONE, a));
  }

  public void testPow() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    final CC a = new CC(CR.ONE, CR.ONE);
    assertEquals(CC.ONE, cc.pow(a, 0));
    assertEquals(a, cc.pow(a, 1));
    assertEquals(new CC(CR.ZERO, CR.TWO), cc.pow(a, 2));
    assertEquals(new CC(CR.TWO.negate(), CR.TWO), cc.pow(a, 3));
    assertEquals("0.2739572538+0.5837007588i", cc.pow(a, a).toString());
    assertEquals(CC.TWO, cc.sqrt(new CC(CR.FOUR, CR.ZERO)));
    assertEquals(a, cc.pow(cc.sqrt(a), 2));
  }

  public void testExp() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    final CC a = new CC(CR.ONE, CR.ONE);
    assertEquals(a, cc.log(cc.exp(a)));
    assertEquals(a, cc.exp(cc.log(a)));
    assertEquals("1.4686939399+2.2873552872i", cc.exp(a).toString());
    assertEquals("0.3465735903+0.7853981634i", cc.log(a).toString());
    assertEquals("-2.0000000005+1.9999999990i", cc.log(new CC(CR.valueOf(-0.05631934984), CR.valueOf(0.1230600248))).toString());
  }

  public void testTrig() {
    final ComputableComplexField cc = ComputableComplexField.SINGLETON;
    final CC a = new CC(CR.ONE, CR.ONE);
    assertEquals("1.2984575814+0.6349639148i", cc.sin(a).toString());
    assertEquals("0.8337300251-0.9888977058i", cc.cos(a).toString());
    assertEquals("0.2717525853+1.0839233273i", cc.tan(a).toString());
    assertEquals(a, cc.asin(cc.sin(a)));
    assertEquals(a, cc.acos(cc.cos(a)));
    assertEquals(a, cc.atan(cc.tan(a)));
  }
}
