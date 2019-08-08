package irvine.oeis;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ContinuedFractionOfSqrtSequenceTest extends TestCase {

  public void test5() {
    final ContinuedFractionOfSqrtSequence seq = new ContinuedFractionOfSqrtSequence(1, 5);
    assertEquals(Z.TWO, seq.next());
    assertEquals(Z.FOUR, seq.next());
    assertEquals(Z.FOUR, seq.next());
    assertEquals(4, seq.getLeastInPeriod());
    assertEquals(1, seq.getCountInPeriod(4));
  }

  public void test7() {
    final ContinuedFractionOfSqrtSequence seq = new ContinuedFractionOfSqrtSequence(0, 7);
    assertEquals(Z.TWO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.ONE, seq.next());
  }
}
