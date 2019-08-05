package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.a039.A039000;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RunsBaseSequenceTest extends TestCase {

  public void test() {
    final Sequence seq = new A039000();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(Z.valueOf(643739), sum);
  }
}
