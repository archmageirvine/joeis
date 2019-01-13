package irvine.oeis;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class FiniteSequenceTest extends TestCase {

  public void testFiniteSequence() {
    final FiniteSequence s = new FiniteSequence(42, 10);
    assertEquals(42, s.next().intValue());
    assertEquals(10, s.next().intValue());
    assertNull(s.next());
  }
}
