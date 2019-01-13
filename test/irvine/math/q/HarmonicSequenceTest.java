package irvine.math.q;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class HarmonicSequenceTest extends TestCase {

  public void test() {
    final HarmonicSequence h = new HarmonicSequence();
    assertEquals(Q.ONE, h.next());
    assertEquals(new Q(3, 2), h.next());
    assertEquals(new Q(11, 6), h.next());
  }
}
