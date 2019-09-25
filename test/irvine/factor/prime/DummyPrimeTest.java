package irvine.factor.prime;

import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyPrimeTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new Fast();
  }

  private static final AbstractPrime MY_PRIME = new AbstractPrime() {
    @Override
    public boolean isPrime(final Z n) {
      return false;
    }
  };

  public void testSmall() {
    assertEquals(Z.TWO, MY_PRIME.nextPrime(Z.ZERO));
    assertEquals(2, MY_PRIME.nextPrime(0));
    assertEquals(2, MY_PRIME.nextPrime(1));
    assertEquals(2, MY_PRIME.prevPrime(3));
    assertEquals(Z.TWO, MY_PRIME.prevPrime(Z.THREE));
    assertEquals(0, MY_PRIME.prevPrime(2));
    assertEquals(Z.ZERO, MY_PRIME.prevPrime(Z.TWO));
  }
}
