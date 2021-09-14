package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PAdicSqrtTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testSqrt() {
    Z[] r = Z.ONE.sqrtAndRemainder();
    assertEquals(Z.ONE, r[0]);
    assertEquals(Z.ZERO, r[1]);
    assertEquals(1, Z.ONE.auxiliary());
    assertEquals(2, r.length);
    r = Z.TWO.sqrtAndRemainder();
    assertEquals(Z.ONE, r[0]);
    assertEquals(Z.ONE, r[1]);
    assertEquals(0, Z.TWO.auxiliary());
    assertEquals(2, r.length);
    Z z = Z.valueOf(3L);
    r = z.sqrtAndRemainder();
    assertEquals(Z.ONE, r[0]);
    assertEquals(Z.TWO, r[1]);
    assertEquals(0, z.auxiliary());
    assertEquals(2, r.length);
    z = Z.valueOf(4L);
    r = z.sqrtAndRemainder();
    assertEquals(Z.TWO, r[0]);
    assertEquals(Z.ZERO, r[1]);
    assertEquals(1, z.auxiliary());
    assertEquals(2, r.length);
    r = Z.ZERO.sqrtAndRemainder();
    assertEquals(Z.ZERO, r[0]);
    assertEquals(Z.ZERO, r[1]);
    assertEquals(1, Z.ZERO.auxiliary());
    assertEquals(2, r.length);
    try {
      Z.TWO.negate().sqrtAndRemainder();
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Sqrt of negative number.", e.getMessage());
    }
    for (int i = 3; i < 1000; i += 7) {
      z = Z.valueOf(new BigInteger(i, RANDOM));
      final Z y = z.root(2);
      final long a = z.auxiliary();
      r = z.sqrtAndRemainder();
      assertEquals(y, r[0]);
      assertEquals(a, z.auxiliary());
      assertEquals(z, r[0].multiply(r[0]).add(r[1]));
      assertEquals(2, r.length);
    }
  }

}
