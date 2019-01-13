package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A003903Test extends AbstractSequenceTest {

  public void testAll() {
    Z sum = Z.ZERO;
    Z t;
    final A003903 a = new A003903();
    while ((t = a.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals("12799171974", sum.toString());
  }
}
