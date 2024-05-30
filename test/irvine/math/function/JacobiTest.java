package irvine.math.function;

import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class JacobiTest extends TestCase {

  public void testJacobi1() {
    final Random r = new Random();
    // check error on second argument even
    for (int i = 0; i < 100; i += 2) {
      try {
        Functions.JACOBI.i(r.nextLong(), i);
        fail("Expected exception did not occur");
      } catch (final ArithmeticException e) {
        // ok
      }
    }
    // check for +1, 0, -1 on random arguments
    for (int i = 0; i < 100; ++i) {
      final long t = Functions.JACOBI.i(r.nextLong(), r.nextLong() | 1L);
      if (t < -1 || t > 1) {
        fail("Jacobi symbols was not -1, 0, +1");
      }
    }
  }

  public void testJacobi2() {
    assertEquals(0, Functions.JACOBI.i(-10, 5));
    assertEquals(1, Functions.JACOBI.i(-10, 7));
    assertEquals(1, Functions.JACOBI.i(-10, 9));
    assertEquals(1, Functions.JACOBI.i(-10, 11));
    assertEquals(1, Functions.JACOBI.i(-10, 13));
    assertEquals(0, Functions.JACOBI.i(-10, 15));
    assertEquals(0, Functions.JACOBI.i(-9, 3));
    assertEquals(1, Functions.JACOBI.i(-9, 5));
    assertEquals(-1, Functions.JACOBI.i(-9, 7));
    assertEquals(0, Functions.JACOBI.i(-9, 9));
    assertEquals(-1, Functions.JACOBI.i(-9, 11));
    assertEquals(1, Functions.JACOBI.i(-9, 13));
    assertEquals(0, Functions.JACOBI.i(-9, 15));
    assertEquals(1, Functions.JACOBI.i(-8, 3));
    assertEquals(-1, Functions.JACOBI.i(-8, 5));
    assertEquals(-1, Functions.JACOBI.i(-8, 7));
    assertEquals(1, Functions.JACOBI.i(-8, 9));
    assertEquals(1, Functions.JACOBI.i(-8, 11));
    assertEquals(-1, Functions.JACOBI.i(-8, 13));
    assertEquals(-1, Functions.JACOBI.i(-8, 15));
    assertEquals(-1, Functions.JACOBI.i(-7, 3));
    assertEquals(-1, Functions.JACOBI.i(-7, 5));
    assertEquals(0, Functions.JACOBI.i(-7, 7));
    assertEquals(1, Functions.JACOBI.i(-7, 9));
    assertEquals(1, Functions.JACOBI.i(-7, 11));
    assertEquals(-1, Functions.JACOBI.i(-7, 13));
    assertEquals(1, Functions.JACOBI.i(-7, 15));
    assertEquals(0, Functions.JACOBI.i(-6, 3));
    assertEquals(1, Functions.JACOBI.i(-6, 5));
    assertEquals(1, Functions.JACOBI.i(-6, 7));
    assertEquals(0, Functions.JACOBI.i(-6, 9));
    assertEquals(1, Functions.JACOBI.i(-6, 11));
    assertEquals(-1, Functions.JACOBI.i(-6, 13));
    assertEquals(0, Functions.JACOBI.i(-6, 15));
    assertEquals(1, Functions.JACOBI.i(-5, 3));
    assertEquals(0, Functions.JACOBI.i(-5, 5));
    assertEquals(1, Functions.JACOBI.i(-5, 7));
    assertEquals(1, Functions.JACOBI.i(-5, 9));
    assertEquals(-1, Functions.JACOBI.i(-5, 11));
    assertEquals(-1, Functions.JACOBI.i(-5, 13));
    assertEquals(0, Functions.JACOBI.i(-5, 15));
    assertEquals(-1, Functions.JACOBI.i(-4, 3));
    assertEquals(1, Functions.JACOBI.i(-4, 5));
    assertEquals(-1, Functions.JACOBI.i(-4, 7));
    assertEquals(1, Functions.JACOBI.i(-4, 9));
    assertEquals(-1, Functions.JACOBI.i(-4, 11));
    assertEquals(1, Functions.JACOBI.i(-4, 13));
    assertEquals(-1, Functions.JACOBI.i(-4, 15));
    assertEquals(0, Functions.JACOBI.i(-3, 3));
    assertEquals(-1, Functions.JACOBI.i(-3, 5));
    assertEquals(1, Functions.JACOBI.i(-3, 7));
    assertEquals(0, Functions.JACOBI.i(-3, 9));
    assertEquals(-1, Functions.JACOBI.i(-3, 11));
    assertEquals(1, Functions.JACOBI.i(-3, 13));
    assertEquals(0, Functions.JACOBI.i(-3, 15));
    assertEquals(1, Functions.JACOBI.i(-2, 3));
    assertEquals(-1, Functions.JACOBI.i(-2, 5));
    assertEquals(-1, Functions.JACOBI.i(-2, 7));
    assertEquals(1, Functions.JACOBI.i(-2, 9));
    assertEquals(1, Functions.JACOBI.i(-2, 11));
    assertEquals(-1, Functions.JACOBI.i(-2, 13));
    assertEquals(-1, Functions.JACOBI.i(-2, 15));
    assertEquals(-1, Functions.JACOBI.i(-1, 3));
    assertEquals(1, Functions.JACOBI.i(-1, 5));
    assertEquals(-1, Functions.JACOBI.i(-1, 7));
    assertEquals(1, Functions.JACOBI.i(-1, 9));
    assertEquals(-1, Functions.JACOBI.i(-1, 11));
    assertEquals(1, Functions.JACOBI.i(-1, 13));
    assertEquals(-1, Functions.JACOBI.i(-1, 15));
    assertEquals(0, Functions.JACOBI.i(0, 3));
    assertEquals(0, Functions.JACOBI.i(0, 5));
    assertEquals(0, Functions.JACOBI.i(0, 7));
    assertEquals(0, Functions.JACOBI.i(0, 9));
    assertEquals(0, Functions.JACOBI.i(0, 11));
    assertEquals(0, Functions.JACOBI.i(0, 13));
    assertEquals(0, Functions.JACOBI.i(0, 15));
    assertEquals(1, Functions.JACOBI.i(1, 3));
    assertEquals(1, Functions.JACOBI.i(1, 5));
    assertEquals(1, Functions.JACOBI.i(1, 7));
    assertEquals(1, Functions.JACOBI.i(1, 9));
    assertEquals(1, Functions.JACOBI.i(1, 11));
    assertEquals(1, Functions.JACOBI.i(1, 13));
    assertEquals(1, Functions.JACOBI.i(1, 15));
    assertEquals(-1, Functions.JACOBI.i(2, 3));
    assertEquals(-1, Functions.JACOBI.i(2, 5));
    assertEquals(1, Functions.JACOBI.i(2, 7));
    assertEquals(1, Functions.JACOBI.i(2, 9));
    assertEquals(-1, Functions.JACOBI.i(2, 11));
    assertEquals(-1, Functions.JACOBI.i(2, 13));
    assertEquals(1, Functions.JACOBI.i(2, 15));
    assertEquals(0, Functions.JACOBI.i(3, 3));
    assertEquals(-1, Functions.JACOBI.i(3, 5));
    assertEquals(-1, Functions.JACOBI.i(3, 7));
    assertEquals(0, Functions.JACOBI.i(3, 9));
    assertEquals(1, Functions.JACOBI.i(3, 11));
    assertEquals(1, Functions.JACOBI.i(3, 13));
    assertEquals(0, Functions.JACOBI.i(3, 15));
    assertEquals(1, Functions.JACOBI.i(4, 3));
    assertEquals(1, Functions.JACOBI.i(4, 5));
    assertEquals(1, Functions.JACOBI.i(4, 7));
    assertEquals(1, Functions.JACOBI.i(4, 9));
    assertEquals(1, Functions.JACOBI.i(4, 11));
    assertEquals(1, Functions.JACOBI.i(4, 13));
    assertEquals(1, Functions.JACOBI.i(4, 15));
    assertEquals(-1, Functions.JACOBI.i(5, 3));
    assertEquals(0, Functions.JACOBI.i(5, 5));
    assertEquals(-1, Functions.JACOBI.i(5, 7));
    assertEquals(1, Functions.JACOBI.i(5, 9));
    assertEquals(1, Functions.JACOBI.i(5, 11));
    assertEquals(-1, Functions.JACOBI.i(5, 13));
    assertEquals(0, Functions.JACOBI.i(5, 15));
    assertEquals(0, Functions.JACOBI.i(6, 3));
    assertEquals(1, Functions.JACOBI.i(6, 5));
    assertEquals(-1, Functions.JACOBI.i(6, 7));
    assertEquals(0, Functions.JACOBI.i(6, 9));
    assertEquals(-1, Functions.JACOBI.i(6, 11));
    assertEquals(-1, Functions.JACOBI.i(6, 13));
    assertEquals(0, Functions.JACOBI.i(6, 15));
    assertEquals(1, Functions.JACOBI.i(7, 3));
    assertEquals(-1, Functions.JACOBI.i(7, 5));
    assertEquals(0, Functions.JACOBI.i(7, 7));
    assertEquals(1, Functions.JACOBI.i(7, 9));
    assertEquals(-1, Functions.JACOBI.i(7, 11));
    assertEquals(-1, Functions.JACOBI.i(7, 13));
    assertEquals(-1, Functions.JACOBI.i(7, 15));
    assertEquals(-1, Functions.JACOBI.i(8, 3));
    assertEquals(-1, Functions.JACOBI.i(8, 5));
    assertEquals(1, Functions.JACOBI.i(8, 7));
    assertEquals(1, Functions.JACOBI.i(8, 9));
    assertEquals(-1, Functions.JACOBI.i(8, 11));
    assertEquals(-1, Functions.JACOBI.i(8, 13));
    assertEquals(1, Functions.JACOBI.i(8, 15));
    assertEquals(0, Functions.JACOBI.i(9, 3));
    assertEquals(1, Functions.JACOBI.i(9, 5));
    assertEquals(1, Functions.JACOBI.i(9, 7));
    assertEquals(0, Functions.JACOBI.i(9, 9));
    assertEquals(1, Functions.JACOBI.i(9, 11));
    assertEquals(1, Functions.JACOBI.i(9, 13));
    assertEquals(0, Functions.JACOBI.i(9, 15));
    assertEquals(1, Functions.JACOBI.i(10, 3));
    assertEquals(0, Functions.JACOBI.i(10, 5));
    assertEquals(-1, Functions.JACOBI.i(10, 7));
    assertEquals(1, Functions.JACOBI.i(10, 9));
    assertEquals(-1, Functions.JACOBI.i(10, 11));
    assertEquals(1, Functions.JACOBI.i(10, 13));
    assertEquals(0, Functions.JACOBI.i(10, 15));
  }
}
