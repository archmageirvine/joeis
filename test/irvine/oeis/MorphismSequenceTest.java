package irvine.oeis;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MorphismSequenceTest extends TestCase {

  public void test() {
    final MorphismSequence seq = new MorphismSequence(1, "1", "1", "0->11, 1->10");
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ZERO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ZERO, seq.next());
  }
}
