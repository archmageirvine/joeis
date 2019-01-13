package irvine.math.factorial;

/**
 * Test corresponding class.
 *
 * @author Sean A. Irvine
 */
public class NaiveFactorialTest extends AbstractFactorialTest {

  @Override
  public Factorial getInstance() {
    return new NaiveFactorial();
  }

}
