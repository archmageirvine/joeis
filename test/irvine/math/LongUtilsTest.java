package irvine.math;

import java.math.BigInteger;
import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
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


  public void testEndian() {
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian(0xEFCDAB9078563412L));
    /* assertEquals(0x1234567890ABCDEFL, LongUtils.endian1(0xEFCDAB9078563412L));
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian2(0xEFCDAB9078563412L));
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian3(0xEFCDAB9078563412L));
    assertEquals(0x1234567890ABCDEFL, LongUtils.endian4(0xEFCDAB9078563412L));*/
  }

  public void testLg() {
    for (int k = 0; k < 63; ++k) {
      assertEquals(k, LongUtils.log2(1L << k));
      assertEquals(k, LongUtils.log2(-(1L << k)));
    }
  }

  public void testSuckInNumbers() {
    final long[] suck = LongUtils.suckInNumbers("irvine/math/long-suck.dat");
    assertEquals(2, suck.length);
    assertEquals(42, suck[0]);
    assertEquals(-23, suck[1]);
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

  public void testHurwitzClassNumber() {
    assertEquals(16, LongUtils.hurwitzClassNumber(-351));
    assertEquals(16, LongUtils.hurwitzClassNumber(-399));
  }

  public void testClassNumber() {
    assertEquals(12, LongUtils.classNumber(-351));
    assertEquals(16, LongUtils.classNumber(-399));
  }
}
