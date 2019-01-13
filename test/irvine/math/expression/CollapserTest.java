package irvine.math.expression;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CollapserTest extends TestCase {

  public void test() {
    assertEquals("x^3 * y^3", new MultiplyCollapser().collapse(Sircon.parse("x*y*x*y^2*x")).toString());
  }
}
