package irvine.factor.prime;

/**
 * Tests the Feral primality test.
 *
 * @author Sean A. Irvine
 */
public class FeralTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new Feral();
  }

  /*
  public void testCompareWithFast() {
    long p1 = 0;
    long p2 = 0;
    final Feral f1 = new Feral();
    final Fast f2 = new Fast();
    while (true) {
      p1 = f1.nextPrime(p1);
      p2 = f2.nextPrime(p2);
      assertEquals(p1, p2);
    }
  }
  */
}
