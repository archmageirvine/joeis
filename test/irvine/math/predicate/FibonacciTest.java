package irvine.math.predicate;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FibonacciTest extends TestCase {

  public void testInverseFibonacci() {
    try {
      Fibonacci.inverseFibonacci(Z.NEG_ONE);
      fail("Exception did not fire");
    } catch (final ArithmeticException e) {
      // ok
    }

    for (int i = 0; i < 1000; ++i) {
      if (i != 2) {
        assertEquals(i, Fibonacci.inverseFibonacci(Functions.FIBONACCI.z(i)));
      }
    }
    for (int i = 5; i < 1000; ++i) {
      final int j = -Fibonacci.inverseFibonacci(Functions.FIBONACCI.z(i).subtract(Z.ONE));
      if (i != j && i - 1 != j && i != j - 1) {
        fail("Estimate is off the mark by more than 1: " + i + " " + j);
      }
    }
    assertEquals(-4, Fibonacci.inverseFibonacci(Z.FOUR));
    assertEquals(-5, Fibonacci.inverseFibonacci(Z.SIX));
    assertEquals(-5, Fibonacci.inverseFibonacci(Z.SEVEN));
    assertEquals(-367, Fibonacci.inverseFibonacci(new Z("22334640661774067356412331900038009953045351020683823507202893507476314037054")));
    assertEquals(-366, Fibonacci.inverseFibonacci(new Z("22334640661774067356412331900038009953045351020683823507202893507476314037052")));
    assertEquals(5000, Fibonacci.inverseFibonacci(Functions.FIBONACCI.z(5000)));
    assertEquals(10000, Fibonacci.inverseFibonacci(Functions.FIBONACCI.z(10000)));
    assertEquals(50000, Fibonacci.inverseFibonacci(Functions.FIBONACCI.z(50000)));
  }

  public void testIs() {
    final Predicate p = new Fibonacci();
    assertTrue(p.is(0));
    assertTrue(p.is(1));
    assertTrue(p.is(2));
    assertTrue(p.is(3));
    assertFalse(p.is(4));
    assertTrue(p.is(5));
    assertFalse(p.is(6));
    assertTrue(p.is(Functions.FIBONACCI.z(200)));
    assertTrue(p.is(Functions.FIBONACCI.z(201)));
  }
}
