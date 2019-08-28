package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A006028Test extends AbstractSequenceTest {

  public void testSum() {
    final A006028 seq = new A006028();
    Z sum = Z.ZERO;
    Z a;
    while ((a = seq.next()) != null) {
      sum = sum.add(a);
    }
    assertEquals(new Z("633825300114114700748351602688"), sum);
  }
}
