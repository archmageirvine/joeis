package irvine.math;

import java.util.Arrays;
import java.util.Random;

import irvine.util.time.Timer;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class IntegerUtilsTest extends TestCase {

  public void testLg() {
    assertEquals(0, IntegerUtils.lg(0));
    for (int i = 1, j = 1; j >= 0; ++i, j <<= 1) {
      assertEquals(i, IntegerUtils.lg(j));
      assertEquals(i, IntegerUtils.lg(-j));
    }
    for (int i = 2, j = 2; j >= 0; ++i, j <<= 1) {
      assertEquals(i, IntegerUtils.lg(j + 1));
      assertEquals(i, IntegerUtils.lg(-j - 1));
    }
    assertEquals(31, IntegerUtils.lg(0x7FFFFFFF));
  }

  public void testCharToValue() {
    for (int k = 0, j = '0'; j <= '9'; ++k, ++j) {
      assertEquals(k, IntegerUtils.charToValue((char) j));
    }
    for (int k = 10, j = 'a'; j <= 'z'; ++k, ++j) {
      assertEquals(k, IntegerUtils.charToValue((char) j));
    }
    for (int k = 10, j = 'A'; j <= 'Z'; ++k, ++j) {
      assertEquals(k, IntegerUtils.charToValue((char) j));
    }
    assertEquals(-1, IntegerUtils.charToValue('\0'));
    assertEquals(-1, IntegerUtils.charToValue(' '));
    assertEquals(-1, IntegerUtils.charToValue('\u0001'));
    assertEquals(-1, IntegerUtils.charToValue('@'));
    assertEquals(-1, IntegerUtils.charToValue('('));
    assertEquals(-1, IntegerUtils.charToValue('/'));
    assertEquals(-1, IntegerUtils.charToValue(':'));
    assertEquals(-1, IntegerUtils.charToValue('='));
    assertEquals(-1, IntegerUtils.charToValue('['));
    assertEquals(-1, IntegerUtils.charToValue('`'));
    assertEquals(-1, IntegerUtils.charToValue('{'));
    assertEquals(-1, IntegerUtils.charToValue('\uFFFF'));
    assertEquals(-1, IntegerUtils.charToValue('\u007F'));
    assertEquals(-1, IntegerUtils.charToValue('\u0080'));
  }

  public void testSqrtCorrectness() {
    try {
      IntegerUtils.sqrt(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      IntegerUtils.sqrt(Integer.MIN_VALUE);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    final Random r = new Random();
    for (int k = 0; k < 10000; ++k) {
      final int n = r.nextInt(Integer.MAX_VALUE);
      assertEquals(String.valueOf(n), (int) Math.sqrt(n), IntegerUtils.sqrt(n));
    }
    assertEquals(317, IntegerUtils.sqrt(101123));
    assertEquals(318, IntegerUtils.sqrt(101124));
  }

  /*
  public void testSqrtCorrectnessFullRange() {
    for (int k = 0; k >= 0; ++k) {
      assertEquals((int) Math.sqrt(k), IntegerUtils.sqrt(k));
    }
  }

  public void testSqrtSpeed() {
    final long start = System.currentTimeMillis();
    long s = 0;
    for (int k = 0; k >= 0; ++k) {
      s += IntegerUtils.sqrt(k);
    }
    System.err.println(s + " " + (System.currentTimeMillis() - start));
    final long s2 = System.currentTimeMillis();
    s = 0;
    for (int k = 0; k >= 0; ++k) {
      s += (int) Math.sqrt(k);
    }
    System.err.println(s + " " + (System.currentTimeMillis() - s2));
  }
  */

  public void testModPow() {
    try {
      IntegerUtils.modPow(2, 1, 0);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      IntegerUtils.modPow(2, 1, -1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(0, IntegerUtils.modPow(2, 2, 1));
    assertEquals(1, IntegerUtils.modPow(1, 2, 42));
    assertEquals(1, IntegerUtils.modPow(1, 3, 42));
    assertEquals(1, IntegerUtils.modPow(43, 2, 42));
    assertEquals(1, IntegerUtils.modPow(0, 0, 42));
    assertEquals(1, IntegerUtils.modPow(1, 0, 42));
    assertEquals(1, IntegerUtils.modPow(42, 0, 42));
    assertEquals(0, IntegerUtils.modPow(0, 1, 42));
    assertEquals(0, IntegerUtils.modPow(0, 42, 42));
    assertEquals(0, IntegerUtils.modPow(0, 42, 42));
    assertEquals(0, IntegerUtils.modPow(42, 42, 42));
    assertEquals(12, IntegerUtils.modPow(12, 1, 42));
    assertEquals(12, IntegerUtils.modPow(54, 1, 42));
    final int limit = IntegerUtils.sqrt(Integer.MAX_VALUE);
    assertEquals(8, IntegerUtils.modPow(2, 3, limit));
    assertEquals(8, IntegerUtils.modPow(2, 3, 9));
    assertEquals(4313, IntegerUtils.modPow(37, 3, limit));
    assertEquals(36073, IntegerUtils.modPow(37, 76543, limit));
    try {
      IntegerUtils.modPow(37, 76543, limit + 1);
      fail();
    } catch (final IllegalArgumentException ex) {
      // ok
    }
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final int a = r.nextInt();
      final int n = r.nextInt(limit);
      if (a < 0) {
        try {
          IntegerUtils.modPow(a, 2, n);
          fail();
        } catch (final IllegalArgumentException ex) {
          // ok
        }
      } else if (n != 0) {
        final int y = a % n;
        assertEquals((y * y) % n, IntegerUtils.modPow(a, 2, n));
      }
    }
  }

  private static int nlz1(final int x0) {
    int x = x0;
    if (x == 0) {
      return 32;
    }
    int n = 1;
    if ((x >>> 16) == 0) {
      n += 16;
      x <<= 16;
    }
    if ((x >>> 24) == 0) {
      n += 8;
      x <<= 8;
    }
    if ((x >>> 28) == 0) {
      n += 4;
      x <<= 4;
    }
    if ((x >>> 30) == 0) {
      n += 2;
      x <<= 2;
    }
    n -= x >>> 31;
    return n;
  }

  private static int nlz2(final int x0) {
    int x = x0;
    if (x == 0) {
      return 32;
    }
    int n = 0;
    if ((x & 0xFFFF0000) == 0) {
      n += 16;
      x <<= 16;
    }
    if ((x & 0xFF000000) == 0) {
      n += 8;
      x <<= 8;
    }
    if ((x & 0xF0000000) == 0) {
      n += 4;
      x <<= 4;
    }
    if ((x & 0xC0000000) == 0) {
      n += 2;
      x <<= 2;
    }
    if ((x & 0x80000000) == 0) {
      ++n;
    }
    return n;
  }

  private static int nlz3(final int x0) {
    int x = x0;
    if (x == 0) {
      return 32;
    }
    int n = 1;
    if ((x & 0xFFFF0000) == 0) {
      n += 16;
      x <<= 16;
    }
    if ((x & 0xFF000000) == 0) {
      n += 8;
      x <<= 8;
    }
    if ((x & 0xF0000000) == 0) {
      n += 4;
      x <<= 4;
    }
    if ((x & 0xC0000000) == 0) {
      n += 2;
      x <<= 2;
    }
    return n - (x >>> 31);
  }

  private static int nlz4(final int x0) {
    int x = x0;
    int n = 32;
    int y = x >>> 16;
    if (y != 0) {
      n -= 16;
      x = y;
    }
    y = x >>> 8;
    if (y != 0) {
      n -= 8;
      x = y;
    }
    y = x >> 4;
    if (y != 0) {
      n -= 4;
      x = y;
    }
    y = x >> 2;
    if (y != 0) {
      n -= 2;
      x = y;
    }
    y = x >> 1;
    if (y != 0) {
      return n - 2;
    }
    return n - x;
  }

  private static final byte[] TABLE5 = {
    0, 1, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4,
    5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
    6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
    6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6,
    7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
    7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
    7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
    7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
    8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8,
  };

  private static int nlz5(final int x0) {
    int x = x0;
    int n = 32;
    int y = x >>> 16;
    if (y != 0) {
      n -= 16;
      x = y;
    }
    y = x >>> 8;
    if (y != 0) {
      n -= 8;
      x = y;
    }
    return n - TABLE5[x];
  }

  private static int nlz6(final int x0) {
    if (x0 <= 0) {
      return (~x0 >> 26) & 32;
    }
    int x = x0;
    int n = 1;
    if ((x >>> 16) == 0) {
      n += 16;
      x <<= 16;
    }
    if ((x >>> 24) == 0) {
      n += 8;
      x <<= 8;
    }
    if ((x >>> 28) == 0) {
      n += 4;
      x <<= 4;
    }
    if ((x >>> 30) == 0) {
      n += 2;
      x <<= 2;
    }
    n -= x >>> 31;
    return n;
  }

  private static int nlz7(final int x0) {
    int x = x0;
    int n = 32;
    int c = 16;
    do {
      final int y = x >> c;
      if (y != 0) {
        n -= c;
        x = y;
      }
      c >>= 1;
    } while (c != 0);
    return n - x;
  }

  private static int nlz8(final int x0) {
    int x = x0;
    int n = 0;
    int y = x;
    while (true) {
      if (x < 0) {
        return n;
      }
      if (y == 0) {
        return 32 - n;
      }
      ++n;
      x <<= 1;
      y >>>= 1;
    }
  }

  private static int nlz9(final int x0) {
    int x = x0;
    int y = -(x >>> 16);
    int m = (y >>> 16) & 16;
    int n = 16 - m;
    x >>>= m;

    y = x - 0x100;
    m = (y >>> 16) & 8;
    n += m;
    x <<= m;

    y = x - 0x1000;
    m = (y >>> 16) & 4;
    n += m;
    x <<= m;

    y = x - 0x4000;
    m = (y >> 16) & 2;
    n += m;
    x <<= m;

    y = x >>> 14;
    m = y & ~(y >>> 1);
    return n + 2 - m;
  }

  private static int nlz10(final int x0) {
    int x = x0;
    x |= x >>> 1;
    x |= x >>> 2;
    x |= x >>> 4;
    x |= x >>> 8;
    x |= x >>> 16;
    return Integer.bitCount(~x);
  }

  private static int nlz11(final int x) {
    if (x < 0) {
      return 0;
    } else {
      final double d = x + 0.5;
      return 1054 - (int) (Double.doubleToRawLongBits(d) >>> 52);
    }
  }

  private static int nlz12(final int x) {
    if (x < 0) {
      return 0;
    } else {
      final int xx = x & ~(x >>> 1);
      final float f = xx + 0.5F;
      return 158 - (Float.floatToRawIntBits(f) >>> 23);
    }
  }

  private static int nlz13(final int x0) {
    if (x0 == 0) {
      return 32;
    }
    int x = x0;
    int n = 0;
    while ((x & 0x80000000) == 0) {
      ++n;
      x <<= 1;
    }
    return n;
  }

  public void testNlzSpeed() {
    if ("true".equals(System.getProperty("timing"))) {
      final long[] c = new long[14];
      for (int j = 0; j < 5; ++j) {
        int n0 = 0;
        final Timer t0 = new Timer();
        t0.start();
        for (int k = 1; k != 0; ++k) {
          n0 += Integer.numberOfLeadingZeros(k);
        }
        n0 += Integer.numberOfLeadingZeros(0);
        c[0] += t0.getElapsed();
        assertEquals(-1, n0);
        int n1 = 0;
        final Timer t1 = new Timer();
        t1.start();
        for (int k = 1; k != 0; ++k) {
          n1 += nlz1(k);
        }
        n1 += nlz1(0);
        c[1] += t1.getElapsed();
        assertEquals(-1, n1);
        int n2 = 0;
        final Timer t2 = new Timer();
        t2.start();
        for (int k = 1; k != 0; ++k) {
          n2 += nlz2(k);
        }
        n2 += nlz2(0);
        c[2] += t2.getElapsed();
        assertEquals(-1, n2);
        int n3 = 0;
        final Timer t3 = new Timer();
        t3.start();
        for (int k = 1; k != 0; ++k) {
          n3 += nlz3(k);
        }
        n3 += nlz3(0);
        c[3] += t3.getElapsed();
        assertEquals(-1, n3);
        int n4 = 0;
        final Timer t4 = new Timer();
        t4.start();
        for (int k = 1; k != 0; ++k) {
          n4 += nlz4(k);
        }
        n4 += nlz4(0);
        c[4] += t4.getElapsed();
        assertEquals(-1, n4);
        int n5 = 0;
        final Timer t5 = new Timer();
        t5.start();
        for (int k = 1; k != 0; ++k) {
          n5 += nlz5(k);
        }
        n5 += nlz5(0);
        c[5] += t5.getElapsed();
        assertEquals(-1, n5);
        int n6 = 0;
        final Timer t6 = new Timer();
        t6.start();
        for (int k = 1; k != 0; ++k) {
          n6 += nlz6(k);
        }
        n6 += nlz6(0);
        c[6] += t6.getElapsed();
        assertEquals(-1, n6);
        int n7 = 0;
        final Timer t7 = new Timer();
        t7.start();
        for (int k = 1; k != 0; ++k) {
          n7 += nlz7(k);
        }
        n7 += nlz7(0);
        c[7] += t7.getElapsed();
        assertEquals(-1, n7);
        int n8 = 0;
        final Timer t8 = new Timer();
        t8.start();
        for (int k = 1; k != 0; ++k) {
          n8 += nlz8(k);
        }
        n8 += nlz8(0);
        c[8] += t8.getElapsed();
        assertEquals(-1, n8);
        int n9 = 0;
        final Timer t9 = new Timer();
        t9.start();
        for (int k = 1; k != 0; ++k) {
          n9 += nlz9(k);
        }
        n9 += nlz9(0);
        c[9] += t9.getElapsed();
        assertEquals(-1, n9);
        int n10 = 0;
        final Timer t10 = new Timer();
        t10.start();
        for (int k = 1; k != 0; ++k) {
          n10 += nlz10(k);
        }
        n10 += nlz10(0);
        c[10] += t10.getElapsed();
        assertEquals(-1, n10);
        int n11 = 0;
        final Timer t11 = new Timer();
        t11.start();
        for (int k = 1; k != 0; ++k) {
          n11 += nlz11(k);
        }
        n11 += nlz11(0);
        c[11] += t11.getElapsed();
        assertEquals(-1, n11);
        int n12 = 0;
        final Timer t12 = new Timer();
        t12.start();
        for (int k = 1; k != 0; ++k) {
          n12 += nlz12(k);
        }
        n12 += nlz12(0);
        c[12] += t12.getElapsed();
        assertEquals(-1, n12);
        int n13 = 0;
        final Timer t13 = new Timer();
        t13.start();
        for (int k = 1; k != 0; ++k) {
          n13 += nlz13(k);
        }
        n13 += nlz13(0);
        c[13] += t13.getElapsed();
        assertEquals(-1, n13);
      }
      for (int k = 0; k < c.length; ++k) {
        System.err.println("nlz" + k + " " + c[k]);
      }
    }
  }

  public void testNlzActual() {
    assertEquals(32, IntegerUtils.nlz(0));
    final Random r = new Random();
    for (int k = 1; k < 10000; ++k) {
      final int x = r.nextInt();
      assertEquals(Integer.numberOfLeadingZeros(x), IntegerUtils.nlz(x));
    }
  }

  public void testGcd() {
    assertEquals(0, IntegerUtils.gcd(0, 0));
    assertEquals(42, IntegerUtils.gcd(0, 42));
    assertEquals(42, IntegerUtils.gcd(42, 0));
    assertEquals(1, IntegerUtils.gcd(2, 3));
    assertEquals(4, IntegerUtils.gcd(4, 8));
    assertEquals(12, IntegerUtils.gcd(12 * 7, 12 * 11));
    final Random r = new Random();
    for (int k = 1; k < 100; ++k) {
      final int a = r.nextInt();
      final int b = r.nextInt();
      assertEquals(a, IntegerUtils.gcd(a, a));
      final int g = IntegerUtils.gcd(a, b);
      assertEquals(0, a % g);
      assertEquals(0, b % g);
    }
  }

  public void testLcm() {
    assertEquals(2, IntegerUtils.lcm(2, 2));
    assertEquals(6, IntegerUtils.lcm(2, 3));
    assertEquals(24, IntegerUtils.lcm(12, 8));
  }

  public void testNextPowerOf2() {
    for (int k = 0, x = 0; k < 32; ++k) {
      x = IntegerUtils.nextPowerOf2(x);
      assertEquals(String.valueOf(k), 1 << k, x);
    }
    assertEquals(0, IntegerUtils.nextPowerOf2(Integer.MIN_VALUE));
    final Random r = new Random();
    for (int j = 0; j < 1000; ++j) {
      final int k = r.nextInt();
      final int z = IntegerUtils.nextPowerOf2(k);
      if (k < 0) {
        assertEquals(0, z);
      } else {
        assertEquals(0, z & (z - 1));
        if (z != Integer.MIN_VALUE) {
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

  public void testIncrementConstantPopCount() {
    assertEquals(2, IntegerUtils.incrementConstantPopCount(1));
    assertEquals(4, IntegerUtils.incrementConstantPopCount(2));
    assertEquals(8, IntegerUtils.incrementConstantPopCount(4));
    assertEquals(5, IntegerUtils.incrementConstantPopCount(3));
    assertEquals(6, IntegerUtils.incrementConstantPopCount(5));
  }
  
  public void testSum() {
    assertEquals(42, IntegerUtils.sum(42));
    assertEquals(42, IntegerUtils.sum(new int[] {20, 22}));
    assertEquals(42, IntegerUtils.sum(new int[][] {{20}, {20, 2}}));
    assertEquals(42, IntegerUtils.sum(new Integer[] {20, 22}));
    assertEquals(42, IntegerUtils.sum(new Integer[][] {{20}, {20, 2}}));
  }

  public void testIdentity() {
    final int[] a = new int[3];
    IntegerUtils.identity(a);
    assertEquals("[0, 1, 2]", Arrays.toString(a));
  }

  public void testToArray() {
    assertEquals("[42, 1]", Arrays.toString(IntegerUtils.toArray(Arrays.asList(42, 1))));
  }

  public void testOrd() {
    assertEquals(1, IntegerUtils.ord(3, 3));
    assertEquals(2, IntegerUtils.ord(9, 3));
    assertEquals(3, IntegerUtils.ord(27, 3));
    assertEquals(0, IntegerUtils.ord(27, 2));
    assertEquals(1, IntegerUtils.ord(6, 2));
  }
}
