package irvine.math.z;

import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ConvertTest extends TestCase {

  public void testValueOfLong() {
    for (long i = -100L; i < 100L; ++i) {
      assertEquals(BigInteger.valueOf(i), Convert.valueOf(i).bigIntegerValue());
    }
    for (long i = 1024L; i > 0; i <<= 1) {
      assertEquals(BigInteger.valueOf(i), Convert.valueOf(i).bigIntegerValue());
    }
    for (long i = 1123L; i > 0; i <<= 1) {
      assertEquals(BigInteger.valueOf(i), Convert.valueOf(i).bigIntegerValue());
    }
    assertEquals(3, Convert.valueOf(5).mValue.length);
  }

  public void testValueOfBigInteger() {
    for (long i = -100L; i < 100L; ++i) {
      final BigInteger v = BigInteger.valueOf(i);
      assertEquals(v, Convert.bigIntegerValue(Z.valueOf(v)));
    }
    for (long i = 1024L; i > 0; i <<= 1) {
      final BigInteger v = BigInteger.valueOf(i);
      assertEquals(String.valueOf(i), v, Convert.bigIntegerValue(Z.valueOf(v)));
    }
    for (long i = 1123L; i > 0; i <<= 1) {
      final BigInteger v = BigInteger.valueOf(i);
      assertEquals(String.valueOf(i), v, Convert.bigIntegerValue(Z.valueOf(v)));
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v = new BigInteger(i, AddTest.RANDOM);
      assertEquals(v, Convert.bigIntegerValue(Z.valueOf(v)));
      assertEquals(v, Convert.bigIntegerValue(Z.valueOf(v.negate())).negate());
    }
    for (int k = 7; k < 169; ++k) {
      assertEquals(BigInteger.ONE.shiftLeft(k), Z.ONE.shiftLeft(k).bigIntegerValue());
      assertEquals(BigInteger.ONE.shiftLeft(k).subtract(BigInteger.ONE), Z.ONE.shiftLeft(k).subtract(Z.ONE).bigIntegerValue());
    }
  }

  public void testLongValue() {
    for (long i = -10L; i < 10L; ++i) {
      assertEquals(i, Convert.longValue(Z.valueOf(i)));
    }
    assertEquals(Long.MAX_VALUE, Z.valueOf(Long.MAX_VALUE).longValue());
    //    assertEquals("-9223372036854775808", Z.valueOf(Long.MIN_VALUE).toString());
    assertEquals(Long.MIN_VALUE, Z.valueOf(Long.MIN_VALUE).longValue());
    assertEquals(Integer.MAX_VALUE, Z.valueOf(Integer.MAX_VALUE).longValue());
    assertEquals(Integer.MIN_VALUE, Z.valueOf(Integer.MIN_VALUE).longValue());
    for (int i = 30; i < 300; ++i) {
      final BigInteger b = new BigInteger(i, AddTest.RANDOM);
      final Z z = Z.valueOf(b);
      assertEquals(b.longValue(), z.longValue());
    }
  }

  public void testIntValue() {
    for (int i = -100; i < 100; ++i) {
      assertEquals(i, Z.valueOf(i).intValue());
    }
    assertEquals(Integer.MAX_VALUE, Z.valueOf(Integer.MAX_VALUE).intValue());
    for (int i = 30; i < 1000; ++i) {
      final BigInteger b = new BigInteger(i, AddTest.RANDOM);
      final Z z = Z.valueOf(b);
      assertEquals(b.intValue(), z.intValue());
    }
  }

  public void testDoubleValue() {
    assertEquals(0.0, Z.ZERO.doubleValue(), 1.0E-12);
    assertEquals(1.0, Z.ONE.doubleValue(), 1.0E-12);
    assertEquals(2.0, Z.TWO.doubleValue(), 1.0E-12);
    assertEquals(-1.0, Z.NEG_ONE.doubleValue(), 1.0E-12);
    assertEquals(-2.0, Z.TWO.negate().doubleValue(), 1.0E-12);
    for (int i = 2; i < 10000; i += 17) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      if (!zd.equals(Z.ZERO)) {
        final double dv = d.doubleValue();
        final double zdv = zd.doubleValue();
        if (zdv == Double.POSITIVE_INFINITY) {
          assertTrue(Double.isInfinite(dv));
        } else {
          assertEquals(String.valueOf(d), 1.0, dv / zdv, 1.0E-12);
          assertEquals(String.valueOf(d), 1.0, d.negate().doubleValue() / zd.negate().doubleValue(), 1.0E-12);
        }
      }
    }
  }

  public void testFloatValue() {
    assertEquals(0.0F, Z.ZERO.floatValue(), 1.0E-6);
    assertEquals(1.0F, Z.ONE.floatValue(), 1.0E-6);
    assertEquals(2.0F, Z.TWO.floatValue(), 1.0E-6);
    assertEquals(-1.0F, Z.NEG_ONE.floatValue(), 1.0E-6);
    assertEquals(-2.0F, Z.TWO.negate().floatValue(), 1.0E-6);
    for (int i = 2; i < 10000; i += 137) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      if (!zd.equals(Z.ZERO)) {
        final float dv = d.floatValue();
        final float zdv = zd.floatValue();
        if (zdv == Float.POSITIVE_INFINITY) {
          assertTrue(Double.isInfinite(dv));
        } else {
          assertEquals(String.valueOf(d), 1.0, dv / zdv, 1.0E-6);
          assertEquals(1.0, d.negate().floatValue() / zd.negate().floatValue(), 1.0E-6);
        }
      }
    }
  }

  public void testCons() {
    for (int base = 2; base < 37; ++base) {
      assertEquals(Z.ZERO, new Z("0", base));
    }
    assertEquals(123456789L, new Z("123456789").longValue());
    assertEquals(-123456789L, new Z("-123456789").longValue());
    assertEquals(123456789L, new Z("75BCD15", 16).longValue());
    assertEquals(123456789L, new Z("75bcd15", 16).longValue());
    assertEquals(123456789L, new Z("21I3V9", 36).longValue());
    assertEquals(123456789L, new Z("111010110111100110100010101", 2).longValue());
    assertEquals(-123456789L, new Z("-111010110111100110100010101", 2).longValue());
  }

  public void testExceptions() {
    try {
      Convert.valueOf("1", -1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Radix must be in [2,36].", e.getMessage());
    }
    try {
      Convert.valueOf("1", 0);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Radix must be in [2,36].", e.getMessage());
    }
    try {
      Convert.valueOf("1", 1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Radix must be in [2,36].", e.getMessage());
    }
    try {
      Convert.valueOf("1", 37);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Radix must be in [2,36].", e.getMessage());
    }
    try {
      Convert.valueOf("", 2);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Empty string not allowed.", e.getMessage());
    }
    try {
      Convert.valueOf("-", 2);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Minus without digits.", e.getMessage());
    }
    try {
      Convert.valueOf("-10$", 2);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Bad character in number: $", e.getMessage());
    }
  }

  public void testBoundaryCases() {
    assertEquals(Z.ONE.shiftLeft(32), Convert.valueOf("100000000000000000000000000000000", 2));
    assertEquals(Z.ONE.shiftLeft(33), Convert.valueOf("1000000000000000000000000000000000", 2));
    assertEquals(Z.ONE.shiftLeft(63), Convert.valueOf("1000000000000000000000000000000000000000000000000000000000000000", 2));
    assertEquals(Z.ONE.shiftLeft(64), Convert.valueOf("10000000000000000000000000000000000000000000000000000000000000000", 2));
    assertEquals(Z.ONE.shiftLeft(64), Convert.valueOf("11112220022122120101211020120210210211221", 3));
    // Ideally would want 1 << 28 in the test below, but this requires lots of
    // RAM.  The following value seems to work with smaller JVM sizes.
    assertNotNull(Z.ONE.shiftLeft(1 << 25).bigIntegerValue());
  }

}
