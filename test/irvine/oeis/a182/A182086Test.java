package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A182086Test extends AbstractSequenceTest {

  public void testSum() {
    final Sequence seq = new A182086();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(Z.valueOf(112584870), sum);
  }
}
