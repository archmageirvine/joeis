package irvine.oeis.a002;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A002410Test extends TestCase {

  public void testTheta() {
    assertEquals(87.9721652317872, A002410.theta(100), 1e-9);
  }

}
