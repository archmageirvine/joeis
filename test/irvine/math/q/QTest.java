package irvine.math.q;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class QTest extends TestCase {

  public void testConstants() {
    assertEquals(Z.ZERO, Q.ZERO.num());
    assertEquals(Z.ONE, Q.ZERO.den());
    assertEquals(Z.ONE, Q.ONE.num());
    assertEquals(Z.ONE, Q.ONE.den());
    assertEquals(Z.TWO, Q.TWO.num());
    assertEquals(Z.ONE, Q.TWO.den());
    assertEquals(Z.ONE, Q.HALF.num());
    assertEquals(Z.TWO, Q.HALF.den());
    assertEquals(1, Q.ZERO.hashCode());
    assertEquals(3, Q.TWO.hashCode());
    assertEquals(0, Q.ZERO.signum());
    assertEquals(1, Q.ONE.signum());
    assertEquals(Q.ONE, Q.NEG_ONE.negate());
    assertEquals(Q.TWO, Q.HALF.reciprocal());
    assertEquals(Q.HALF, Q.TWO.reciprocal());
    assertTrue(Q.HALF.isProperFraction());
    assertFalse(Q.ONE.isProperFraction());
    assertEquals(Q.HALF, Q.HALF.abs());
    assertEquals(Q.HALF, Q.HALF.negate().abs());
    assertEquals(1.0, Q.ONE.doubleValue());
    assertEquals(0.5, Q.HALF.doubleValue());
    assertEquals("0", Q.ZERO.toString());
    assertEquals("1", Q.ONE.toString());
    assertEquals("1/2", Q.HALF.toString());
    assertEquals("-1/3", new Q(1, -3).toString());
    assertTrue(Q.HALF.equals(Q.HALF));
    assertTrue(Q.HALF.equals(new Q(1, 2)));
    assertFalse(Q.HALF.equals(null));
    assertFalse(Q.ONE.equals(Z.ONE));
  }

  public void test() {
    assertEquals(Q.ONE, new Q(Z.ONE));
    assertEquals(Q.ONE, new Q(Z.FOUR, Z.FOUR));
    assertEquals(Q.ONE, new Q(3, 3));
    assertEquals(Q.ONE, new Q(1));
    assertTrue(new Q(1, 5).compareTo(new Q(3, 4)) < 0);
    assertEquals(0, Q.TWO.compareTo(Q.TWO));
    assertEquals(0, Q.TWO.compareTo(new Q(4, 2)));
    assertTrue(new Q(3, 4).compareTo(Q.ONE_QUARTER) > 0);
    assertEquals(-1, Q.NEG_ONE.signum());
    try {
      new Q(1, 0);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testAdd() {
    final Q q = Q.ONE_QUARTER;
    assertEquals(Q.HALF, q.add(q));
    assertEquals(new Q(3, 2), Q.HALF.add(Z.ONE));
    assertEquals(new Q(3, 2), Q.HALF.add(1));
    assertEquals(new Q(3, 2), Q.HALF.signedAdd(true, Q.ONE));
    assertEquals(new Q(-1, 2), Q.HALF.signedAdd(false, Q.ONE));
    assertEquals(Q.ZERO, q.subtract(q));
    assertEquals(Q.ONE, Q.TWO.subtract(Q.ONE));
    assertEquals(Q.ONE, Q.TWO.subtract(Z.ONE));
    assertEquals(Q.ONE, Q.TWO.subtract(1));
  }

  public void testMultiply() {
    final Q q = Q.ONE_QUARTER;
    assertEquals(new Q(1, 16), q.multiply(q));
    assertEquals(new Q(1, 16), q.square());
    assertEquals(new Q(1, 16), q.pow(2));
    assertEquals(new Q(1, 64), q.pow(3));
    assertEquals(new Q(64), q.pow(-3));
    assertEquals(Q.HALF, q.multiply(2));
    assertEquals(Q.HALF, q.multiply(Z.TWO));
    assertEquals(Q.ONE, q.divide(q));
    assertEquals(new Q(1, 8), q.divide(2));
    assertEquals(new Q(1, 8), q.divide(Z.TWO));
    assertEquals(Q.ONE, q.pow(0));
    assertTrue(q == q.pow(1));
  }

  public void testDivideZero() {
    assertEquals(Q.ZERO, Q.ZERO.divide(2));
    assertEquals(Q.ZERO, Q.ZERO.divide(Z.TWO));
    assertEquals(Q.ZERO, Q.ZERO.divide(Q.TWO));
  }

  public void testRound() {
    assertEquals(64, new Q(127, 2).round().longValue());
  }
}

