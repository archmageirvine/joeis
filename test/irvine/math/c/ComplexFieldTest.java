package irvine.math.c;

import irvine.TestUtils;
import irvine.math.r.Constants;
import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ComplexFieldTest extends TestCase {

  public void testSimple() {
    final ComplexField i = ComplexField.SINGLETON;
    assertNull(i.size());
    assertTrue(i.isAbelian());
    assertTrue(i.isCommutative());
    assertTrue(i.contains(C.ZERO));
    assertTrue(i.contains(new C(1, 3)));
    assertFalse(i.contains(null));
    assertEquals("\\C", i.toString());
    assertEquals(C.ZERO, i.zero());
    assertEquals(Z.ZERO, i.characteristic());
    assertEquals(C.ONE, i.one());
    assertEquals(new C(1, 1), i.add(C.ONE, C.I));
    assertEquals(new C(-1, 0), i.multiply(C.I, C.I));
    assertEquals(new C(-3, 4), i.negate(new C(3, -4)));
    try {
      i.add(null, C.ONE);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      i.add(C.ONE, null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      i.negate(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    final Iterator<C> it = i.iterator();
    for (int k = 0; k < 5; ++k) {
      assertTrue(it.hasNext());
      assertEquals(new C(k), it.next());
    }
    assertFalse(i.isCyclic());
  }

  public void testDurbin29p4() {
    final ComplexField c = ComplexField.SINGLETON;
    assertEquals(new C(3, 1), c.multiply(new C(2, -1), new C(1, 1)));
    assertEquals(new C(0, -1), c.pow(C.I, 3));
    assertEquals(C.I, c.pow(c.negate(C.I), 3));
    assertEquals(new C(0.2, -0.4), c.divide(C.ONE, new C(1, 2)));
    assertEquals(new C(-2, 2), c.pow(new C(1, 1), 3));
    TestUtils.assertEquals(new C(-1.0 / 13, 5.0 / 13), c.divide(new C(1, 1), new C(2, -3)), 1E-15);
  }
  
  public void testDivide() {
    final ComplexField c = ComplexField.SINGLETON;
    assertEquals(C.ZERO, c.divide(C.ZERO, C.ONE));
    assertEquals(C.ZERO, c.divide(C.ZERO, C.I));
    assertEquals(C.ONE, c.divide(C.ONE, C.ONE));
    assertEquals(C.ONE, c.divide(C.I, C.I));
    TestUtils.assertEquals(new C(-0.3076923077, 0.5384615385), c.divide(new C(1, 2), new C(2, -3)), 1E-8);
  }

  public void testPow() {
    final ComplexField c = ComplexField.SINGLETON;
    final C u = new C(3, 4);
    final C z = c.multiply(u, u);
    assertEquals(new C(-7, 24), z);
    final C y = c.pow(u, 2);
    // z == y
    assertTrue(Math.abs(c.abs(z) - c.abs(y)) < 1e-10);
    TestUtils.assertEquals(new C(3.050532920, 6.187535646), c.pow(u, 1.2), 1E-8);
    assertTrue(u == c.pow(u, 1));
    TestUtils.assertEquals(new C(-2.997990598, 0.6237845863), c.pow(u, u), 1E-8);
  }
  
  public void testSqrt() {
    final ComplexField c = ComplexField.SINGLETON;
    assertEquals(C.ZERO, c.sqrt(C.ZERO));
    assertEquals(C.ONE, c.sqrt(C.ONE));
    assertEquals(C.I, c.sqrt(new C(-1)));
    TestUtils.assertEquals(new C(0.7071067810, 0.7071067810), c.sqrt(C.I), 1E-8);
    TestUtils.assertEquals(new C(1.674149228, 0.8959774761), c.sqrt(new C(2, 3)), 1E-8);
    TestUtils.assertEquals(new C(1.817354021, 0.5502505227), c.sqrt(new C(3, 2)), 1E-8);
    TestUtils.assertEquals(new C(0.5502505227, 1.817354021), c.sqrt(new C(-3, 2)), 1E-8);
    TestUtils.assertEquals(new C(1.131713924, -0.8836155309), c.sqrt(new C(0.5, -2)), 1E-8);
    TestUtils.assertEquals(new C(7.906299156012133E137, 7.906299156012133E137), c.sqrt(new C(8.38125875310611E71, 1.2501913268871633E276)), 1E125);
    TestUtils.assertEquals(new C(5.547294822780774E-87, 5.5472948227807746E-87), c.sqrt(new C(-1.6229153609001913E-203, 6.1544959701700764E-173)), 1E-95);
    TestUtils.assertEquals(new C(9.780359638105336E-122, -9.780359638105336E-122), c.sqrt(new C(1.7660516375549933E-255, -1.9131086929959385E-244)), 1E-95);
  }

  public void testInverse() {
    final ComplexField c = ComplexField.SINGLETON;
    assertEquals(new C(0, -1), c.inverse(C.I));
    TestUtils.assertEquals(new C(0.153846, -0.230769), c.inverse(new C(2, 3)), 1E-6);
  }

  public void testRealToComplexPower() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ONE, i.pow(0.0, C.ZERO), 1E-10);
    TestUtils.assertEquals(C.ZERO, i.pow(0.0, C.ONE), 1E-10);
    TestUtils.assertEquals(new C(8), i.pow(2.0, new C(3)), 1E-10);
    TestUtils.assertEquals(new C(1.538477803, 1.277922553), i.pow(2.0, new C(1, 1)), 1E-8);
    TestUtils.assertEquals(new C(0.7808144737, 2.110172684), i.pow(1.5, new C(2, 3)), 1E-8);
  }

  public void testComplexToComplexPower() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ONE, i.pow(C.ZERO, C.ZERO), 1E-10);
    TestUtils.assertEquals(C.ZERO, i.pow(C.ZERO, C.ONE), 1E-10);
    TestUtils.assertEquals(new C(8), i.pow(new C(2), new C(3)), 1E-10);
    TestUtils.assertEquals(new C(1.538477803, 1.277922553), i.pow(new C(2), new C(1, 1)), 1E-8);
    TestUtils.assertEquals(new C(0.2078795764), i.pow(C.I, C.I), 1E-8);
    TestUtils.assertEquals(new C(-2.044201816, -3.078151638), i.pow(new C(1, 2), new C(3, 1)), 1E-8);
  }

  public void testExp() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ONE, i.exp(C.ZERO), 1E-10);
    TestUtils.assertEquals(new C(Math.E), i.exp(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(0.5403023059, 0.8414709848), i.exp(C.I), 1E-8);
    TestUtils.assertEquals(new C(-7.315110095, 1.042743656), i.exp(new C(2, 3)), 1E-8);
    TestUtils.assertEquals(new C(0.8623188722876839341, 0.50636564110975879), i.exp(new C(0, -100)), 1E-8);
  }

  public void testLog() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(new C(Double.NEGATIVE_INFINITY).equals(i.log(C.ZERO)));
    TestUtils.assertEquals(C.ZERO, i.log(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(0, Constants.HALF_PI), i.log(C.I), 1E-8);
    TestUtils.assertEquals(new C(1.282474679, 0.9827937232), i.log(new C(2, 3)), 1E-8);
  }

  public void testSin() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ZERO, i.sin(C.ZERO), 1E-16);
    TestUtils.assertEquals(new C(0.8414709848), i.sin(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(0, 1.175201194), i.sin(C.I), 1E-8);
    TestUtils.assertEquals(new C(9.154499147, -4.168906960), i.sin(new C(2, 3)), 1E-8);
  }

  public void testCos() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ONE, i.cos(C.ZERO), 1E-16);
    TestUtils.assertEquals(new C(0.5403023059), i.cos(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(1.543080635), i.cos(C.I), 1e-8);
    TestUtils.assertEquals(new C(-4.189625691, -9.109227894), i.cos(new C(2, 3)), 1E-8);
  }

  public void testTan() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ONE, i.cos(C.ZERO), 1E-16);
    TestUtils.assertEquals(i.divide(i.sin(C.ONE), i.cos(C.ONE)), i.tan(C.ONE), 1E-8);
    TestUtils.assertEquals(i.divide(i.sin(C.I), i.cos(C.I)), i.tan(C.I), 1E-8);
    final C v = new C(2, 3);
    TestUtils.assertEquals(i.divide(i.sin(v), i.cos(v)), i.tan(v), 1E-8);
  }

  public void testCot() {
    final ComplexField i = ComplexField.SINGLETON;
    final C v = new C(2, 3);
    TestUtils.assertEquals(i.divide(i.cos(v), i.sin(v)), i.cot(v), 1E-8);
  }

  public void testLgamma() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ZERO, i.lgamma(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(-0.6509231993, -1.872436647), i.lgamma(C.I), 1E-8);
    TestUtils.assertEquals(new C(-2.092851753, 2.302396543), i.lgamma(new C(2, 3)), 1E-8);
  }

  public void testSinh() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(-3.590564590, 0.5309210863), i.sinh(new C(2, 3)), 1E-8);
  }

  public void testCosh() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(-3.724545505, 0.5118225700), i.cosh(new C(2, 3)), 1E-8);
  }

  public void testTanh() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(0.9653858790, -0.009884375038), i.tanh(new C(2, 3)), 1E-8);
  }

  public void testCoth() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(1.035746638, 0.01060478347), i.coth(new C(2, 3)), 1E-8);
  }

  public void testCsch() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(-0.2725486615, -0.04030057886), i.csch(new C(2, 3)), 1E-8);
  }

  public void testSech() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(-0.2635129752, -0.03621163656), i.sech(new C(2, 3)), 1E-8);
  }

  public void testAsin() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ZERO, i.asin(C.ZERO), 1E-16);
    TestUtils.assertEquals(new C(Constants.HALF_PI), i.asin(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(0, 0.8813735869), i.asin(C.I), 1E-8);
    TestUtils.assertEquals(new C(0.5706527843, 1.983387030), i.asin(new C(2, 3)), 1E-8);
  }

  public void testAcos() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(new C(Constants.HALF_PI), i.acos(C.ZERO), 1E-16);
    TestUtils.assertEquals(C.ZERO, i.acos(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(Constants.HALF_PI, -0.8813735869), i.acos(C.I), 1E-8);
    TestUtils.assertEquals(new C(1.000143542, -1.983387030), i.acos(new C(2, 3)), 1E-8);
  }

  public void testAtan() {
    final ComplexField i = ComplexField.SINGLETON;
    TestUtils.assertEquals(C.ZERO, i.atan(C.ZERO), 1E-16);
    TestUtils.assertEquals(new C(Constants.QUARTER_PI), i.atan(C.ONE), 1E-8);
    TestUtils.assertEquals(new C(1.409921050, 0.2290726830), i.atan(new C(2, 3)), 1E-8);
  }

  public void testEi() {
    TestUtils.assertEquals(new C(-0.00114829559127532579), ComplexField.SINGLETON.ei(new C(-5.0)), 1E-14);
  }

  public void testCoerce() {
    assertEquals(C.TWO, ComplexField.SINGLETON.coerce(2));
  }

  public void testDivideBug() {
    final C num = new C(2.6546041050764663E12, -1.6760510689289297E13);
    final C den = new C(2.1068300377347528E16, -1.33020013419108096E17);
    final C div = ComplexField.SINGLETON.divide(num, den);
    assertEquals(0.00012599991729426231, div.re(), 1E-12);
    assertEquals(3.580905948323994E-21, div.im(), 1E-35); // is this actually right?
  }
}
