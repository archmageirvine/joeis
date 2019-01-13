package irvine.factor.prime;

/**
 * Tests the Miller primality test.
 *
 * @author Sean A. Irvine
 */
public class MillerTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new Miller();
  }
}
