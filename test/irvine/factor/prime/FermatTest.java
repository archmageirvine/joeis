package irvine.factor.prime;

/**
 * Tests the Fermat primality test.
 *
 * @author Sean A. Irvine
 */
public class FermatTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new Fermat();
  }
}
