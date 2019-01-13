package irvine.factor.prover;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LucasProverTest extends TestCase {

  public void test() {
    final LucasProver lp = new LucasProver();
    lp.setSystematic(true);
    assertEquals(PrimeStatus.PRIME, lp.isPrime(3));
    assertEquals(PrimeStatus.PRIME, lp.isPrime(71));
    assertEquals(PrimeStatus.COMPOSITE, lp.isPrime(63));
    lp.setSystematic(false);
    assertEquals(PrimeStatus.UNKNOWN, lp.isPrime(63));
  }

  public void testSpecialCases() {
    final LucasProver lp = new LucasProver();
    assertEquals(PrimeStatus.COMPOSITE, lp.isPrime(-1));
    assertEquals(PrimeStatus.COMPOSITE, lp.isPrime(0));
    assertEquals(PrimeStatus.COMPOSITE, lp.isPrime(1));
    assertEquals(PrimeStatus.PRIME, lp.isPrime(2));
    assertEquals(PrimeStatus.COMPOSITE, lp.isPrime(4));
  }
}
