package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ModSqrtTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void test3Mod4() {
    assertEquals(Z.TWO, ModSqrt.modSqrt(Z.FOUR, Z.SEVEN));
    assertEquals(Z.TWO, ModSqrt.modSqrt(Z.FOUR.add(7), Z.SEVEN));
    final Z p = new Z("111111111111111111111111111111111111111111111111111111251");
    assertEquals(3, p.mod(4));
  }

  public void test5Mod8() {
    assertEquals(Z.TWO, ModSqrt.modSqrt(Z.FOUR, Z.SEVEN));
    assertEquals(Z.TWO, ModSqrt.modSqrt(Z.FOUR.add(7), Z.SEVEN));
    final Z p = new Z("111111111111111111111111111111111111111111111111111112861");
    assertEquals(5, p.mod(8));
  }

  public void testModSqrt() {
    assertNull(Z.ZERO.modSqrt(Z.ZERO));
    assertEquals(Z.ZERO, Z.ZERO.modSqrt(Z.ONE));
    assertEquals(Z.ZERO, Z.ZERO.modSqrt(Z.TWO));
    assertEquals(138, Z.valueOf(172).modSqrt(Z.valueOf(337)).intValue());
    assertNull(Z.valueOf(222178345619L).modSqrt(Z.valueOf(673)));
    for (int i = 0; i < 20; ++i) {
      final Z n = Z.valueOf(new BigInteger(40, RANDOM));
      for (int j = 0; j < 10; ++j) {
        final Z p = Z.valueOf(BigInteger.probablePrime(10, RANDOM));
        final Z x = n.modSqrt(p);
        if (x != null) {
          assertEquals("n=" + n + ", p=" + p, n.mod(p), x.modMultiply(x, p));
        }
      }
    }
  }
}
