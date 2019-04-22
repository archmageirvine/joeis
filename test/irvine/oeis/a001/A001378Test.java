package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A001378Test extends AbstractSequenceTest {

  public void testSum() {
    Z sum = Z.ZERO;
    final Sequence a = new A001378();
    Z t;
    while ((t = a.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(Z.valueOf(512391215683416888L), sum);
  }
}
