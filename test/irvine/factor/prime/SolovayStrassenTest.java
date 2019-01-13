package irvine.factor.prime;

/**
 * Tests the Solovay-Strassen primality test.
 *
 * @author Sean A. Irvine
 */
public class SolovayStrassenTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new SolovayStrassen();
  }
}
