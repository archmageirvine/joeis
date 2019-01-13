package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MulTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testMultiplyLong() {
    final Z z = Z.valueOf(4L);
    assertEquals(8L, z.multiply(2L).longValue());
    assertEquals(Z.ZERO, Z.ZERO.multiply(0L));
    assertEquals(Z.ZERO, Z.ZERO.multiply(1L));
    assertEquals(Z.ZERO, Z.ZERO.multiply(-1L));
    assertEquals(Z.ZERO, Z.ZERO.multiply(2L));
    assertEquals(Z.ZERO, Z.ZERO.multiply(1000L));

    assertEquals(Z.valueOf(3259 * -32573), Mul.multiply(Z.valueOf(3259), -32573));
    assertEquals(new Z("3499324607675"), Mul.multiply(Z.valueOf(3259), Z.BASE + 1));
    assertEquals(new Z("3499324607675"), Mul.multiply(Z.valueOf(-3259), -Z.BASE - 1));

    for (int i = 30; i < 100; ++i) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      for (int j = 0; j < 100; ++j) {
        final long n = RANDOM.nextLong() & 0x3FFFFFFF;
        assertEquals(d + "*" + n, d.multiply(BigInteger.valueOf(n)), zd.multiply(n).bigIntegerValue());
        assertEquals(d.negate().multiply(BigInteger.valueOf(n)), zd.negate().multiply(n).bigIntegerValue());
        assertEquals(d.negate().multiply(BigInteger.valueOf(-n)), zd.negate().multiply(-n).bigIntegerValue());
        assertEquals(d.multiply(BigInteger.valueOf(-n)), zd.multiply(-n).bigIntegerValue());
      }
    }
  }

  public void testMultiply() {
    assertEquals(Z.ZERO, Z.ZERO.multiply(Z.ZERO));
    assertEquals(Z.ZERO, Z.ZERO.multiply(Z.ONE));
    assertEquals(Z.ZERO, Z.ZERO.multiply(Z.NEG_ONE));
    assertEquals(Z.ZERO, Z.ZERO.multiply(Z.TWO));
    assertEquals(Z.ONE.shiftLeft(1000), Z.ONE.shiftLeft(250).multiply(Z.ONE.shiftLeft(750)));
    assertEquals(Z.ONE.shiftLeft(10000), Z.ONE.shiftLeft(2500).multiply(Z.ONE.shiftLeft(7500)));

    for (int i = 30; i < 1000; i += 11) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      assertEquals(zd.square(), zd.multiply(zd));
      for (int j = 1; j < 1000; j += 137) {
        final BigInteger n = new BigInteger(j, RANDOM);
        final Z zn = Z.valueOf(n);
        final Z res = zd.multiply(zn);
        assertEquals(d + "*" + n, d.multiply(n), res.bigIntegerValue());
        assertEquals(res, zn.multiply(zd));
        assertEquals(d.negate().multiply(n), zd.negate().multiply(zn).bigIntegerValue());
        assertEquals(d.negate().multiply(n.negate()), zd.negate().multiply(zn.negate()).bigIntegerValue());
        assertEquals(d.multiply(n.negate()), zd.multiply(zn.negate()).bigIntegerValue());
        // check immutability
        assertEquals(d, zd.bigIntegerValue());
        assertEquals(n, zn.bigIntegerValue());
      }
    }
  }

  public void testConstants() {
    assertEquals(20, Mul.KAR_DEPTH);
  }
}
