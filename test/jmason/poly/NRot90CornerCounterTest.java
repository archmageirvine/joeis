package jmason.poly;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a234.A234007;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NRot90CornerCounterTest extends TestCase {

  public void test() {
    final Sequence s = new A234007();
    assertEquals(Z.ZERO, s.next());
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.TWO, s.next());
    assertEquals(Z.NINE, s.next());
    assertEquals(Z.valueOf(30), s.next());
  }
}
