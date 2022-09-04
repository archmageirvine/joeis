package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a039.A039000;
import irvine.oeis.a043.A043571;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RunsBaseSequenceTest extends TestCase {

  public void test1() {
    final Sequence seq = new A039000();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(Z.valueOf(643739), sum);
  }

  public void test2() {
    final Sequence seq = new A043571();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(Z.valueOf(865394), sum);
  }
}
