package irvine.math.generic;

import irvine.math.c.C;

import irvine.math.c.ComplexField;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class HyperbolicTrigonometricImplTest extends TestCase {

  public void testSinh() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(C.ZERO.equals(i.sinh(C.ZERO), 1e-8));
    assertTrue(new C(0, Math.sin(1)).equals(i.sinh(C.I), 1e-8));
    assertTrue(new C(-3.590564590, 0.5309210863).equals(i.sinh(new C(2, 3)), 1e-8));
  }

  public void testCosh() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(C.ONE.equals(i.cosh(C.ZERO), 1e-8));
    assertTrue(new C(Math.cos(1)).equals(i.cosh(C.I), 1e-8));
    assertTrue(new C(-3.724545505, 0.5118225700).equals(i.cosh(new C(2, 3)), 1e-8));
  }

  public void testTanh() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(C.ZERO.equals(i.tanh(C.ZERO), 1e-8));
    assertTrue(new C(0, 1.557407725).equals(i.tanh(C.I), 1e-8));
    assertTrue(new C(0.9653858790, -0.009884375038).equals(i.tanh(new C(2, 3)), 1e-8));
  }

  public void testCoth() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(Double.isNaN(i.coth(C.ZERO).re()));
    assertTrue(new C(0, -0.6420926159).equals(i.coth(C.I), 1e-8));
    assertTrue(new C(1.035746638, 0.01060478347).equals(i.coth(new C(2, 3)), 1e-8));
  }

  public void testCsch() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(Double.isNaN(i.csch(C.ZERO).re()));
    assertTrue(new C(0, -1.188395106).equals(i.csch(C.I), 1e-8));
    assertTrue(new C(-0.2725486615, -0.04030057886).equals(i.csch(new C(2, 3)), 1e-8));
  }

  public void testSech() {
    final ComplexField i = ComplexField.SINGLETON;
    assertTrue(C.ONE.equals(i.sech(C.ZERO), 1e-8));
    assertTrue(new C(1.850815718).equals(i.sech(C.I), 1e-8));
    assertTrue(new C(-0.2635129752, -0.03621163656).equals(i.sech(new C(2, 3)), 1e-8));
  }
}
