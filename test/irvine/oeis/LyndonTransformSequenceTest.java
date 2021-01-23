package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LyndonTransformSequenceTest extends TestCase {

  public void test() {
    final FiniteSequence fs = new FiniteSequence(0, 1, 1, 3, 8, 26, 84, 297, 1066, 3976);
    final LyndonTransformSequence s = new LyndonTransformSequence(fs, 1);
    assertEquals(1, s.next().longValue());
    assertEquals(1, s.next().longValue());
    assertEquals(1, s.next().longValue());
    assertEquals(4, s.next().longValue());
    assertEquals(12, s.next().longValue());
    assertEquals(42, s.next().longValue());
    assertEquals(140, s.next().longValue());
    assertEquals(509, s.next().longValue());
    assertEquals(1853, s.next().longValue());
    assertEquals(6982, s.next().longValue());
  }
}
