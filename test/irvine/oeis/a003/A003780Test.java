package irvine.oeis.a003;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A003780Test extends TestCase {

  public void testSum() {
    final A003780 seq = new A003780();
    Z sum = Z.ZERO;
    for (int k = 0; k < 200; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(new Z("125246116787463268878086626543843959331603643904430706668970999549271213977454504737104684865271549449808582420568472"), sum);
  }
}
