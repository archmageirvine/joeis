package irvine.math.z;

import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EuclidTest extends TestCase {

  public void test1() {
    for (int i = 3; i < 100; ++i) {
      final BigInteger v1 = new BigInteger(i + 1, AddTest.RANDOM).add(BigInteger.ONE);
      final BigInteger v2 = new BigInteger(i, AddTest.RANDOM).add(BigInteger.ONE);
      final Z a = Z.valueOf(v1);
      final Z b = Z.valueOf(v2);
      final Z[] r = Euclid.euclid(a, b);
      assertEquals(2, r.length);
      assertEquals(v1.gcd(v2), r[1].bigIntegerValue());
      assertEquals(Z.ZERO, Mod.mod(a, r[1]));
      assertEquals(Z.ZERO, Mod.mod(b, r[1]));
      if (Z.ONE.equals(r[1]) && !Z.ONE.equals(b)) {
        assertEquals(a + " " + b + " " + r[0] + " " + r[1], Z.ONE, a.modMultiply(r[0], b));
      }
    }
  }

  public void test2() {
    for (int i = 30; i < 100; i += 17) {
      final BigInteger v1 = new BigInteger(3 * i, AddTest.RANDOM).add(BigInteger.ONE);
      final BigInteger v2 = new BigInteger(i, AddTest.RANDOM).add(BigInteger.ONE);
      final Z a = Z.valueOf(v1);
      final Z b = Z.valueOf(v2);
      final Z[] r = Euclid.euclid(a, b);
      assertEquals(2, r.length);
      assertEquals(v1.gcd(v2), r[1].bigIntegerValue());
      assertEquals(Z.ZERO, Mod.mod(a, r[1]));
      assertEquals(Z.ZERO, Mod.mod(b, r[1]));
      if (Z.ONE.equals(r[1]) && !Z.ONE.equals(b)) {
        assertEquals(Z.ONE, a.modMultiply(r[0], b));
      }
    }
  }

  public void testSmallDiffEuclid() {
    final int[] r1 = Euclid.smallDiffEuclid(Z.valueOf(39), Z.valueOf(16));
    assertEquals(4, r1.length);
    assertEquals(1, r1[0]);
    assertEquals(2, r1[1]);
    assertEquals(2, r1[2]);
    assertEquals(5, r1[3]);
    final int[] r2 = Euclid.smallDiffEuclid(Z.valueOf(906), Z.valueOf(320));
    assertEquals(5, r2[0]);
    assertEquals(14, r2[1]);
    assertEquals(6, r2[2]);
    assertEquals(17, r2[3]);
    final int[] r3 = Euclid.smallDiffEuclid(Z.valueOf(1203161268L), Z.valueOf(326638006L));
    assertEquals(5614, r3[0]);
    assertEquals(20679, r3[1]);
    assertEquals(6467, r3[2]);
    assertEquals(23821, r3[3]);
    assertNull(Euclid.smallDiffEuclid(Z.FIVE, Z.EIGHT));
  }
}
