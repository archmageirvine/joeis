package irvine.math.expression;

import irvine.math.q.Q;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ExpressionUtilsTest extends TestCase {

  public void testToString() {
    assertEquals("x", ExpressionUtils.toString(new Identifier("x")));
    assertEquals("2", ExpressionUtils.toString(new LiteralZ(Z.TWO)));
    assertEquals("(2 + 1/2)", ExpressionUtils.toString(new Add(new LiteralZ(Z.TWO), new LiteralQ(Q.HALF))));
  }

}
