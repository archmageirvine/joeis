package irvine.oeis;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NegativePositiveSequenceTest extends TestCase {

  public void testA() {
    final Sequence s = new NegativePositiveSequence(2, 1, "ak", 1, 0);
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.TWO, s.next());
    assertEquals(Z.FOUR, s.next());
    assertEquals(Z.THREE, s.next());
    assertEquals(Z.SIX, s.next());
  }

  public void testD() {
    final Sequence s = new NegativePositiveSequence(2, 1, "dk", 1, 0);
    assertEquals(Z.ZERO, s.next());
    assertEquals(Z.ONE, s.next());
    assertEquals(Z.TWO, s.next());
    assertEquals(Z.NEG_ONE, s.next());
    assertEquals(Z.THREE, s.next());
  }
}
