package irvine.math.expression;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SubstitutionTest extends TestCase {

  public void test() {
    assertEquals("4", Sircon.parse("subs(x^2,x=2)").eval().toString());
    assertEquals("6", Sircon.parse("subs(diff(x^2,x),x=3)").eval().toString());
  }
}
