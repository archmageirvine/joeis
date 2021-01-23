package irvine.oeis.a114;

import irvine.math.z.Z;
import junit.framework.TestCase;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A114138Test extends TestCase {

  public void testSum() {
    final Sequence seq = new A114138();
    Z sum = Z.ZERO;
    for (int k = 0; k < 200; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(new Z("33252822347946769745235852192804959116537332592"), sum);
  }
}
