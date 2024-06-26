package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FunctionLambdaTest extends TestCase {

  public void test() {
    assertEquals(5, Functions.create(Z::or).l(1, 4));
    assertEquals(5, Functions.create(Z::or).l(Z.ONE, Z.FOUR));
    assertEquals(Z.FIVE, Functions.create(Z::or).z(Z.ONE, Z.FOUR));
    assertEquals(Z.FIVE, Functions.create(Z::or).z(1, 4));
  }
}
