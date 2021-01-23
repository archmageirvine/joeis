package irvine.math;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Random;

import irvine.math.z.ZUtils;
import junit.framework.TestCase;
//import irvine.util.time.Timer;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LongUtilsTest extends TestCase {

  public void testModPow() {
    // first catch exceptions for bad arguments
    for (long n = 0; n > -50; --n) {
      try {
        LongUtils.modPow(1L, 1L, n);
        fail("Didn't throw expected exception");
      } catch (final IllegalArgumentException e) {
        // ok
      }
    }
    for (long n = -1; n > -50; --n) {
      try {
        LongUtils.modPow(n, 1L, 2L);
        fail("Didn't throw expected exception");
      } catch (final IllegalArgumentException e) {
        // ok
      }
    }

    // test powers of one
    for (long n = 2; n < 500; ++n) {
      for (long e = 1; e < 500; ++e) {
        assertEquals(1L, LongUtils.modPow(1L, e, n));
      }
    }

    // test powers of zero
    for (long n = 2; n < 500; ++n) {
      for (long e = 1; e < 500; ++e) {
        assertEquals(0L, LongUtils.modPow(0L, e, n));
      }
    }

    // test exponent 0
    for (long n = 2; n < 500; ++n) {
      for (long a = 0; a < 500; ++a) {
        assertEquals(1L, LongUtils.modPow(a, 0L, n));
      }
    }

    // test all arguments up to 50 against BigInteger version
    for (long n = 1; n < 50; ++n) {
      for (long e = 0; e < 50; ++e) {
        for (long a = 0; a < 50; ++a) {
          assertEquals("n=" + n + " e=" + e + " a=" + a, BigInteger.valueOf(a).modPow(BigInteger.valueOf(e), BigInteger.valueOf(n)).longValue(), LongUtils.modPow(a, e, n));
        }
      }
    }
  }


  /**
   * Test the Jacobi function
   *
   */
  public void testJacobi1() {
    final Random r = new Random();
    // check error on second argument even
    for (int i = 0; i < 100; i += 2) {
      try {
        LongUtils.jacobi(r.nextLong(), i);
        fail("Expected exception did not occur");
      } catch (final ArithmeticException e) {
        // ok
      }
    }
    // check for +1, 0, -1 on random arguments
    for (int i = 0; i < 1000; ++i) {
      final long t = LongUtils.jacobi(r.nextLong(), r.nextLong() | 1L);
      if (t < -1 || t > 1) {
        fail("Jacobi symbols was not -1, 0, +1");
      }
    }
  }

  public void testJacobi2() {
    assertEquals(0, LongUtils.jacobi(-10, 5));
    assertEquals(1, LongUtils.jacobi(-10, 7));
    assertEquals(1, LongUtils.jacobi(-10, 9));
    assertEquals(1, LongUtils.jacobi(-10, 11));
    assertEquals(1, LongUtils.jacobi(-10, 13));
    assertEquals(0, LongUtils.jacobi(-10, 15));
    assertEquals(0, LongUtils.jacobi(-9, 3));
    assertEquals(1, LongUtils.jacobi(-9, 5));
    assertEquals(-1, LongUtils.jacobi(-9, 7));
    assertEquals(0, LongUtils.jacobi(-9, 9));
    assertEquals(-1, LongUtils.jacobi(-9, 11));
    assertEquals(1, LongUtils.jacobi(-9, 13));
    assertEquals(0, LongUtils.jacobi(-9, 15));
    assertEquals(1, LongUtils.jacobi(-8, 3));
    assertEquals(-1, LongUtils.jacobi(-8, 5));
    assertEquals(-1, LongUtils.jacobi(-8, 7));
    assertEquals(1, LongUtils.jacobi(-8, 9));
    assertEquals(1, LongUtils.jacobi(-8, 11));
    assertEquals(-1, LongUtils.jacobi(-8, 13));
    assertEquals(-1, LongUtils.jacobi(-8, 15));
    assertEquals(-1, LongUtils.jacobi(-7, 3));
    assertEquals(-1, LongUtils.jacobi(-7, 5));
    assertEquals(0, LongUtils.jacobi(-7, 7));
    assertEquals(1, LongUtils.jacobi(-7, 9));
    assertEquals(1, LongUtils.jacobi(-7, 11));
    assertEquals(-1, LongUtils.jacobi(-7, 13));
    assertEquals(1, LongUtils.jacobi(-7, 15));
    assertEquals(0, LongUtils.jacobi(-6, 3));
    assertEquals(1, LongUtils.jacobi(-6, 5));
    assertEquals(1, LongUtils.jacobi(-6, 7));
    assertEquals(0, LongUtils.jacobi(-6, 9));
    assertEquals(1, LongUtils.jacobi(-6, 11));
    assertEquals(-1, LongUtils.jacobi(-6, 13));
    assertEquals(0, LongUtils.jacobi(-6, 15));
    assertEquals(1, LongUtils.jacobi(-5, 3));
    assertEquals(0, LongUtils.jacobi(-5, 5));
    assertEquals(1, LongUtils.jacobi(-5, 7));
    assertEquals(1, LongUtils.jacobi(-5, 9));
    assertEquals(-1, LongUtils.jacobi(-5, 11));
    assertEquals(-1, LongUtils.jacobi(-5, 13));
    assertEquals(0, LongUtils.jacobi(-5, 15));
    assertEquals(-1, LongUtils.jacobi(-4, 3));
    assertEquals(1, LongUtils.jacobi(-4, 5));
    assertEquals(-1, LongUtils.jacobi(-4, 7));
    assertEquals(1, LongUtils.jacobi(-4, 9));
    assertEquals(-1, LongUtils.jacobi(-4, 11));
    assertEquals(1, LongUtils.jacobi(-4, 13));
    assertEquals(-1, LongUtils.jacobi(-4, 15));
    assertEquals(0, LongUtils.jacobi(-3, 3));
    assertEquals(-1, LongUtils.jacobi(-3, 5));
    assertEquals(1, LongUtils.jacobi(-3, 7));
    assertEquals(0, LongUtils.jacobi(-3, 9));
    assertEquals(-1, LongUtils.jacobi(-3, 11));
    assertEquals(1, LongUtils.jacobi(-3, 13));
    assertEquals(0, LongUtils.jacobi(-3, 15));
    assertEquals(1, LongUtils.jacobi(-2, 3));
    assertEquals(-1, LongUtils.jacobi(-2, 5));
    assertEquals(-1, LongUtils.jacobi(-2, 7));
    assertEquals(1, LongUtils.jacobi(-2, 9));
    assertEquals(1, LongUtils.jacobi(-2, 11));
    assertEquals(-1, LongUtils.jacobi(-2, 13));
    assertEquals(-1, LongUtils.jacobi(-2, 15));
    assertEquals(-1, LongUtils.jacobi(-1, 3));
    assertEquals(1, LongUtils.jacobi(-1, 5));
    assertEquals(-1, LongUtils.jacobi(-1, 7));
    assertEquals(1, LongUtils.jacobi(-1, 9));
    assertEquals(-1, LongUtils.jacobi(-1, 11));
    assertEquals(1, LongUtils.jacobi(-1, 13));
    assertEquals(-1, LongUtils.jacobi(-1, 15));
    assertEquals(0, LongUtils.jacobi(0, 3));
    assertEquals(0, LongUtils.jacobi(0, 5));
    assertEquals(0, LongUtils.jacobi(0, 7));
    assertEquals(0, LongUtils.jacobi(0, 9));
    assertEquals(0, LongUtils.jacobi(0, 11));
    assertEquals(0, LongUtils.jacobi(0, 13));
    assertEquals(0, LongUtils.jacobi(0, 15));
    assertEquals(1, LongUtils.jacobi(1, 3));
    assertEquals(1, LongUtils.jacobi(1, 5));
    assertEquals(1, LongUtils.jacobi(1, 7));
    assertEquals(1, LongUtils.jacobi(1, 9));
    assertEquals(1, LongUtils.jacobi(1, 11));
    assertEquals(1, LongUtils.jacobi(1, 13));
    assertEquals(1, LongUtils.jacobi(1, 15));
    assertEquals(-1, LongUtils.jacobi(2, 3));
    assertEquals(-1, LongUtils.jacobi(2, 5));
    assertEquals(1, LongUtils.jacobi(2, 7));
    assertEquals(1, LongUtils.jacobi(2, 9));
    assertEquals(-1, LongUtils.jacobi(2, 11));
    assertEquals(-1, LongUtils.jacobi(2, 13));
    assertEquals(1, LongUtils.jacobi(2, 15));
    assertEquals(0, LongUtils.jacobi(3, 3));
    assertEquals(-1, LongUtils.jacobi(3, 5));
    assertEquals(-1, LongUtils.jacobi(3, 7));
    assertEquals(0, LongUtils.jacobi(3, 9));
    assertEquals(1, LongUtils.jacobi(3, 11));
    assertEquals(1, LongUtils.jacobi(3, 13));
    assertEquals(0, LongUtils.jacobi(3, 15));
    assertEquals(1, LongUtils.jacobi(4, 3));
    assertEquals(1, LongUtils.jacobi(4, 5));
    assertEquals(1, LongUtils.jacobi(4, 7));
    assertEquals(1, LongUtils.jacobi(4, 9));
    assertEquals(1, LongUtils.jacobi(4, 11));
    assertEquals(1, LongUtils.jacobi(4, 13));
    assertEquals(1, LongUtils.jacobi(4, 15));
    assertEquals(-1, LongUtils.jacobi(5, 3));
    assertEquals(0, LongUtils.jacobi(5, 5));
    assertEquals(-1, LongUtils.jacobi(5, 7));
    assertEquals(1, LongUtils.jacobi(5, 9));
    assertEquals(1, LongUtils.jacobi(5, 11));
    assertEquals(-1, LongUtils.jacobi(5, 13));
    assertEquals(0, LongUtils.jacobi(5, 15));
    assertEquals(0, LongUtils.jacobi(6, 3));
    assertEquals(1, LongUtils.jacobi(6, 5));
    assertEquals(-1, LongUtils.jacobi(6, 7));
    assertEquals(0, LongUtils.jacobi(6, 9));
    assertEquals(-1, LongUtils.jacobi(6, 11));
    assertEquals(-1, LongUtils.jacobi(6, 13));
    assertEquals(0, LongUtils.jacobi(6, 15));
    assertEquals(1, LongUtils.jacobi(7, 3));
    assertEquals(-1, LongUtils.jacobi(7, 5));
    assertEquals(0, LongUtils.jacobi(7, 7));
    assertEquals(1, LongUtils.jacobi(7, 9));
    assertEquals(-1, LongUtils.jacobi(7, 11));
    assertEquals(-1, LongUtils.jacobi(7, 13));
    assertEquals(-1, LongUtils.jacobi(7, 15));
    assertEquals(-1, LongUtils.jacobi(8, 3));
    assertEquals(-1, LongUtils.jacobi(8, 5));
    assertEquals(1, LongUtils.jacobi(8, 7));
    assertEquals(1, LongUtils.jacobi(8, 9));
    assertEquals(-1, LongUtils.jacobi(8, 11));
    assertEquals(-1, LongUtils.jacobi(8, 13));
    assertEquals(1, LongUtils.jacobi(8, 15));
    assertEquals(0, LongUtils.jacobi(9, 3));
    assertEquals(1, LongUtils.jacobi(9, 5));
    assertEquals(1, LongUtils.jacobi(9, 7));
    assertEquals(0, LongUtils.jacobi(9, 9));
    assertEquals(1, LongUtils.jacobi(9, 11));
    assertEquals(1, LongUtils.jacobi(9, 13));
    assertEquals(0, LongUtils.jacobi(9, 15));
    assertEquals(1, LongUtils.jacobi(10, 3));
    assertEquals(0, LongUtils.jacobi(10, 5));
    assertEquals(-1, LongUtils.jacobi(10, 7));
    assertEquals(1, LongUtils.jacobi(10, 9));
    assertEquals(-1, LongUtils.jacobi(10, 11));
    assertEquals(1, LongUtils.jacobi(10, 13));
    assertEquals(0, LongUtils.jacobi(10, 15));
  }

  public void testSqrt() {
    // test exception for negative arguments
    try {
      LongUtils.sqrt(-1L);
      fail("Exception did not trigger");
    } catch (final ArithmeticException e) {
      // ok
    }

    // compare with system sqrt
    for (long i = 0; i < 50000; ++i) {
      assertEquals("sqrt(" + i + ")", (long) Math.floor(Math.sqrt((double) i)), LongUtils.sqrt(i));
    }

    for (long i = 50000; i < 1L << 60; i = i * 3 + 1) {
      assertEquals("sqrt(" + i + ")", (long) Math.floor(Math.sqrt((double) i)), LongUtils.sqrt(i));
    }

    /*
    // perform timing test
    long time1 = System.currentTimeMillis();
    long sum1 = 0;
    for (long i = 0L; i < 500000000L; i += 70L) {
      sum1 ^= (long) Math.floor(Math.sqrt((double) i));
    }
    time1 = System.currentTimeMillis() - time1;

    long time2 = System.currentTimeMillis();
    long sum2 = 0;
    for (long i = 0L; i < 500000000L; i += 70L) {
      sum2 ^= LongUtils.sqrt(i);
    }
    time2 = System.currentTimeMillis() - time2;
    assertEquals("System sqrt time = " + time1 + " ms, LongUtils.sqrt time = " + time2 + " ms", sum1, sum2);
    */
  }

  public void testEndian() {
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian(0xEFCDAB9078563412L));
    /* assertEquals(0x1234567890ABCDEFL, LongUtils.endian1(0xEFCDAB9078563412L));
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian2(0xEFCDAB9078563412L));
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian3(0xEFCDAB9078563412L));
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian4(0xEFCDAB9078563412L));*/
  }

  /*
  private static final int LIMIT = Integer.MAX_VALUE;

  public void testEndianTiming() {
    final Timer timer = new Timer();
    timer.start();
    long k = 1;
    long s = 0;
    for (int j = 0; j < LIMIT; ++j) {
      s += LongUtils.endian(k);
      k *= 3;
    }
    System.err.println("endian " + s + " took " + timer.getElapsed() + " ms");
  }

  public void testEndian1Timing() {
    final Timer timer = new Timer();
    timer.start();
    long k = 1;
    long s = 0;
    for (int j = 0; j < LIMIT; ++j) {
      s += LongUtils.endian1(k);
      k *= 3;
    }
    System.err.println("endian1 " + s + " took " + timer.getElapsed() + " ms");
  }

  public void testEndian2Timing() {
    final Timer timer = new Timer();
    timer.start();
    long k = 1;
    long s = 0;
    for (int j = 0; j < LIMIT; ++j) {
      s += LongUtils.endian2(k);
      k *= 3;
    }
    System.err.println("endian2 " + s + " took " + timer.getElapsed() + " ms");
  }

  public void testEndian3Timing() {
    final Timer timer = new Timer();
    timer.start();
    long k = 1;
    long s = 0;
    for (int j = 0; j < LIMIT; ++j) {
      s += LongUtils.endian3(k);
      k *= 3;
    }
    System.err.println("endian3 " + s + " took " + timer.getElapsed() + " ms");
  }

  public void testEndian4Timing() {
    final Timer timer = new Timer();
    timer.start();
    long k = 1;
    long s = 0;
    for (int j = 0; j < LIMIT; ++j) {
      s += LongUtils.endian4(k);
      k *= 3;
    }
    System.err.println("endian4 " + s + " took " + timer.getElapsed() + " ms");
  }
  */

  public void testGcd() {
    assertEquals(0, LongUtils.gcd(0, 0));
    assertEquals(42, LongUtils.gcd(0, 42));
    assertEquals(42, LongUtils.gcd(42, 0));
    assertEquals(1, LongUtils.gcd(2, 3));
    assertEquals(4, LongUtils.gcd(4, 8));
    assertEquals(12, LongUtils.gcd(12 * 7, 12 * 11));
    final Random r = new Random();
    for (int k = 1; k < 100; ++k) {
      final long a = r.nextLong();
      final long b = r.nextLong();
      assertEquals(a, LongUtils.gcd(a, a));
      final long g = LongUtils.gcd(a, b);
      assertEquals(0, a % g);
      assertEquals(0, b % g);
    }
  }

  public void testLcm() {
    assertEquals(2, LongUtils.lcm(2, 2));
    assertEquals(6, LongUtils.lcm(2, 3));
    assertEquals(24, LongUtils.lcm(12, 8));
  }

  public void testNextPowerOf2() {
    long x = 0;
    for (int k = 0; k < 64; ++k) {
      x = LongUtils.nextPowerOf2(x);
      assertEquals(String.valueOf(k), 1L << k, x);
    }
    assertEquals(0, LongUtils.nextPowerOf2(Long.MIN_VALUE));
    final Random r = new Random();
    for (int j = 0; j < 1000; ++j) {
      final long k = r.nextLong();
      final long z = LongUtils.nextPowerOf2(k);
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

  public void testLg() {
    for (int k = 0; k < 63; ++k) {
      assertEquals(k, LongUtils.lg(1L << k));
      assertEquals(k, LongUtils.lg(-(1L << k)));
    }
  }

  private static final long[] PHI = {
    1, 1, 2, 2, 4, 2, 6, 4, 6, 4, 10, 4, 12, 6, 8, 8, 16, 6, 18, 8, 12, 10, 22, 8, 20, 12, 18, 12, 28, 8, 30, 16, 20, 16, 24, 12, 36, 18, 24, 16, 40, 12, 42, 20, 24, 22, 46, 16, 42, 20, 32, 24, 52, 18, 40, 24, 36, 28, 58, 16, 60, 30, 36, 32, 48, 20, 66, 32, 44};


  public void testPhi() {
    try {
      LongUtils.phi(0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      LongUtils.phi(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    for (int k = 0; k < PHI.length; ++k) {
      assertEquals(PHI[k], LongUtils.phi(k + 1));
    }
  }

  public void testDigitProduct() {
    assertEquals(0, ZUtils.digitProduct(0));
    assertEquals(1, ZUtils.digitProduct(1));
    assertEquals(0, ZUtils.digitProduct(10));
    assertEquals(1, ZUtils.digitProduct(11));
    assertEquals(2, ZUtils.digitProduct(21));
    assertEquals(2, ZUtils.digitProduct(12));
    assertEquals(2, ZUtils.digitProduct(2));
    assertEquals(362880, ZUtils.digitProduct(123456789));
    assertEquals(362880, ZUtils.digitProduct(-123456789));
  }
  
  public void testSuckInNumbers() {
    final long[] suck = LongUtils.suckInNumbers("irvine/math/long-suck.dat");
    assertEquals(2, suck.length);
    assertEquals(42, suck[0]);
    assertEquals(-23, suck[1]);
  }

  public void testRandom() {
    final long[] v = new long[3];
    LongUtils.random(v);
    assertTrue(v[0] != 0);
    assertTrue(v[1] != 0);
    assertTrue(v[2] != 0);
    assertTrue(v[1] != v[0]);
    assertTrue(v[1] != v[2]);
    assertTrue(v[2] != v[0]);
  }

  public void testMax() {
    assertEquals(10, LongUtils.max(10, 1));
    assertEquals(10, LongUtils.max(10, 10));
    assertEquals(10, LongUtils.max(1, 10));
    assertEquals(-1, LongUtils.max(-1, -10, -20, -18));
  }

  public void testSwizzle() {
    assertEquals(5, LongUtils.swizzle(3));
    assertEquals(6, LongUtils.swizzle(5));
    assertEquals(9, LongUtils.swizzle(6));
  }

  public void testReverse() {
    assertEquals(0, LongUtils.reverse(0));
    assertEquals(1, LongUtils.reverse(1));
    assertEquals(42, LongUtils.reverse(24));
    assertEquals(1, LongUtils.reverse(10));
    assertEquals(123456789, LongUtils.reverse(9876543210L));
  }

  public void testToLongFromString() {
    assertEquals("[12, -1]", Arrays.toString(LongUtils.toLong("12,-1")));
    assertEquals("[12, -1]", Arrays.toString(LongUtils.toLong("12 -1")));
    assertEquals("[12, -1]", Arrays.toString(LongUtils.toLong("12, -1")));
    assertEquals("[12, -1]", Arrays.toString(LongUtils.toLong("[12,-1]")));
    assertEquals("[12, -1]", Arrays.toString(LongUtils.toLong("(12, -1)")));
    assertEquals("[12, -1, 42, 0]", Arrays.toString(LongUtils.toLong("{12, -1, 42,  0}")));
  }

  public void testKronecker() {
    assertEquals(0, LongUtils.kronecker(15, 15));
    assertEquals(1, LongUtils.kronecker(-15, 2));
    assertEquals(-1, LongUtils.kronecker(5, 2));
    assertEquals(-1, LongUtils.kronecker(5, 3));
  }
}
