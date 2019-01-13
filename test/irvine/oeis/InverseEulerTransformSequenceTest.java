package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class InverseEulerTransformSequenceTest extends TestCase {

  public void test() {
    final FiniteSequence fs = new FiniteSequence(0, 1, 1, 3, 8, 26, 84, 297, 1066, 3976);
    final InverseEulerTransformSequence s = new InverseEulerTransformSequence(fs, 1);
    assertEquals(0, s.next().longValue());
    assertEquals(1, s.next().longValue());
    assertEquals(0, s.next().longValue());
    assertEquals(2, s.next().longValue());
    assertEquals(5, s.next().longValue());
    assertEquals(18, s.next().longValue());
    assertEquals(55, s.next().longValue());
    assertEquals(203, s.next().longValue());
    assertEquals(718, s.next().longValue());
    assertEquals(2706, s.next().longValue());
    assertNull(s.next());
  }
}
