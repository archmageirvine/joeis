package irvine.oeis.a114;

import irvine.math.z.Z;
import junit.framework.TestCase;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A114044Test extends TestCase {

  public void testSum() {
    final Sequence seq = new A114044();
    Z sum = Z.ZERO;
    for (int k = 0; k < 500; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(new Z("3618978927747695728591601278997353312720671631553423825309028202781"), sum);
  }
}
