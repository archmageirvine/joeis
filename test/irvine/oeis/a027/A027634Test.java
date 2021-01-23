package irvine.oeis.a027;

import irvine.math.z.Z;
import junit.framework.TestCase;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A027634Test extends TestCase {

  public void testSum() {
    final Sequence a = new A027634();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(a.next());
    }
    assertEquals(Z.valueOf(1074460940607L), sum);
  }
}
