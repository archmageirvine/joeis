package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GcdTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testGcd() {
    assertEquals(Z.ZERO, Gcd.gcd(Z.ZERO, Z.ZERO));
    assertEquals(Z.ONE, Gcd.gcd(Z.ZERO, Z.ONE));
    assertEquals(Z.ONE, Gcd.gcd(Z.ZERO, Z.NEG_ONE));
    assertEquals(Z.TWO, Gcd.gcd(Z.ZERO, Z.TWO));
    assertEquals(1, Z.ONE.getSize());
    assertEquals(1, Z.TWO.getSize());
    assertEquals(0, Z.ZERO.getSize());
    final Z z = new Z("3055957979589759023744081081055211716024853");
    assertEquals(new Z("2312934248578355654701"), z.gcd(new Z("2312934248578355654701")));

    for (int i = 30; i < 1000; i += 17) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final Z zd = Z.valueOf(d);
      final Z zdn = zd.negate();
      assertEquals(zd, zd.gcd(zd.square()));
      for (int j = 1; j < 1000; j += 137) {
        final BigInteger n = new BigInteger(j, RANDOM);
        final Z zn = Z.valueOf(n);
        final Z res = zd.gcd(zn);
        assertEquals(d + " gcd " + n, d.gcd(n), res.bigIntegerValue());
        assertEquals(res, Gcd.gcd(zn, zd));
        assertEquals(d.negate().gcd(n), Gcd.gcd(zdn, zn).bigIntegerValue());
        final Z znn = zn.negate();
        assertTrue(znn.signum() < 1);
        assertEquals(d.gcd(n.negate()).abs(), Gcd.gcd(zd, znn).abs().bigIntegerValue());
        // check immutability
        assertEquals(d, zd.bigIntegerValue());
        assertEquals(n, zn.bigIntegerValue());
        assertTrue(znn.signum() < 1);
        assertTrue(zdn.signum() < 1);
        assertTrue(zn.signum() >= 0);
        assertTrue(zd.signum() >= 0);
      }
    }
    final Z neg2 = Z.TWO.negate();
    assertEquals(Z.TWO, Gcd.gcd(neg2, neg2));
    assertEquals(-1, neg2.getSize());
    assertEquals(1, Z.TWO.getSize());
    assertEquals(Z.TWO, Gcd.gcd(Z.FOUR, neg2));
    assertEquals(1, Z.FOUR.getSize());
    assertEquals(-1, neg2.getSize());
    assertEquals(Z.TWO, Gcd.gcd(neg2, Z.FOUR));
    assertEquals(-1, neg2.getSize());
    assertEquals(1, Z.FOUR.getSize());
    final Z zz = Z.valueOf(Z.BASE + 2);
    assertEquals(Z.TWO, Gcd.gcd(zz, Z.TWO));
    assertEquals(2, zz.getSize());
    assertEquals(1, Z.TWO.getSize());
    assertEquals(Z.TWO, Gcd.gcd(Z.TWO, zz));
    assertEquals(2, zz.getSize());
    assertEquals(1, Z.TWO.getSize());
  }
}
