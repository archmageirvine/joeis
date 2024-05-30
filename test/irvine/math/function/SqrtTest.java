package irvine.math.function;

import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SqrtTest extends TestCase {

  public void testSqrtCorrectness() {
    final Random r = new Random();
    for (int k = 0; k < 10000; ++k) {
      final int n = r.nextInt(Integer.MAX_VALUE);
      final String s = String.valueOf(n);
      assertEquals(s, (int) Math.sqrt(n), Functions.SQRT.i(n));
      assertEquals(s, (long) Math.sqrt(n), Functions.SQRT.l(n));
      assertEquals(s, (long) Math.sqrt(n), Functions.SQRT.z(n).longValueExact());
    }
    assertEquals(317, Functions.SQRT.i(101123));
    assertEquals(318, Functions.SQRT.i(101124));
  }
}
