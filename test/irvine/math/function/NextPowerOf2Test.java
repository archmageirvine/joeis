package irvine.math.function;

import java.util.Random;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NextPowerOf2Test extends TestCase {

  public void testNextPowerOf2() {
    final Function1 f = new NextPowerOf2();
    long x = 0;
    for (int k = 0; k < 64; ++k) {
      x = f.l(x);
      assertEquals(String.valueOf(k), 1L << k, x);
    }
    assertEquals(0, f.l(Long.MIN_VALUE));
    final Random r = new Random();
    for (int j = 0; j < 1000; ++j) {
      final long k = r.nextLong();
      final long z = f.l(k);
      if (k < 0) {
        assertEquals(0, z);
      } else {
        assertEquals(0, z & (z - 1));
        if (z != Long.MIN_VALUE) {
          assertTrue(z > k);
          if (k > 0) {
            assertTrue(z >>> 1 <= k);
          } else {
            assertTrue(z >> 1 <= k);
          }
        }
      }
    }
  }

  public void testNextPowerOf2Z() {
    final Function1 f = new NextPowerOf2();
    Z x = Z.ZERO;
    for (int k = 0; k < 64; ++k) {
      x = f.z(x);
      assertEquals(Z.ONE.shiftLeft(k), x);
    }
    assertEquals(Z.EIGHT, f.z(Z.SEVEN));
    assertEquals(Z.valueOf(64), f.z(42));
  }
}
