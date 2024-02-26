package irvine.math.zi;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ZiTest extends TestCase {

  public void test() {
    assertEquals(Z.ZERO, Zi.ZERO.re());
    assertEquals(Z.ZERO, Zi.ZERO.im());
    assertEquals(Z.ONE, Zi.ONE.re());
    assertEquals(Z.ZERO, Zi.ONE.im());
    assertEquals(Z.ZERO, Zi.I.re());
    assertEquals(Z.ONE, Zi.I.im());
    assertTrue(Zi.ZERO.equals(Zi.ZERO));
    assertTrue(!Zi.ZERO.equals(Zi.I));
    assertTrue(Zi.ZERO.equals(new Zi(0)));
    assertTrue(Zi.ZERO.equals(new Zi(0, 0)));
    assertTrue(Zi.ZERO.hashCode() != Zi.ONE.hashCode());
    assertTrue(Zi.ZERO.hashCode() != Zi.I.hashCode());
    assertTrue(Zi.I.hashCode() != Zi.ONE.hashCode());
    assertEquals("0", Zi.ZERO.toString());
    assertEquals("1", Zi.ONE.toString());
    assertEquals("i", Zi.I.toString());
    assertEquals("2-3i", new Zi(2, -3).toString());
    assertTrue(Zi.ZERO.compareTo(Zi.ONE) < 0);
    assertEquals(0, Zi.I.compareTo(Zi.I));
  }

  public void testIsZero() {
    assertTrue(Zi.ZERO.isZero());
    assertTrue(new Zi(0).isZero());
    assertFalse(Zi.ONE.isZero());
    assertFalse(Zi.I.isZero());
  }
}

