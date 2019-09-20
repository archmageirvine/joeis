package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A162494Test extends AbstractSequenceTest {

  public void testSum() {
    final Sequence seq = new A162494();
    Z sum = Z.ZERO;
    for (int k = 0; k < 200; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(Z.valueOf(696729600), sum);
  }
}
