package irvine.oeis;

import irvine.math.z.Z;
import irvine.oeis.a000.A000335;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class EulerTransformSequenceTest extends TestCase {

  public void test() {
    final A000335 s = new A000335();
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.FIVE, s.next());
    assertEquals(Z.valueOf(15), s.next());
    assertEquals(Z.valueOf(45), s.next());
    assertEquals(Z.valueOf(120), s.next());
  }

}
