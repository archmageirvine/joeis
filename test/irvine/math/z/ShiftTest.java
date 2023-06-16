package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ShiftTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testShiftLeft() {
    for (int i = -10; i < 100; ++i) {
      assertTrue(Z.ZERO == Z.ZERO.shiftLeft(i));
    }
    for (int i = 2; i < 200; i += 3) {
      final BigInteger d = new BigInteger(i, RANDOM);
      final BigInteger dd = d.negate();
      Z zd = Z.valueOf(d);
      for (int j = -10; j < 100; ++j) {
        assertEquals(String.valueOf(j), d.shiftLeft(j), zd.shiftLeft(j).bigIntegerValue());
      }
      zd = zd.negate();
      for (int j = -10; j < 0; ++j) {
        assertEquals(dd + "<<" + j, d.shiftLeft(j).negate(), zd.shiftLeft(j).bigIntegerValue());
      }
      for (int j = 0; j < 40; ++j) {
        assertEquals(dd + "<<" + j, dd.shiftLeft(j), zd.shiftLeft(j).bigIntegerValue());
      }
    }
  }

  public void testShiftRight() {
    for (int i = -10; i < 100; ++i) {
      assertTrue(Z.ZERO == Z.ZERO.shiftRight(i));
    }
    assertEquals(Z.ZERO, Z.valueOf(7L).shiftRight(4));
    assertEquals(Z.ZERO, Z.valueOf(7L).shiftRight(3));
    assertEquals(Z.ONE, Z.valueOf(7L).shiftRight(2));
    for (int i = 2; i < 200; i += 3) {
      final BigInteger d = new BigInteger(i, RANDOM);
      Z zd = Z.valueOf(d);
      for (int j = -10; j < 100; ++j) {
        assertEquals(String.valueOf(j), d.shiftRight(j), zd.shiftRight(j).bigIntegerValue());
      }
      final BigInteger dd = d.negate();
      zd = zd.negate();
      for (int j = -10; j < 40; ++j) {
        assertEquals(dd + ">>" + j, d.shiftRight(j).negate(), zd.shiftRight(j).bigIntegerValue());
      }
    }
  }

  public void testBoundaryRight() {
    assertEquals(Z.ZERO, Z.valueOf(Z.BASE).shiftRight(33));
    assertEquals(Z.valueOf(1024), Z.valueOf(Z.BASE).shiftLeft(Z.BASE_BITS - 2).shiftRight(48));
  }
}
