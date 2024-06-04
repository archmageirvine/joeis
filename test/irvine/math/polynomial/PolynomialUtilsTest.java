package irvine.math.polynomial;

import java.util.Set;

import irvine.math.c.C;
import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PolynomialUtilsTest extends TestCase {

  public void testRootsCubic1() {
    final C[] r = PolynomialUtils.rootsCubic(new C(-6), new C(11), new C(-6));
    //System.out.println(java.util.Arrays.toString(r));
    assertTrue(r[0].equals(new C(3), 1e-15));
    assertTrue(r[1].equals(new C(1), 1e-15));
    assertTrue(r[2].equals(new C(2), 1e-15));
    final Set<Z> z = PolynomialUtils.zRootsCubic(Z.valueOf(-6), Z.valueOf(11), Z.valueOf(-6));
    assertEquals(3, z.size());
    assertTrue(z.contains(Z.ONE));
    assertTrue(z.contains(Z.TWO));
    assertTrue(z.contains(Z.THREE));
  }

  public void testRootsCubic2() {
    final C[] r = PolynomialUtils.rootsCubic(new C(0, -6), new C(-11), new C(0, 6));
    //System.out.println(java.util.Arrays.toString(r));
    assertTrue(r[0].equals(new C(0, 2), 1e-15));
    assertTrue(r[1].equals(new C(0, 3), 1e-15));
    assertTrue(r[2].equals(new C(0, 1), 1e-15));
  }

  public void testRootsCubic3() {
    final C[] r = PolynomialUtils.rootsCubic(C.ONE, C.ONE, C.ONE);
    //System.out.println(java.util.Arrays.toString(r));
    assertTrue(r[0].equals(new C(-1), 1e-15));
    assertTrue(r[1].equals(new C(0, 1), 1e-15));
    assertTrue(r[2].equals(new C(0, -1), 1e-15));
    final Set<Z> z = PolynomialUtils.zRootsCubic(Z.ONE, Z.ONE, Z.ONE);
    assertEquals(1, z.size());
    assertTrue(z.contains(Z.NEG_ONE));
  }

  public void testSeriesCubeRoot() {
    assertEquals("1+1/3x-1/9x^2+5/81x^3-10/243x^4", PolynomialUtils.cubeRootP(new PolynomialRingField<>(Rationals.SINGLETON).x(), 4).toString());

  }
}
