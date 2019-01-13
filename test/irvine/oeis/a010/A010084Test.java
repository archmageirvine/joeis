package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A010084Test extends AbstractSequenceTest {

  public void testSum() {
    Z sum = Z.ZERO;
    final Sequence seq = new A010084();
    Z t;
    while ((t = seq.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(new Z("226156424291633194186662080095093570025917938800079226639565593765455331328"), sum);
  }
}
