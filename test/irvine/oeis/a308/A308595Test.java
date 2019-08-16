package irvine.oeis.a308;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A308595Test extends AbstractSequenceTest {

  public void testSum() {
    final A308595 seq = new A308595();
    Z sum = Z.ZERO;
    for (int k = 0; k < 200; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(Z.valueOf(321644), sum);
  }
}
