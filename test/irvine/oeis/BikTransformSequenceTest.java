package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BikTransformSequenceTest extends TestCase {

  public void test() {
    final FiniteSequence fs = new FiniteSequence(0, 1, 1, 3, 8, 26, 84, 297, 1066, 3976);
    final BikTransformSequence s = new BikTransformSequence(fs, 1);
    assertEquals(1, s.next().longValue());
    assertEquals(1, s.next().longValue());
    assertEquals(2, s.next().longValue());
    assertEquals(5, s.next().longValue());
    assertEquals(15, s.next().longValue());
    assertEquals(48, s.next().longValue());
    assertEquals(164, s.next().longValue());
    assertEquals(583, s.next().longValue());
    assertEquals(2142, s.next().longValue());
    assertEquals(8062, s.next().longValue());
    assertNull(s.next());
  }
}
