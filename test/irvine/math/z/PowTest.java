package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PowTest extends TestCase {

  private static final Random RANDOM = new Random();


  public void testPowInt() {
    assertEquals(Z.ONE, Z.ZERO.pow(0));
    for (int i = -10; i < 10; ++i) {
      assertEquals(Z.ONE, Z.valueOf(i).pow(0));
    }
    Z q = Z.valueOf(30);
    for (int i = 0; i < 20; ++i) {
      assertEquals(Z.ONE, q.pow(0));
      q = q.shiftLeft(2);
    }
    assertEquals(Z.ZERO, Z.ZERO.pow(1));
    assertEquals(Z.ZERO, Z.ZERO.pow(-1));
    assertEquals(Z.ZERO, Z.ZERO.pow(10));
    assertEquals(Z.ZERO, Z.ZERO.pow(-10));
    assertEquals(Z.ZERO, Z.ZERO.pow(2));
    assertEquals(Z.ZERO, Z.ZERO.pow(200));
    assertEquals(Z.ZERO, Z.ZERO.pow(100000000));
    assertEquals(Z.ZERO, Z.ZERO.pow(0x7FFFFFFF));
    assertEquals(Z.ONE, Z.ONE.pow(1));
    assertEquals(Z.ONE, Z.ONE.pow(-1));
    assertEquals(Z.ONE, Z.ONE.pow(10));
    assertEquals(Z.ONE, Z.ONE.pow(-10));
    assertEquals(Z.ONE, Z.ONE.pow(2));
    assertEquals(Z.ONE, Z.ONE.pow(200));
    assertEquals(Z.ONE, Z.ONE.pow(100000000));
    assertEquals(Z.ONE, Z.ONE.pow(0x7FFFFFFF));
    final Z m = Z.NEG_ONE;
    assertEquals(m, m.pow(1));
    assertEquals(m, m.pow(-1));
    assertEquals(Z.ONE, m.pow(10));
    assertEquals(Z.ONE, m.pow(-10));
    assertEquals(Z.ONE, m.pow(2));
    assertEquals(m, m.pow(201));
    assertEquals(Z.ONE, m.pow(100000000));
    assertEquals(m, m.pow(0x7FFFFFFF));
    for (int i = -2; i < -10; --i) {
      try {
        Z.TWO.pow(i);
        fail();
      } catch (final ArithmeticException e) {
        // ok
      }
    }
    for (int i = 1; i < 100; i += 7) {
      assertEquals(Z.ONE.shiftLeft(i), Z.TWO.pow(i));
    }
    for (int j = 7; j < 250; j += 97) {
      final BigInteger n = new BigInteger(j, RANDOM);
      final Z zn = Z.valueOf(n);
      for (int i = 0; i < 10; ++i) {
        final int d = RANDOM.nextInt() & 0x3FF; // small to make test fast
        assertEquals(n + "^" + d, n.pow(d), zn.pow(d).bigIntegerValue());
      }
    }
  }

  public void test3() {
    assertEquals(new Z("50031545098999707"), Z.THREE.pow(35));
  }
}
