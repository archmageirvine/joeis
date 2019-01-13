package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;
import irvine.oeis.Sequence;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A010088Test extends AbstractSequenceTest {

  public void testSum() {
    Z sum = Z.ZERO;
    final Sequence seq = new A010088();
    Z t;
    while ((t = seq.next()) != null) {
      sum = sum.add(t);
    }
    assertEquals(new Z("1329227995784915872903807060280344576"), sum);
  }
}
