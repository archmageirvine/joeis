package irvine.factor.prover;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LucasProbablePrimeTest extends TestCase {

  public void test2039() {
    assertEquals(PrimeStatus.PROB_PRIME, new LucasProbablePrime(Z.valueOf(2039)).runTest());
//    assertEquals(PrimeStatus.PROB_PRIME, new LucasProbablePrime(Z.valueOf(5459)).runTest()); // pseudoprime
    assertEquals(PrimeStatus.COMPOSITE, new LucasProbablePrime(Z.valueOf(2041)).runTest());
  }

}
