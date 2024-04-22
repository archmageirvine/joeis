package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FibonacciTest extends TestCase {

  public void testFibonacci() {
    final Function1 f = new Fibonacci();
    assertEquals(Z.ZERO, f.z(0));
    assertEquals(Z.ONE, f.z(1));
    assertEquals(Z.ONE, f.z(-1));
    assertEquals(Z.NEG_ONE, f.z(-2));
    assertEquals(Z.TWO, f.z(-3));
    assertEquals(Z.THREE.negate(), f.z(-4));
    assertEquals(new Z("22334640661774067356412331900038009953045351020683823507202893507476314037053"), f.z(-367));
    Z a = Z.ONE;
    Z b = Z.ONE;
    for (int k = 2; k < 1000; ++k) {
      assertEquals(b, f.z(k));
      final Z c = b.add(a);
      a = b;
      b = c;
    }
  }

}
