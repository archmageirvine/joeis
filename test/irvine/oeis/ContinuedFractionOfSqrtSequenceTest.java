package irvine.oeis;

import java.util.Arrays;

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

  public void test33() {
    final ContinuedFractionOfSqrtSequence seq = new ContinuedFractionOfSqrtSequence(0, 33);
    assertEquals(Z.FIVE, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals(Z.TWO, seq.next());
    assertEquals(Z.ONE, seq.next());
    assertEquals("[1, 2, 1, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(seq.mPeriod));
    assertTrue(seq.isOk());
    assertEquals(Z.ONE, seq.getDenominator());
    assertEquals(Z.FIVE, seq.getNumerator());
  }
}
