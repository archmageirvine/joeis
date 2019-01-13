package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A010087Test extends AbstractSequenceTest {

  public void testSum() {
    Z sum = Z.ZERO;
    final Sequence seq = new A010087();
    Z t;
    while ((t = seq.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(new Z("144115188075855872"), sum);
  }
}
