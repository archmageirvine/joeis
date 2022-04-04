package irvine.math.factorial;

/**
 * Test corresponding class.
 * @author Sean A. Irvine
 */
public class MemoryFactorialTest extends AbstractFactorialTest {

  @Override
  public Factorial getInstance() {
    return MemoryFactorial.SINGLETON;
  }

}
