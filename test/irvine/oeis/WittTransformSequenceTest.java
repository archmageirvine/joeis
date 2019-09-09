package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.a060.A060165;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class WittTransformSequenceTest extends TestCase {

  public void test() {
    final Sequence s = new WittTransformSequence(new A060165());
    assertEquals(Z.ZERO, s.next());
    assertEquals(Z.TWO, s.next());
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.FOUR, s.next());
    assertEquals(Z.valueOf(13), s.next());
  }
}
