package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LogicalTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testNot() {
    assertEquals(Z.NEG_ONE, Z.ZERO.not());
    assertEquals(Z.ZERO, Z.NEG_ONE.not());
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertFalse(z.equals(z.not()));
      assertEquals(z, z.not().not());
      assertEquals(i + "~" + ~i + "=" + BigInteger.valueOf(i).not(), BigInteger.valueOf(i).not(), z.not().bigIntegerValue());
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v = new BigInteger(i, RANDOM);
      final Z z = Z.valueOf(v);
      assertFalse(z.equals(z.not()));
      assertEquals(z, z.not().not());
      assertEquals(v.not(), z.not().bigIntegerValue());
      // check immutability
      assertEquals(v, z.bigIntegerValue());
    }
  }

  public void testAnd() {
    assertEquals(Z.ZERO, Z.ZERO.and(Z.ZERO));
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertEquals(Z.ZERO, Z.ZERO.and(z));
      assertEquals(Z.ZERO, z.and(Z.ZERO));
      assertEquals(z, z.and(z));
      assertEquals(i & (i + 2), z.and(z.add(Z.TWO)).longValue());
    }
    for (int j = 30; j < 64; ++j) {
      final long limit = 1L << j;
      for (long i = limit - 100L; i < limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(Z.ZERO, Z.ZERO.and(z));
        assertEquals(Z.ZERO, z.and(Z.ZERO));
        assertEquals(z, z.and(z));
        assertEquals(i & (i + 2L), z.and(z.add(Z.TWO)).longValue());
      }
      for (long i = -limit - 100L; i < -limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(Z.ZERO, Z.ZERO.and(z));
        assertEquals(Z.ZERO, z.and(Z.ZERO));
        assertEquals(z, z.and(z));
        assertEquals(i & (i + 2L), z.and(z.add(Z.TWO)).longValue());
      }
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i, RANDOM);
      final BigInteger v3 = v1.negate();
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      final Z z3 = z1.negate();
      assertEquals(z1, z1.and(z1));
      assertEquals(z3, z3.and(z3));
      assertEquals(v1 + "&" + v2, v1.and(v2), z1.and(z2).bigIntegerValue());
      assertEquals(v2 + "&-" + v1, v3.and(v2), z3.and(z2).bigIntegerValue());
      assertEquals(v1 + "&-" + v2, v1.and(v2.negate()), z1.and(z2.negate()).bigIntegerValue());
      assertEquals("-" + v1 + "&-" + v2, v3.and(v2.negate()), z3.and(z2.negate()).bigIntegerValue());
      // check immutability
      assertEquals(v1, z1.bigIntegerValue());
      assertEquals(v2, z2.bigIntegerValue());
      assertEquals(v3, z3.bigIntegerValue());
    }
    // check something that ands to 0
    Z z = Z.valueOf(0x0F0F0F0F0F0F0F0FL).and(Z.valueOf(0x70F0F0F0F0F0F0F0L));
    assertTrue(z.isZero());
    assertEquals(0, z.bitLength());
    z = Z.valueOf(0x0F0F0F0F0F0F0F0FL).and(Z.valueOf(0xF0F0F0F0F0F0F0F0L));
    assertTrue(z.isZero());
    assertEquals(0, z.bitLength());
    z = Z.valueOf(0x8F0F0F0F0F0F0F0FL).and(Z.valueOf(0xF0F0F0F0F0F0F0F0L));
    BigInteger v = BigInteger.valueOf(0x8F0F0F0F0F0F0F0FL).and(BigInteger.valueOf(0xF0F0F0F0F0F0F0F0L));
    assertEquals(v, z.bigIntegerValue());
    // test a potential overflow
    z = Z.valueOf(0x8000000020000000L).and(Z.valueOf(0x8000000010000000L));
    v = BigInteger.valueOf(0x8000000020000000L).and(BigInteger.valueOf(0x8000000010000000L));
    assertEquals(String.valueOf(v), v, z.bigIntegerValue());
  }

  public void testAndNot() {
    assertEquals(Z.ZERO, Z.ZERO.andNot(Z.ZERO));
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertEquals(Z.ZERO, Z.ZERO.andNot(z));
      assertEquals(z, z.andNot(Z.ZERO));
      assertEquals(Z.ZERO, z.andNot(z));
      assertEquals(String.valueOf(i), i & ~(i + 2L), z.andNot(z.add(Z.TWO)).longValue());
    }
    for (int j = 30; j < 64; ++j) {
      final long limit = 1L << j;
      for (long i = limit - 100L; i < limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(Z.ZERO, Z.ZERO.andNot(z));
        assertEquals(z, z.andNot(Z.ZERO));
        assertEquals(Z.ZERO, z.andNot(z));
        assertEquals(z, z.andNot(z.not()));
        assertEquals(i & ~(i + 2L), z.andNot(z.add(Z.TWO)).longValue());
      }
      for (long i = -limit - 100L; i < -limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(Z.ZERO, Z.ZERO.andNot(z));
        assertEquals(z, z.andNot(Z.ZERO));
        assertEquals(Z.ZERO, z.andNot(z));
        assertEquals(z, z.andNot(z.not()));
        assertEquals(i & ~(i + 2L), z.andNot(z.add(Z.TWO)).longValue());
      }
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i, RANDOM);
      final BigInteger v3 = v1.negate();
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      final Z z3 = z1.negate();
      assertEquals(Z.ZERO, z1.andNot(z1));
      assertEquals(Z.ZERO, z3.andNot(z3));
      assertEquals(v1 + "&" + v2, v1.andNot(v2), z1.andNot(z2).bigIntegerValue());
      assertEquals(v2 + "&-" + v1, v3.andNot(v2), z3.andNot(z2).bigIntegerValue());
      assertEquals(v1 + "&-" + v2, v1.andNot(v2.negate()), z1.andNot(z2.negate()).bigIntegerValue());
      assertEquals("-" + v1 + "&-" + v2, v3.andNot(v2.negate()), z3.andNot(z2.negate()).bigIntegerValue());
      // check immutability
      assertEquals(v1, z1.bigIntegerValue());
      assertEquals(v2, z2.bigIntegerValue());
      assertEquals(v3, z3.bigIntegerValue());
    }
  }

  public void testOr() {
    assertEquals(Z.ZERO, Z.ZERO.or(Z.ZERO));
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertEquals(z, Z.ZERO.or(z));
      assertEquals(z, z.or(Z.ZERO));
      assertEquals(z, z.or(z));
      assertEquals(i | (i + 2), z.or(z.add(Z.TWO)).longValue());
    }
    for (int j = 30; j < 64; ++j) {
      final long limit = 1L << j;
      for (long i = limit - 100L; i < limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(z, Z.ZERO.or(z));
        assertEquals(z, z.or(Z.ZERO));
        assertEquals(z, z.or(z));
        assertEquals(i | (i + 2L), z.or(z.add(Z.TWO)).longValue());
      }
      for (long i = -limit - 100L; i < -limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(z, Z.ZERO.or(z));
        assertEquals(z, z.or(Z.ZERO));
        assertEquals(z, z.or(z));
        assertEquals(i | (i + 2L), z.or(z.add(Z.TWO)).longValue());
      }
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i, RANDOM);
      final BigInteger v3 = v1.negate();
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      final Z z3 = z1.negate();
      assertEquals(z1, z1.or(z1));
      assertEquals(z3, z3.or(z3));
      assertEquals(v1 + "|" + v2, v1.or(v2), z1.or(z2).bigIntegerValue());
      assertEquals(v2 + "|-" + v1, v3.or(v2), z3.or(z2).bigIntegerValue());
      assertEquals(v1 + "|-" + v2, v1.or(v2.negate()), z1.or(z2.negate()).bigIntegerValue());
      assertEquals("-" + v1 + "|-" + v2, v3.or(v2.negate()), z3.or(z2.negate()).bigIntegerValue());
      // check immutability
      assertEquals(v1, z1.bigIntegerValue());
      assertEquals(v2, z2.bigIntegerValue());
      assertEquals(v3, z3.bigIntegerValue());
    }
  }

  public void testXor() {
    assertEquals(Z.ZERO, Z.ZERO.xor(Z.ZERO));
    for (long i = -100L; i < 100L; ++i) {
      final Z z = Z.valueOf(i);
      assertEquals(z, Z.ZERO.xor(z));
      assertEquals(z, z.xor(Z.ZERO));
      assertEquals(Z.ZERO, z.xor(z));
      assertEquals(i ^ (i + 2), z.xor(z.add(Z.TWO)).longValue());
    }
    for (int j = 30; j < 64; ++j) {
      final long limit = 1L << j;
      for (long i = limit - 100L; i < limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(z, Z.ZERO.xor(z));
        assertEquals(z, z.xor(Z.ZERO));
        assertEquals(Z.ZERO, z.xor(z));
        assertEquals(i ^ (i + 2L), z.xor(z.add(Z.TWO)).longValue());
      }
      for (long i = -limit - 100L; i < -limit + 100L; ++i) {
        final Z z = Z.valueOf(i);
        assertEquals(z, Z.ZERO.xor(z));
        assertEquals(z, z.xor(Z.ZERO));
        assertEquals(Z.ZERO, z.xor(z));
        assertEquals(i ^ (i + 2L), z.xor(z.add(Z.TWO)).longValue());
      }
    }
    for (int i = 30; i < 1000; ++i) {
      final BigInteger v1 = new BigInteger(i, RANDOM);
      final BigInteger v2 = new BigInteger(i, RANDOM);
      final BigInteger v3 = v1.negate();
      final Z z1 = Z.valueOf(v1);
      final Z z2 = Z.valueOf(v2);
      final Z z3 = z1.negate();
      assertEquals(Z.ZERO, z1.xor(z1));
      assertEquals(Z.ZERO, z3.xor(z3));
      assertEquals(v1 + "^" + v2, v1.xor(v2), z1.xor(z2).bigIntegerValue());
      assertEquals(v2 + "^-" + v1, v3.xor(v2), z3.xor(z2).bigIntegerValue());
      assertEquals(v1 + "^-" + v2, v1.xor(v2.negate()), z1.xor(z2.negate()).bigIntegerValue());
      assertEquals("-" + v1 + "^-" + v2, v3.xor(v2.negate()), z3.xor(z2.negate()).bigIntegerValue());
      // check immutability
      assertEquals(v1, z1.bigIntegerValue());
      assertEquals(v2, z2.bigIntegerValue());
      assertEquals(v3, z3.bigIntegerValue());
    }
  }

  public void testClear() {
    try {
      Z.ZERO.clearBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ONE.clearBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.clearBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.negate().clearBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }

    // test o==o return on clearing already clear bit
    final Z o = Z.valueOf(5L);
    assertTrue(o == o.clearBit(1));
    assertTrue(o == o.clearBit(1000));
    assertTrue(Z.ZERO == Z.ZERO.clearBit(0));
    assertTrue(Z.ZERO == Z.ZERO.clearBit(10));
    for (long i = -50L; i < 100L; ++i) {
      for (int j = 0; j < 50; ++j) {
        assertEquals(BigInteger.valueOf(i).clearBit(j), Z.valueOf(i).clearBit(j).bigIntegerValue());
      }
    }
    for (int i = 30; i < 1000; i += 7) {
      final BigInteger v = new BigInteger(i, RANDOM);
      for (int j = 0; j < 50; ++j) {
        final Z z = Z.valueOf(v);
        assertEquals(v.clearBit(j), z.clearBit(j).bigIntegerValue());
        assertEquals(z, z.clearBit(1001));
      }
    }
    BigInteger v = BigInteger.ONE;
    for (int i = 1; i < 100; ++i) {
      v = v.shiftLeft(1);
      assertEquals(BigInteger.ZERO, v.clearBit(i));
      final Z z = Z.valueOf(v);
      assertEquals(Z.ZERO, z.clearBit(i));
      // check immutability
      assertEquals(v, z.bigIntegerValue());
    }
    // try some clears on a big negative number
    v = BigInteger.ONE.negate();
    for (int i = 1; i < 100; ++i) {
      v = v.shiftLeft(7);
      assertEquals(v.clearBit(5000), Z.valueOf(v).clearBit(5000).bigIntegerValue());
      assertEquals(v.negate().clearBit(5000), Z.valueOf(v).negate().clearBit(5000).bigIntegerValue());
    }
  }

  public void testSet() {
    try {
      Z.ZERO.setBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ONE.setBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.setBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.negate().setBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }

    // test o==o return on seting already set bit
    final Z o = Z.valueOf(6L);
    assertTrue(o == o.setBit(1));
    final Z oneOhTwoThree = Z.valueOf(1023L);
    for (int i = 0; i < 10; ++i) {
      assertTrue(oneOhTwoThree == oneOhTwoThree.setBit(i));
    }
    for (long i = -100L; i < 100L; ++i) {
      for (int j = 0; j < 50; ++j) {
        assertEquals(BigInteger.valueOf(i).setBit(j), Z.valueOf(i).setBit(j).bigIntegerValue());
      }
    }
    for (int i = 30; i < 1000; i += 7) {
      final BigInteger v = new BigInteger(i, RANDOM);
      for (int j = 0; j < 50; ++j) {
        final Z z = Z.valueOf(v);
        assertEquals(v.setBit(j), z.setBit(j).bigIntegerValue());
        // check immutability
        assertEquals(v, z.bigIntegerValue());
      }
    }
    Z z = Z.ONE;
    for (int i = 0; i < 1000; ++i, z = z.shiftLeft(1)) {
      assertTrue("i was " + i, z == z.setBit(i));
    }
    // try some sets on a big negative number
    BigInteger v = BigInteger.ONE.negate();
    for (int i = 1; i < 100; ++i) {
      v = v.shiftLeft(7);
      assertEquals(v.setBit(5000), Z.valueOf(v).setBit(5000).bigIntegerValue());
      assertEquals(v.negate().setBit(5000), Z.valueOf(v).negate().setBit(5000).bigIntegerValue());
    }
  }

  public void testSizeIncrement() {
    final Z z = Z.valueOf(Z.BASE - 1).negate();
    final Z y = Logical.clearBit(z, Z.BASE_BITS);
    assertEquals(y, Z.valueOf(Z.BASE + Z.BASE - 1).negate());
    final Z x = Logical.setBit(z, Z.BASE_BITS);
    assertEquals(x, Z.valueOf(-1073741823));
    assertEquals(y, Logical.flipBit(z, Z.BASE_BITS));
    final Z w = Z.valueOf(-Z.BASE - 1);
    assertEquals(Z.NEG_ONE, w.setBit(Z.BASE_BITS));
    final Z v = Z.ONE.shiftLeft(2 * Z.BASE_BITS).add(1);
    assertEquals(Z.ONE, Logical.flipBit(v, 2 * Z.BASE_BITS));
  }

  public void testFlip() {
    try {
      Z.ZERO.flipBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ONE.flipBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.flipBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.negate().flipBit(-1);
      fail("Accepted negative index");
    } catch (final ArithmeticException e) {
      // ok
    }

    // test o==o return on seting already set bit
    final Z o = Z.valueOf(6L);
    assertEquals(7L, o.flipBit(0).longValue());
    assertEquals(4L, o.flipBit(1).longValue());
    assertEquals(2L, o.flipBit(2).longValue());

    for (long i = -100L; i < 100L; ++i) {
      for (int j = 0; j < 50; ++j) {
        assertEquals(i + " " + j, BigInteger.valueOf(i).flipBit(j), Z.valueOf(i).flipBit(j).bigIntegerValue());
      }
    }
    for (int i = 30; i < 1000; i += 7) {
      final BigInteger v = new BigInteger(i, RANDOM);
      for (int j = 0; j < 50; ++j) {
        final Z z = Z.valueOf(v);
        assertEquals(v.flipBit(j), z.flipBit(j).bigIntegerValue());
        // check immutability
        assertEquals(v, z.bigIntegerValue());
      }
    }
    // try some flips on a big negative number
    BigInteger v = BigInteger.ONE.negate();
    for (int i = 1; i < 100; ++i) {
      v = v.shiftLeft(7);
      assertEquals(v.flipBit(5000), Z.valueOf(v).flipBit(5000).bigIntegerValue());
      assertEquals(v.negate().flipBit(5000), Z.valueOf(v).negate().flipBit(5000).bigIntegerValue());
    }
  }

  public void testTestBit() {
    try {
      Z.TWO.testBit(-1);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ZERO.testBit(-1);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    assertFalse(Z.ZERO.testBit(0));
    assertFalse(Z.ZERO.testBit(1));
    assertFalse(Z.ZERO.testBit(10));
    assertFalse(Z.ZERO.testBit(100));
    assertFalse(Z.ZERO.testBit(123456));
    assertFalse(Z.ZERO.testBit(77777777));
    for (int i = 30; i < 1000; i += 13) {
      BigInteger n = new BigInteger(i, RANDOM);
      if (RANDOM.nextBoolean()) {
        n = n.negate();
      }
      final Z zn = Z.valueOf(n);
      for (int j = 0; j < 100; ++j) {
        final int q = RANDOM.nextInt(2000);
        assertEquals(n.testBit(q), zn.testBit(q));
      }
    }
  }

  public void testToString() {
    assertEquals("0", Z.ZERO.toString());
    assertEquals("1", Z.ONE.toString());
    assertEquals("-1", Z.NEG_ONE.toString());
    assertEquals("2", Z.TWO.toString());
    assertEquals("-2", Z.TWO.negate().toString());
    assertEquals("101002716748738111", new Z("101002716748738111").toString());
    for (int i = 30; i < 1000; ++i) {
      BigInteger n = new BigInteger(i, RANDOM);
      if (RANDOM.nextBoolean()) {
        n = n.negate();
      }
      final Z zn = Z.valueOf(n);
      assertEquals(n.toString(), n.toString(), zn.toString());
    }
  }

}
