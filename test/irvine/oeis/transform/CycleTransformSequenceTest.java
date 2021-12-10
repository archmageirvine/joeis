package irvine.oeis.transform;

import irvine.oeis.FiniteSequence;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CycleTransformSequenceTest extends TestCase {

  public void test() {
    final FiniteSequence fs = new FiniteSequence(0, 1, 1, 3, 8, 26, 84, 297, 1066, 3976);
    final CycleTransformSequence s = new CycleTransformSequence(fs, 1);
    assertEquals(1, s.next().longValue());
    assertEquals(1, s.next().longValue());
    assertEquals(2, s.next().longValue());
    assertEquals(5, s.next().longValue());
    assertEquals(14, s.next().longValue());
    assertEquals(43, s.next().longValue());
    assertEquals(146, s.next().longValue());
    assertEquals(510, s.next().longValue());
    assertEquals(1867, s.next().longValue());
    assertEquals(6987, s.next().longValue());
  }
}
