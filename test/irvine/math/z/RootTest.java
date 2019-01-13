package irvine.math.z;

import java.math.BigInteger;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RootTest extends TestCase {

  private static final Random RANDOM = new Random();

  public void testRoot() {
    try {
      Z.ONE.root(0);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Attempt to take zeroth root.", e.getMessage());
    }
    try {
      Z.TWO.negate().root(2);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Attempt to take even root of negative number.", e.getMessage());
    }
    try {
      Z.TWO.negate().root(-2);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.root(0);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.TWO.negate().root(0);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ZERO.root(0);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Z.ZERO.root(-2);
      fail();
    } catch (final ArithmeticException e) {
      assertEquals("Attempt to take negative root of zero.", e.getMessage());
    }
    try {
      Z.ZERO.root(-2000);
      fail();
    } catch (final ArithmeticException e) {
      // ok
    }
    final Z zz = new Z("8774400585720811290675201");
    assertEquals(4, zz.root(36).intValue());
    assertEquals(0, zz.root(-36).intValue());
    assertEquals(0, zz.root(-360000).intValue());
    assertEquals(0, zz.root(-360001).intValue());
    assertEquals(1, zz.auxiliary());
    assertEquals(Z.TWO, Z.valueOf(32).root(5));
    assertEquals(Z.NEG_ONE, Z.NEG_ONE.root(3));
    for (int i = 0; i < 10; ++i) {
      assertEquals(Z.ONE, Z.ONE.root(RANDOM.nextInt(100000) + 1));
      assertEquals(1, Z.ONE.auxiliary());
    }
    for (int i = 0; i < 100; ++i) {
      final long l = RANDOM.nextLong();
      if (l >= 0) {
        final Z z = Z.valueOf(l);
        Z y = z.multiply(z);
        assertEquals(z, y.root(2));
        assertEquals(1, y.auxiliary());
        y = y.multiply(z);
        assertEquals(z, y.root(3));
        assertEquals(1, y.auxiliary());
        y = y.multiply(z);
        assertEquals(z, y.root(4));
        assertEquals(1, y.auxiliary());
        y = y.multiply(z);
        assertEquals(z, y.root(5));
        assertEquals(1, y.auxiliary());
        y = y.multiply(z);
        assertEquals(z, y.root(6));
        assertEquals(1, y.auxiliary());
        y = y.multiply(z);
        assertEquals(z, y.root(7));
        assertEquals(1, y.auxiliary());
      }
    }
    for (int i = 20; i < 1000; i += 17) {
      final int n = RANDOM.nextInt(1000) + 1;
      final Z z = Z.valueOf(new BigInteger(i, RANDOM));
      final Z y = z.root(n);
      if (z.auxiliary() == 1) {
        assertEquals(z, y.pow(n));
      } else if (Z.ONE.equals(y)) {
        assertEquals(0, z.auxiliary());
        assertTrue(Z.ONE.shiftLeft(n).compareTo(z) >= 0);
      } else {
        assertEquals(0, z.auxiliary());
        assertTrue(y.compareTo(z) <= 0);
        assertTrue(y.pow(n).compareTo(z) <= 0);
      }
    }
  }

  public void testRoot1() {
    Z.TWO.mAuxiliary = 0;
    assertEquals(Z.TWO, Root.root(Z.TWO, 1));
    assertEquals(1, Z.TWO.auxiliary());
  }

  public void testRootNeg() {
    assertEquals(Z.THREE.negate(), Root.root(Z.valueOf(27).negate(), 3));
  }
}
