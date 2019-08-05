package irvine.oeis.a276;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A276280Test extends AbstractSequenceTest {

  public void testSum() {
    final Sequence seq = new A276280();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(new Z("24085216832096999935347960087573193230125"), sum);
  }
}
