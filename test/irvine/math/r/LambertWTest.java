package irvine.math.r;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class LambertWTest extends TestCase {

  public void test() {
    assertEquals(0, LambertW.w(0), 1E-6);
    assertEquals(-1, LambertW.w(-1.0 / Math.E), 1E-6);
    assertEquals(1, LambertW.w(Math.E), 1E-6);
    assertEquals(-Math.log(2), LambertW.w(-0.5 * Math.log(2)), 1E-6);
  }
}
