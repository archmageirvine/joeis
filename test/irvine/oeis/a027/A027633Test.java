package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A027633Test extends AbstractSequenceTest {

  public void testSum() {
    final Sequence a = new A027633();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(a.next());
    }
    assertEquals(Z.valueOf(17299457615681L), sum);
  }
}
