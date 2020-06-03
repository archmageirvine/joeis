package irvine.oeis.a001;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A001379Test extends TestCase {

  public void testSum() {
    final A001379 s = new A001379();
    Z sum = Z.ZERO;
    Z t;
    while ((t = s.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(new Z("5844076785304502808013602136"), sum);
  }
}
