package irvine.factor.prime;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FeralTest extends AbstractPrimeTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mP = new Feral();
  }
}
