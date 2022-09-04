package irvine.oeis.base;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SquareDigitsSequenceTest extends TestCase {

  public void test() {
    final SquareDigitsSequence s = new SquareDigitsSequence(1, 10, 2, "012");
    assertEquals(Z.ZERO, s.next());
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.TEN, s.next());
    assertEquals(Z.valueOf(11), s.next());
    assertEquals(Z.valueOf(100), s.next());
    assertEquals(Z.valueOf(101), s.next());
  }
}
