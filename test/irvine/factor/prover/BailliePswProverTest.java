package irvine.factor.prover;

import java.util.Random;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BailliePswProverTest extends TestCase {

  public void test() {
    final BailliePswProver prover = new BailliePswProver();
    final Random r = new Random();
    for (int k = 0; k < 20; ++k) {
      final long v = r.nextLong();
      final PrimeStatus ps = prover.isPrime(v);
      final boolean prime;
      try {
        prime = Z.valueOf(v).isPrime();
      } catch (final ArithmeticException e) {
        continue; // Number was too hard to prime test
      }
      assertEquals(String.valueOf(v), ps == PrimeStatus.PRIME, prime);
    }
  }
}
