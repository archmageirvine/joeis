package irvine.math.function;

import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GreatestCommonDivisorTest extends TestCase {

  public void testGcd() {
    assertEquals(0, Functions.GCD.l(0, 0));
    assertEquals(42, Functions.GCD.l(0, 42));
    assertEquals(42, Functions.GCD.l(42, 0));
    assertEquals(1, Functions.GCD.l(2, 3));
    assertEquals(4, Functions.GCD.l(4, 8));
    assertEquals(12, Functions.GCD.l(12 * 7, 12 * 11));
    final Random r = new Random();
    for (int k = 1; k < 100; ++k) {
      final long a = r.nextLong();
      final long b = r.nextLong();
      assertEquals(a, Functions.GCD.l(a, a));
      final long g = Functions.GCD.l(a, b);
      assertEquals(0, a % g);
      assertEquals(0, b % g);
    }
  }
}
