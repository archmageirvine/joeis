package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ZStringTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testToString() {
    assertEquals("0", Z.ZERO.toString());
    assertEquals("1", Z.ONE.toString());
    assertEquals("-1", Z.NEG_ONE.toString());
    assertEquals("2", Z.TWO.toString());
    assertEquals("-2", Z.TWO.negate().toString());
    assertEquals("101002716748738111", new Z("101002716748738111").toString());
    assertEquals("101002716748738111", new Z("101002716748738111").toString(10));
    assertEquals("221a763a6932a569a", new Z("101002716748738111").toString(11));
    assertEquals("-101002716748738111", new Z("101002716748738111").negate().toString());
    assertEquals("1321402112002400134104421", new Z("101002716748738111").toString(5));
    assertEquals("rmih3ijbygv", new Z("101002716748738111").toString(36));
    assertEquals("11111", Z.FIVE.toString(1));
    assertEquals("-11111", Z.FIVE.negate().toString(1));
    for (int i = 30; i < 1000; ++i) {
      BigInteger n = new BigInteger(i, RANDOM);
      if (RANDOM.nextBoolean()) {
        n = n.negate();
      }
      final Z zn = Z.valueOf(n);
      assertEquals(n.toString(), n.toString(), zn.toString());
    }
  }

  public void testPowersOfTen() {
    final StringBuilder sb = new StringBuilder("1");
    for (int k = 0; k < 20; ++k) {
      final String s = sb.toString();
      assertEquals(s, new Z(s).toString());
      sb.append('0');
    }
  }

  public void stringBase(final int base) {
    assertEquals("0", Z.ZERO.toString(base));
    assertEquals("1", Z.ONE.toString(base));
    assertEquals("-1", Z.NEG_ONE.toString(base));
    if (base > 2) {
      assertEquals("2", Z.TWO.toString(base));
      assertEquals("-2", Z.TWO.negate().toString(base));
    }
    for (int i = 30; i < 1000; i += 7) {
      BigInteger n = new BigInteger(i, RANDOM);
      if (RANDOM.nextBoolean()) {
        n = n.negate();
      }
      final Z zn = Z.valueOf(n);
      assertEquals(n.toString(base), n.toString(base), zn.toString(base));
    }
  }

  public void testToStringBase() {
    try {
      Z.TWO.toString(0);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Base must be at least 1", e.getMessage());
    }
    try {
      Z.TWO.toString(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      Z.TWO.toString(37);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Base must be at most 36", e.getMessage());
    }
    stringBase(2);
    stringBase(3);
    stringBase(4);
    stringBase(5);
    stringBase(6);
    stringBase(7);
    stringBase(8);
    stringBase(15);
    stringBase(16);
    stringBase(17);
    stringBase(35);
    stringBase(36);
  }

}
