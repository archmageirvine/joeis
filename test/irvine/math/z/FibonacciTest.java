package irvine.math.z;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FibonacciTest extends TestCase {

  public void testFibonacci() {
    Z a = Z.ONE;
    Z b = Z.ONE;
    assertEquals(Z.ZERO, Fibonacci.fibonacci(0));
    assertEquals(Z.ONE, Fibonacci.fibonacci(1));
    assertEquals(Z.ONE, Fibonacci.fibonacci(-1));
    assertEquals(Z.NEG_ONE, Fibonacci.fibonacci(-2));
    assertEquals(Z.TWO, Fibonacci.fibonacci(-3));
    assertEquals(Z.THREE.negate(), Fibonacci.fibonacci(-4));
    assertEquals(new Z("22334640661774067356412331900038009953045351020683823507202893507476314037053"), Fibonacci.fibonacci(-367));
    for (int i = 2; i < 1000; ++i) {
      assertEquals(b, Fibonacci.fibonacci(i));
      final Z c = b.add(a);
      a = b;
      b = c;
    }
  }

  public void testLucas() {
    Z a = Z.ONE;
    Z b = Z.THREE;
    assertEquals(Z.TWO, Fibonacci.lucas(0));
    assertEquals(Z.ONE, Fibonacci.lucas(1));
    assertEquals(new Z("-49941774772757703300470707773688236620346480720862218592914831305649185180429"), Fibonacci.lucas(-367));
    assertEquals(new Z("80807489040814020041266183636939143192786617912140668064464649421515377682847"), Fibonacci.lucas(-368));
    for (int i = 2; i < 1000; ++i) {
      assertEquals(b, Fibonacci.lucas(i));
      final Z c = b.add(a);
      a = b;
      b = c;
    }
  }

  public void testInverseFibonacci() {
    try {
      Fibonacci.inverseFibonacci(Z.NEG_ONE);
      fail("Exception did not fire");
    } catch (final ArithmeticException e) {
      // ok
    }

    for (int i = 0; i < 1000; ++i) {
      if (i != 2) {
        assertEquals(i, Fibonacci.inverseFibonacci(Fibonacci.fibonacci(i)));
      }
    }
    for (int i = 5; i < 1000; ++i) {
      final int j = -Fibonacci.inverseFibonacci(Fibonacci.fibonacci(i).subtract(Z.ONE));
      if (i != j && i - 1 != j && i != j - 1) {
        fail("Estimate is off the mark by more than 1: " + i + " " + j);
      }
    }
    assertEquals(-4, Fibonacci.inverseFibonacci(Z.FOUR));
    assertEquals(-5, Fibonacci.inverseFibonacci(Z.SIX));
    assertEquals(-5, Fibonacci.inverseFibonacci(Z.SEVEN));
    assertEquals(-367, Fibonacci.inverseFibonacci(new Z("22334640661774067356412331900038009953045351020683823507202893507476314037054")));
    assertEquals(-366, Fibonacci.inverseFibonacci(new Z("22334640661774067356412331900038009953045351020683823507202893507476314037052")));
    assertEquals(5000, Fibonacci.inverseFibonacci(Fibonacci.fibonacci(5000)));
    assertEquals(10000, Fibonacci.inverseFibonacci(Fibonacci.fibonacci(10000)));
    assertEquals(50000, Fibonacci.inverseFibonacci(Fibonacci.fibonacci(50000)));
  }

  public void testInverseLucas() {
    try {
      Fibonacci.inverseLucas(Z.NEG_ONE);
      fail("Exception did not fire");
    } catch (final ArithmeticException e) {
      // ok
    }
    try {
      Fibonacci.inverseLucas(Z.ZERO);
      fail("Exception did not fire");
    } catch (final ArithmeticException e) {
      // ok
    }

    for (int i = 0; i < 1000; ++i) {
      if (i != 2) {
        assertEquals(i, Fibonacci.inverseLucas(Fibonacci.lucas(i)));
      }
    }
    for (int i = 5; i < 1000; ++i) {
      final int j = -Fibonacci.inverseLucas(Fibonacci.lucas(i).subtract(Z.ONE));
      if (i != j && i - 1 != j && i != j - 1) {
        fail("Estimate is off the mark by more than 1: " + i + " " + j);
      }
    }

    assertEquals(-3, Fibonacci.inverseLucas(Z.FIVE));
    assertEquals(-3, Fibonacci.inverseLucas(Z.SIX));
    assertEquals(-367, Fibonacci.inverseLucas(new Z("49941774772757703300470707773688236620346480720862218592914831305649185180430")));
    assertEquals(-366, Fibonacci.inverseLucas(new Z("49941774772757703300470707773688236620346480720862218592914831305649185180428")));
    assertEquals(5000, Fibonacci.inverseLucas(Fibonacci.lucas(5000)));
    assertEquals(10000, Fibonacci.inverseLucas(Fibonacci.lucas(10000)));
    assertEquals(50000, Fibonacci.inverseLucas(Fibonacci.lucas(50000)));
  }
}
