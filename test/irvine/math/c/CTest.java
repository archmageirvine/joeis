package irvine.math.c;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CTest extends TestCase {

  public void test() {
    assertEquals(0.0, C.ZERO.re());
    assertEquals(0.0, C.ZERO.im());
    assertEquals(1.0, C.ONE.re());
    assertEquals(0.0, C.ONE.im());
    assertEquals(0.0, C.I.re());
    assertEquals(1.0, C.I.im());
    assertTrue(C.ZERO.equals(C.ZERO));
    assertTrue(!C.ZERO.equals(C.I));
    assertTrue(C.ZERO.equals(new C(0)));
    assertTrue(C.ZERO.equals(new C(0, 0)));
    assertTrue(C.ZERO.hashCode() != C.ONE.hashCode());
    assertTrue(C.ZERO.hashCode() != C.I.hashCode());
    assertTrue(C.I.hashCode() != C.ONE.hashCode());
    assertEquals("0.0", C.ZERO.toString());
    assertEquals("1.0", C.ONE.toString());
    assertEquals("1.0i", C.I.toString());
    assertEquals("2.0-3.0i", new C(2, -3).toString());
    assertTrue(C.ZERO.compareTo(C.ONE) < 0);
    assertEquals(0, C.I.compareTo(C.I));
  }

  public void testDurbin30p1() {
    TestUtils.assertEquals(new C(Math.sqrt(3), 1), C.cis(2, Math.PI / 6), 1e-14);
    TestUtils.assertEquals(new C(0.25, -Math.sqrt(3) / 4), C.cis(0.5, 5 * Math.PI / 3), 1e-14);
    TestUtils.assertEquals(new C(5 / Math.sqrt(2), 5 / Math.sqrt(2)), C.cis(5, 9 * Math.PI / 4), 1e-14);
    TestUtils.assertEquals(new C(-3), C.cis(3, Math.PI), 1e-14);
  }

  public void testAbs() {
    assertEquals(Double.MAX_VALUE, new C(Double.MAX_VALUE, 0).doubleValue());
    assertEquals(Double.MAX_VALUE, new C(0, Double.MAX_VALUE).doubleValue());
    assertEquals(Double.MAX_VALUE, new C(Double.MIN_VALUE, Double.MAX_VALUE).doubleValue());
    assertEquals(1.4142135623730952E300, new C(1E300, 1E300).doubleValue(), 1E290);
  }
}

