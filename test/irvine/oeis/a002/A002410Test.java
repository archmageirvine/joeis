package irvine.oeis.a002;

import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A002410Test extends AbstractSequenceTest {

  public void testTheta() {
    assertEquals(87.9721652317872, A002410.theta(100), 1e-9);
  }

}
