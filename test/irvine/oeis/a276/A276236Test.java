package irvine.oeis.a276;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A276236Test extends AbstractSequenceTest {

  public void testSum() {
    final Sequence a = new A276236();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(a.next());
    }
    assertEquals(new Z("67339499974639072725998364323864"), sum);
  }
}
