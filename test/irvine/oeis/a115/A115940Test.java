package irvine.oeis.a115;

import irvine.math.z.Z;
import junit.framework.TestCase;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A115940Test extends TestCase {

  public void testSum() {
    final Sequence s = new A115940();
    Z sum = Z.ZERO;
    Z t;
    while ((t = s.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(405606324888L, sum.longValue());
  }
}
