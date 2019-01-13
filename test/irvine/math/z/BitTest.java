package irvine.math.z;

import java.math.BigInteger;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BitTest extends TestCase {

  public void testBitLength() {
    assertEquals(0, Z.ZERO.bitLength());
    assertEquals(1, Z.ONE.bitLength());
    assertEquals(2, Z.TWO.bitLength());
    assertEquals(4, Z.valueOf(15L).bitLength());
    assertEquals(5, Z.valueOf(17L).bitLength());
    assertEquals(5, Z.valueOf(18L).bitLength());
    assertEquals(5, Z.valueOf(19L).bitLength());
    assertEquals(5, Z.valueOf(20L).bitLength());
    assertEquals(5, Z.valueOf(21L).bitLength());
    assertEquals(5, Z.valueOf(22L).bitLength());
    assertEquals(5, Z.valueOf(23L).bitLength());
    assertEquals(5, Z.valueOf(24L).bitLength());
    assertEquals(5, Z.valueOf(25L).bitLength());
    assertEquals(5, Z.valueOf(26L).bitLength());
    assertEquals(5, Z.valueOf(27L).bitLength());
    assertEquals(5, Z.valueOf(28L).bitLength());
    assertEquals(5, Z.valueOf(29L).bitLength());
    assertEquals(5, Z.valueOf(30L).bitLength());
    assertEquals(5, Z.valueOf(31L).bitLength());
    Z z = Z.ONE;
    for (int i = 1; i < 100; ++i) {
      assertEquals(i, z.bitLength());
      z = z.add(z);
    }
    z = Z.ONE;
    for (int i = 1; i < 100; ++i) {
      assertEquals(i, z.negate().bitLength());
      z = z.add(z);
    }
    for (int i = 1; i < 2000; i += 17) {
      final BigInteger v = new BigInteger(i, AddTest.RANDOM);
      assertEquals(v.bitLength(), Z.valueOf(v).bitLength());
    }
  }

  public void testBitCount() {
    assertEquals(0, Z.ZERO.bitCount());
    assertEquals(1, Z.ONE.bitCount());
    assertEquals(1, Z.TWO.bitCount());
    for (long i = -100L; i < 100L; ++i) {
      assertEquals(String.valueOf(i), BigInteger.valueOf(i).bitCount(), Z.valueOf(i).bitCount());
    }
    assertEquals(31, Z.valueOf(~0x7FFFFFFFL).bitCount());
    assertEquals(30, Z.valueOf(~0x3FFFFFFFL).bitCount());
    assertEquals(24, Z.valueOf(~0xFFFFFFL).bitCount());
    assertEquals(16, Z.valueOf(~0xFFFFL).bitCount());
    assertEquals(8, Z.valueOf(~0xFFL).bitCount());

    for (int i = 2; i < 2000; ++i) {
      final BigInteger v = new BigInteger(i, AddTest.RANDOM);
      final Z z = Z.valueOf(v);
      assertEquals(String.valueOf(v), v.bitCount(), z.bitCount());
      assertEquals(v.negate().bitCount(), z.negate().bitCount());
      assertEquals(v, z.bigIntegerValue());
    }
  }

  public void testGetLowestSetBit() {
    assertEquals(-1, Z.ZERO.getLowestSetBit());
    assertEquals(0, Z.ONE.getLowestSetBit());
    assertEquals(1, Z.TWO.getLowestSetBit());
    for (int i = 30; i < 1000; i += 17) {
      final BigInteger d = new BigInteger(i, AddTest.RANDOM);
      final Z zd = Z.valueOf(d);
      assertEquals(d.getLowestSetBit(), zd.getLowestSetBit());
      assertEquals(d.negate().getLowestSetBit(), zd.negate().getLowestSetBit());
    }
    BigInteger v = BigInteger.ONE;
    for (int i = 1; i < 100; ++i) {
      v = v.shiftLeft(1);
      final Z z = Z.valueOf(v);
      assertEquals(v.getLowestSetBit(), z.getLowestSetBit());
      assertEquals(v.negate().getLowestSetBit(), z.negate().getLowestSetBit());
    }
  }

  public void testMakeOdd() {
    assertTrue(Z.ZERO == Z.ZERO.makeOdd());
    assertEquals(-1L, Z.ZERO.auxiliary());
    Z.TWO.makeOdd();
    assertEquals(1, Z.TWO.auxiliary());
    final Z zz = Z.valueOf(84);
    assertEquals(21, zz.makeOdd().intValue());
    assertEquals(2, zz.auxiliary());
    Z n = Z.ONE;
    for (int i = 0; i < 100; ++i, n = n.shiftLeft(1)) {
      if (i != 0) {
        final Z q = n.makeOdd();
        assertTrue(n != q);
        assertTrue((q.intValue() & 1) == 1);
      } else {
        assertTrue(n == n.makeOdd());
      }
      assertEquals(n.toString(), i, n.auxiliary());
      if (i != 0) {
        final Z nn = n.add(1L);
        final Z q = nn.makeOdd();
        assertTrue(nn == q);
        assertEquals(0L, nn.auxiliary());
      }
      if (i != 0) {
        final Z nn = n.negate();
        final Z q = nn.makeOdd();
        assertTrue(nn != q);
        assertEquals(i, nn.auxiliary());
      }
    }
  }

}
