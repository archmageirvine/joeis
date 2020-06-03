package irvine.oeis.a003;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A003914Test extends TestCase {

  public void testSum() {
    final A003914 seq = new A003914();
    Z sum = Z.ZERO;
    Z t;
    while ((t = seq.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(12916789604L, sum.longValueExact());
  }
}
