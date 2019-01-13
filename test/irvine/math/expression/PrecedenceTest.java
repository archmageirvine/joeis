package irvine.math.expression;

import irvine.TestUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class PrecedenceTest extends TestCase {

  public void testOrdinary() {
    TestUtils.testEnum(Precedence.class, "[ADD, MULTIPLY, POWER, FUNCTION, ATOM]");
  }
}

