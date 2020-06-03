package irvine.oeis.a027;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A027672Test extends TestCase {

  public void testSum() {
    final A027672 seq = new A027672();
    Z sum = Z.ZERO;
    for (int k = 0; k < 200; ++k) {
      sum = sum.add(seq.next());
    }
    assertEquals(new Z("31240238438076399694"), sum);
  }
}
