package irvine.oeis.transform;

import irvine.oeis.FiniteSequence;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class InverseMobiusTransformSequenceTest extends TestCase {

  public void test() {
    final FiniteSequence fs = new FiniteSequence(0, 1, 1, 3, 8, 26, 84, 297, 1066, 3976);
    final InverseMobiusTransformSequence s = new InverseMobiusTransformSequence(fs, 1);
    assertEquals(0, s.next().longValue());
    assertEquals(1, s.next().longValue());
    assertEquals(2, s.next().longValue());
    assertEquals(4, s.next().longValue());
    assertEquals(10, s.next().longValue());
    assertEquals(27, s.next().longValue());
    assertEquals(89, s.next().longValue());
    assertEquals(298, s.next().longValue());
    assertEquals(1076, s.next().longValue());
    assertEquals(3980, s.next().longValue());
    assertNull(s.next());
  }
}
