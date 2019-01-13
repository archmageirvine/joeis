package irvine.math.factorial;

/**
 * Test corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BorweinFactorialTest extends AbstractFactorialTest {

  @Override
  public Factorial getInstance() {
    return new BorweinFactorial();
  }
}
