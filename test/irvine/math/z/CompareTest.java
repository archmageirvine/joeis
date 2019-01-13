package irvine.math.z;

import junit.framework.TestCase;

import java.math.BigInteger;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CompareTest extends TestCase {

  public void testEquals() {
    assertFalse(Z.ZERO == null);
    assertFalse(Z.ZERO.equals(new Object()));
    assertFalse(Z.ZERO.equals(Z.ONE));
    assertFalse(Z.ZERO.equals(Z.TWO));
    assertFalse(Z.ONE.equals(Z.TWO));
    assertTrue(Z.ZERO.equals(Z.ZERO));
    assertTrue(Z.ONE.equals(Z.ONE));
    assertTrue(Z.TWO.equals(Z.TWO));
    assertTrue(Z.ZERO.equals(Z.valueOf(0L)));
    assertTrue(Z.ONE.equals(Z.valueOf(1L)));
    assertTrue(Z.TWO.equals(Z.valueOf(2L)));
    assertTrue(Z.THREE.equals(Z.valueOf(3L)));
    assertTrue(Z.FOUR.equals(Z.valueOf(4L)));
    for (int i = 3; i < 2000; ++i) {
      final BigInteger v = new BigInteger(i, AddTest.RANDOM);
      if (v.equals(BigInteger.ZERO)) {
        continue;
      }
      final Z z = Z.valueOf(v);
      final Z y = Z.valueOf(v.negate());
      final Z x = Z.valueOf(v.add(BigInteger.ONE));
      assertTrue(z.equals(z));
      assertFalse(z.equals(y));
      assertFalse(y.equals(z));
      assertFalse(x.equals(z));
      assertFalse(z.equals(x));
      assertFalse(y.equals(z));
      assertFalse(z.equals(y));
    }
  }

  public void testCompareToZ() {
    try {
      Z.ZERO.compareTo(null);
      fail("Accepted null");
    } catch (final NullPointerException e) {
      // ok
    }
    assertEquals(0, Z.ZERO.compareTo(Z.ZERO));
    assertEquals(-1, Z.ZERO.compareTo(Z.ONE));
    assertEquals(1, Z.ONE.compareTo(Z.ZERO));
    assertEquals(1, Z.ZERO.compareTo(Z.NEG_ONE));
    for (int i = 30; i < 1000; i += 3) {
      final Z z = Z.valueOf(new BigInteger(i, AddTest.RANDOM));
      assertEquals(0, z.compareTo(z));
      assertEquals(0, z.compareTo(z.add(Z.ONE).subtract(Z.ONE))); // make sure different reference
      assertEquals(-1, z.compareTo(z.add(Z.ONE)));
      assertEquals(1, z.negate().compareTo(z.add(Z.ONE).negate()));
      assertEquals(1, z.compareTo(z.subtract(Z.ONE)));
      assertEquals(-1, z.negate().compareTo(z.subtract(Z.ONE).negate()));
    }
  }

}
