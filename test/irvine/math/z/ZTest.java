package irvine.math.z;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ZTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testZero() {
    assertEquals(Z.ZERO, Z.valueOf(0L));
    assertEquals(BigInteger.ZERO, Z.ZERO.bigIntegerValue());
  }

  public void testOne() {
    assertEquals(Z.ONE, Z.valueOf(1L));
    assertEquals(BigInteger.ONE, Z.ONE.bigIntegerValue());
  }

  public void testTwo() {
    assertEquals(Z.TWO, Z.valueOf(2L));
    assertEquals(BigInteger.valueOf(2L), Z.TWO.bigIntegerValue());
  }

  public void consBad(final String x) {
    try {
      new Z(x);
      fail("Took: " + x);
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void consBad(final String x, final int base) {
    try {
      new Z(x, base);
      fail("Took: " + x);
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testConsBad() {
    try {
      new Z(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    try {
      new Z((String) null, 2);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
    consBad("");
    consBad(".");
    consBad("-");
    consBad("+");
    consBad("A");
    consBad("-A");
    consBad("/");
    consBad(":");
    consBad(":", 12);
    consBad("3", 2);
    consBad("G", 15);
    consBad("g", 15);
    consBad("0", 0);
    consBad("0", 1);
    consBad("0", -1);
    consBad("-", -2);
    consBad("0", 37);
    consBad("0", 137);
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

  public void testHashcode() {
    assertEquals(42000, Z.valueOf(42000L).hashCode());
    assertEquals(1190008592, new Z("239128478234782352354375239754932").hashCode());
    assertEquals(1190008592, Z.valueOf(new BigInteger("239128478234782352354375239754932")).hashCode());
    final HashSet<Integer> hs = new HashSet<>();
    // check all -1000+1000 have different hashes
    for (long i = -1000L; i < 1000L; ++i) {
      final Integer hash = Z.valueOf(i).hashCode();
      if (hs.contains(hash)) {
        fail("Hash collision");
      }
      hs.add(hash);
    }
  }

  public void testAbs() {
    assertEquals(Z.ZERO, Z.ZERO.abs());
    assertEquals(Z.ONE, Z.ONE.abs());
    assertEquals(Z.ONE, Z.valueOf(-1L).abs());
    for (int i = 30; i < 1000; ++i) {
      final Z z = Z.valueOf(new BigInteger(i, RANDOM));
      if (!z.equals(Z.ZERO)) {
        assertEquals(z, z.abs());
        assertEquals(z, z.negate().abs());
      }
    }
  }

  public void testNegate() {
    assertEquals(Z.ZERO, Z.ZERO.negate());
    for (long i = -100L; i < 100L; ++i) {
      if (i != 0L) {
        final Z z = Z.valueOf(i);
        assertFalse(z.equals(z.negate()));
        assertEquals(z, z.negate().negate());
      }
    }
    for (int i = 30; i < 1000; ++i) {
      final Z z = Z.valueOf(new BigInteger(i, RANDOM));
      if (!z.equals(Z.ZERO)) {
        assertFalse(z.equals(z.negate()));
        assertEquals(z, z.negate().abs());
        assertEquals(z, z.negate().negate());
      }
    }
  }

  public void testMax() {
    for (int i = 30; i < 70; i += 7) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      for (int j = 1; j < 70; j += 13) {
        final BigInteger n = new BigInteger(j, RANDOM);
        final Z zn = Z.valueOf(n);
        assertEquals(d.max(n), zd.max(zn).bigIntegerValue());
        assertEquals(zd.max(zn), zn.max(zd));
      }
    }
  }

  public void testMin() {
    for (int i = 30; i < 70; i += 7) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      for (int j = 1; j < 70; j += 13) {
        final BigInteger n = new BigInteger(j, RANDOM);
        final Z zn = Z.valueOf(n);
        assertEquals(d.min(n), zd.min(zn).bigIntegerValue());
        assertEquals(zd.min(zn), zn.min(zd));
      }
    }
  }

  public void testLn() {
    try {
      Z.ZERO.ln();
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("ln(0) undefined", e.getMessage());
    }
    for (int i = 1; i < 100; ++i) {
      assertEquals(Math.log((double) i), Z.valueOf(i).ln(), 1.0E-8);
      assertEquals(Math.log((double) i), Z.valueOf(-i).ln(), 1.0E-8);
    }
    assertEquals(27.73638163158627450944339843166, new Z("1111111111111").ln(), 1.0E-8);
    assertEquals(27.73638163158627450944339843166, new Z("-1111111111111").ln(), 1.0E-8);
    assertEquals(30.0389667245804101934613898916451, new Z("11111111111111").ln(), 1.0E-8);
    assertEquals(32.341551817574464877479381345810, new Z("111111111111111").ln(), 1.0E-8);
    assertEquals(66.880328212485151137749253166684874818550, new Z("111111111111111111111111111111").ln(), 1.0E-8);
    assertEquals(135.9578810023065216582889968072168, new Z("111111111111111111111111111111111111111111111111111111111111").ln(), 1.0E-8);
    assertEquals(135.9578810023065216582889968072168, new Z("-111111111111111111111111111111111111111111111111111111111111").ln(), 1.0E-8);
  }

  public void testLogLong() {
    for (int b = -10; b < 10; ++b) {
      try {
        Z.ZERO.log(b);
        fail();
      } catch (final ArithmeticException e) {
        // ok
      }
    }

    for (int b = -2; b < 2; ++b) {
      for (int i = 1; i < 100; i += 7) {
        try {
          Z.valueOf(i).log(b);
          fail();
        } catch (final ArithmeticException e) {
          assertEquals("Base base for log", e.getMessage());
        }
      }
    }
    for (int b = 2; b < 100; ++b) {
      for (int i = 1; i < 100; i += 7) {
        assertEquals(Math.log((double) i) / Math.log(b), Z.valueOf(i).log(b), 1.0E-8);
        assertEquals(Math.log((double) i) / Math.log(b), Z.valueOf(-i).log(b), 1.0E-8);
      }
    }
    assertEquals(27.73638163158627450944339843166 / Math.log(2.0), new Z("1111111111111").log(2), 1.0E-8);
    assertEquals(27.73638163158627450944339843166 / Math.log(10.0), new Z("-1111111111111").log(10), 1.0E-8);
    assertEquals(30.0389667245804101934613898916451 / Math.log(100.0), new Z("11111111111111").log(100), 1.0E-8);
    assertEquals(32.341551817574464877479381345810 / Math.log(16.0), new Z("111111111111111").log(16), 1.0E-8);
    assertEquals(66.880328212485151137749253166684874818550 / Math.log(7.0), new Z("111111111111111111111111111111").log(7), 1.0E-8);
    assertEquals(135.9578810023065216582889968072168 / Math.log(65536.0), new Z("111111111111111111111111111111111111111111111111111111111111").log(65536), 1.0E-8);
    assertEquals(135.9578810023065216582889968072168 / Math.log(27.0), new Z("-111111111111111111111111111111111111111111111111111111111111").log(27), 1.0E-8);
  }

  public void testLogDouble() {
    for (int b = -1; b < 1; ++b) {
      try {
        Z.ZERO.log(b);
        fail();
      } catch (final ArithmeticException e) {
        // ok
      }
    }
    for (int b = -2; b < 2; ++b) {
      for (int i = 1; i < 100; i += 17) {
        try {
          Z.valueOf(i).log(b);
          fail();
        } catch (final ArithmeticException e) {
          // ok
        }
      }
    }
    for (double b = 2.0; b < 7.0; b += 0.3) {
      for (int i = 1; i < 100; i += 17) {
        assertEquals(Math.log((double) i) / Math.log(b), Z.valueOf(i).log(b), 1.0E-8);
        assertEquals(Math.log((double) i) / Math.log(b), Z.valueOf(-i).log(b), 1.0E-8);
      }
    }
    assertEquals(27.73638163158627450944339843166 / Math.log(2.3), new Z("1111111111111").log(2.3), 1.0E-8);
    assertEquals(27.73638163158627450944339843166 / Math.log(1.2), new Z("-1111111111111").log(1.2), 1.0E-8);
    assertEquals(30.0389667245804101934613898916451 / Math.log(100.7), new Z("11111111111111").log(100.7), 1.0E-8);
    assertEquals(135.9578810023065216582889968072168 / Math.log(65536.9), new Z("111111111111111111111111111111111111111111111111111111111111").log(65536.9), 1.0E-8);
  }

  public void testModSquare() {
    try {
      Z.TWO.modSquare(Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    for (int i = 30; i < 100; i += 13) {
      final Z n = Z.valueOf(new BigInteger(i, RANDOM));
      for (int j = 0; j < 100; j += 13) {
        final Z m = Z.valueOf(new BigInteger(j, RANDOM));
        if (Z.ZERO.equals(m)) {
          continue;
        }
        assertEquals(n.square().mod(m), n.modSquare(m));
        assertEquals(n.square().mod(m.negate()), n.modSquare(m.negate()));
        assertEquals(n.negate().square().mod(m.negate()), n.negate().modSquare(m.negate()));
        assertEquals(n.negate().square().mod(m), n.negate().modSquare(m));
      }
    }
  }

  public void testModMultiply() {
    try {
      Z.TWO.modMultiply(Z.ONE, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    for (int i = 30; i < 100; i += 13) {
      final Z n = Z.valueOf(new BigInteger(i, RANDOM));
      for (int j = 5; j < 100; j += 13) {
        final Z m = Z.valueOf(new BigInteger(j, RANDOM));
        if (Z.ZERO.equals(m)) {
          continue;
        }
        for (int k = 5; k < 100; k += 13) {
          final Z b = Z.valueOf(new BigInteger(k, RANDOM));
          assertEquals(n.multiply(b).mod(m), n.modMultiply(b, m));
          assertEquals(n.multiply(b).mod(m.negate()), n.modMultiply(b, m.negate()));
          assertEquals(n.negate().multiply(b).mod(m.negate()), n.negate().modMultiply(b, m.negate()));
          assertEquals(n.negate().multiply(b).mod(m), n.negate().modMultiply(b, m));
        }
      }
    }
  }

  public void testModMultiply2() {
    try {
      Z.TWO.modMultiply(1, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    for (int i = 30; i < 100; i += 13) {
      final Z n = Z.valueOf(new BigInteger(i, RANDOM));
      for (int j = 5; j < 100; j += 13) {
        final Z m = Z.valueOf(new BigInteger(j, RANDOM));
        if (Z.ZERO.equals(m)) {
          continue;
        }
        final long b = RANDOM.nextLong();
        assertEquals(n.multiply(b).mod(m), n.modMultiply(b, m));
        assertEquals(n.multiply(b).mod(m.negate()), n.modMultiply(b, m.negate()));
        assertEquals(n.negate().multiply(b).mod(m.negate()), n.negate().modMultiply(b, m.negate()));
        assertEquals(n.negate().multiply(b).mod(m), n.negate().modMultiply(b, m));
      }
    }
  }

  public void testInverse() {
    try {
      Z.TWO.modInverse(Z.ONE);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Modulus 1 not supported.", e.getMessage());
    }
    try {
      Z.ZERO.modInverse(Z.TWO);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Zero or negative inverse attempt.", e.getMessage());
    }
    try {
      Z.TWO.modInverse(Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Zero or negative inverse attempt.", e.getMessage());
    }
    for (int i = 30; i < 1000; i += 13) {
      final BigInteger nn = new BigInteger(i, RANDOM);
      if (BigInteger.ZERO.equals(nn)) {
        continue;
      }
      final Z n = Z.valueOf(nn);
      for (int j = 5; j < 1000; j += 137) {
        final BigInteger mm = new BigInteger(j, RANDOM);
        if (mm.compareTo(BigInteger.ONE) <= 0) {
          continue;
        }
        final Z m = Z.valueOf(mm);
        final Z r = n.modInverse(m);
        final long h = n.auxiliary();
        if (h == 0L) {
          assertEquals(nn.modInverse(mm), r.bigIntegerValue());
          assertEquals(Z.ONE, r.modMultiply(n, m));
        } else {
          assertEquals(1L, h);
          assertEquals(nn + " " + mm + " " + r.bigIntegerValue(), n.gcd(m), r);
          try {
            assertNull(nn.modInverse(mm));
            fail();
          } catch (final ArithmeticException e) {
            // ok
          }
        }
      }
    }
  }

  public void testInverseSpecific() {
    final Z mod = Z.valueOf(16011);
    final Z b = Z.valueOf(1893);
    b.modInverse(mod);
    assertEquals(1, b.auxiliary());
  }

  public void testSignum() {
    assertEquals(0, Z.ZERO.signum());
    assertEquals(1, Z.ONE.signum());
    assertEquals(-1, Z.NEG_ONE.signum());
    assertEquals(1, Z.TWO.signum());
    assertEquals(-1, Z.TWO.negate().signum());
    for (int i = 30; i < 1000; i += 13) {
      BigInteger n = new BigInteger(i, RANDOM);
      if (RANDOM.nextBoolean()) {
        n = n.negate();
      }
      final Z zn = Z.valueOf(n);
      assertEquals(n.signum(), zn.signum());
    }
  }

  public void testIsEven() {
    assertTrue(Z.ZERO.isEven());
    assertTrue(Z.TWO.isEven());
    assertTrue(Z.TWO.negate().isEven());
    assertFalse(Z.ONE.isEven());
    assertFalse(Z.NEG_ONE.isEven());
    assertTrue(Z.valueOf(24324326L).isEven());
    assertFalse(Z.valueOf(243243261L).isEven());
  }

  public void testMethodNamesMatch() {
    final Method[] bimethods = BigInteger.class.getMethods();
    final Method[] zmethods = Z.class.getMethods();
    final HashSet<String> h = new HashSet<>();
    for (final Method method : zmethods) {
      h.add(method.getName());
    }
    h.add("nextProbablePrime"); // ignore this one
    for (final Method bimethod : bimethods) {
      if (!h.contains(bimethod.getName())) {
        fail("Missing: " + bimethod.getName());
      }
    }
  }

  public void testModAdd() {
    try {
      Z.TWO.modAdd(Z.ONE, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    for (int i = 1; i < 100; ++i) {
      final Z n = Z.valueOf(new BigInteger(i, RANDOM));
      if (n.signum() != 0) {
        final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
        final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
        assertEquals(a + "+" + b + "%" + n, a.add(b).mod(n), a.modAdd(b, n));
      }
    }
  }

  public void testModSubtract() {
    try {
      Z.TWO.modSubtract(Z.ONE, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    for (int i = 1; i < 100; ++i) {
      final Z n = Z.valueOf(new BigInteger(i, RANDOM));
      if (n.signum() != 0) {
        final Z a = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
        final Z b = Z.valueOf(new BigInteger(i, RANDOM)).mod(n);
        assertEquals(a + "-" + b + "%" + n, a.subtract(b).mod(n), a.modSubtract(b, n));
      }
    }
  }

  public void testExtendedEuclid() {
    final Z a = Z.valueOf(32743);
    final Z b = Z.valueOf(2321);
    final Z[] t = a.extendedGcd(b);
    final Z[] u = ExtendedEuclid.extendedEuclid(a, b);
    assertEquals(3, t.length);
    assertEquals(t[0], u[0]);
    assertEquals(t[1], u[1]);
    assertEquals(t[2], u[2]);
  }

  public void testMods() {
    final Z z1 = new Z("11733607275371786281");
    final Z p = new Z("1231243217");
    assertTrue(p.isPrime());
    assertTrue(p.isProbablePrime(3));
    assertFalse(Z.FOUR.isPrime());
    assertEquals(new Z("268294310"), z1.modSqrt(p));
    try {
      Z.valueOf(341550071728361L).isPrime();
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertTrue(Z.valueOf(341550071728361L).isProbablePrime(1));
    assertEquals(Jacobi.jacobi(z1, p), z1.jacobi(p));
    try {
      z1.modMultiply(5, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Zero modulus", e.getMessage());
    }
    try {
      z1.modAdd(z1, Z.ZERO);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Zero modulus", e.getMessage());
    }
    assertNotNull(z1.isPower());
    assertNotNull(z1.root(2));
    assertTrue(z1 == z1.modAdd(Z.ZERO, p));
    assertTrue(z1 == Z.ZERO.modAdd(z1, p));
    assertTrue(Z.ZERO == z1.modMultiply(Z.ZERO, p));
    assertTrue(Z.ZERO == Z.ZERO.modMultiply(z1, p));
    assertTrue(Z.ZERO == z1.modMultiply(0, p));
    assertEquals(z1.mod(p), z1.modMultiply(1, p));
    assertTrue(Z.ZERO == Z.ZERO.modMultiply(4, p));
    assertEquals(Z.FOUR, Z.TWO.pow(2));
    assertEquals(Z.FOUR, Z.TWO.pow(Z.TWO));
    assertEquals(p.subtract(z1), Z.ZERO.modSubtract(z1, p));
    assertEquals(Z.ONE, Z.FIVE.remainder(Z.TWO));
    assertEquals(Z.TWO, Z.FIVE.divide(Z.TWO));
    assertEquals(3, Z.THREE.intValue());
    assertEquals(6, Z.SIX.longValueExact());
    assertEquals(7, Z.SEVEN.longValueExact());
    assertEquals(8, Z.EIGHT.longValueExact());
    assertEquals(9, Z.NINE.longValueExact());
    assertEquals(10, Z.TEN.longValueExact());
  }

  public void testGetValue() {
    assertEquals(0, Z.ZERO.getValue().length);
    assertEquals(1, Z.ZERO.toByteArray().length);
    assertEquals("0", Z.ZERO.toString(2));
    assertEquals("0", Z.ZERO.toString());
    assertEquals(-1, Z.ZERO.getLowestSetBit());
    assertEquals(Z.ONE, Z.ZERO.flipBit(0));
    assertEquals(Z.ONE, Z.ZERO.setBit(0));
    assertEquals(Z.ZERO, Z.ZERO.clearBit(0));
    assertEquals(Z.ZERO, Z.ZERO.and(Z.ZERO));
    assertEquals(Z.ZERO, Z.ZERO.andNot(Z.ZERO));
    assertEquals(Z.ZERO, Z.ZERO.or(Z.ZERO));
    assertEquals(Z.ZERO, Z.ZERO.xor(Z.ZERO));
    assertEquals(Z.ZERO, Z.ZERO.shiftLeft(1));
    assertEquals(Z.ZERO, Z.ZERO.shiftRight(1));
    assertEquals(Z.NEG_ONE, Z.ZERO.not());
    assertEquals(0, Z.ZERO.compareTo(Z.ZERO));
    assertEquals(0.0, Z.ZERO.floatValue(), 0);
    assertEquals(0.0, Z.ZERO.doubleValue(), 0);
    assertEquals(0, Z.ZERO.longValue());
    assertEquals(0, Z.ZERO.intValue());
    assertEquals(BigInteger.ZERO, Z.ZERO.bigIntegerValue());
    assertEquals(0, Z.ZERO.bitCount());
    assertEquals(0, Z.NEG_ONE.bitCount());
    assertEquals(1, Z.valueOf(-2).bitCount());
    assertEquals(0, Z.ZERO.bitLength());
    // Note difference of behaviour to BigInteger on bitLength for -1
    assertEquals(1, Z.NEG_ONE.bitLength());
    assertEquals(0, BigInteger.ONE.negate().bitLength());
  }
  
  public void testBitLength() {
    final Random r = new Random();
    for (int k = 0; k < 10; ++k) {
      final Z v = Z.valueOf(r.nextLong());
      final BigInteger b = v.bigIntegerValue();
      assertEquals(b.bitLength(), v.bitLength());
    }
  }
  
  public void testInits() {
    final Z z = new Z(new int[] {0, 33}, 2);
    assertEquals(-1, z.mFirstNonzeroDigitIndex);
    assertEquals(0, z.mAuxiliary);
    assertEquals(36, z.bitLength());
    assertEquals(2, z.bitCount());
  }

  public void testSomeStatics() {
    assertNotNull(Z.probablePrime(5, new Random()));
  }

  public void testLeastCommonMultiple() {
    assertEquals(12, Z.FOUR.lcm(Z.THREE).longValue());
    assertEquals(4, Z.FOUR.lcm(Z.TWO).longValue());
  }

  public void test569() {
    assertTrue(Z.valueOf(569).isProbablePrime());
  }
}
