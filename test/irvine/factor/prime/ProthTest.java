package irvine.factor.prime;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the Proth primality prover.
 *
 * @author Sean A. Irvine
 */
public class ProthTest extends TestCase {

  private static final Z[] B50 = {
    new Z("459367161991790593"),
    new Z("393050634124102232869567034555427371542904833"),
  };

  // test Proth against the Cullen numbers, prime for 1, 141, 4713
  public void testCullen() {
    final Proth proth = new Proth();
    for (int i = 1; i < 200; ++i) {
      // n = i*2^i+1
      final Z n = Z.valueOf(i).shiftLeft(i).setBit(0);
      if (i != 141 && i != 1) {
        assertTrue(String.valueOf(n), !proth.isPrime(n));
      } else {
        assertTrue(String.valueOf(n), proth.isPrime(n));
      }
    }
    assertTrue("4713", proth.isPrime(Z.valueOf(4713).shiftLeft(4713).setBit(0)));
  }

  public void test50bitPrimes() {
    final Proth proth = new Proth();
    for (final Z b : B50) {
      try {
        assertTrue(String.valueOf(b), proth.isPrime(b));
      } catch (final ArithmeticException e) {
        // ok
      }
    }
  }

}
