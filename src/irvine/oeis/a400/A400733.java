package irvine.oeis.a400;
// manually 2026-10-07/filnum at 2026-10-07 

import java.util.function.Predicate;

import irvine.oeis.DirectPredicate;
import irvine.oeis.FilterNumberSequence;
import irvine.oeis.a268.A268335;

/**
 * A400733 Numbers that are both preceded and followed by runs of 7 consecutive exponentially odd numbers (A268335).
 * @author Georg Fischer
 */
public class A400733 extends FilterNumberSequence {

  private static final DirectPredicate A268335 = new A268335();

  protected static boolean rangeTest(final long lo, final long hi) {
    long j = lo;
    boolean result = A268335.is(j++);
    while (result && j <= hi) {
      result = A268335.is(j++);
    }
    return result;
  }

  /** Construct the sequence. */
  public A400733() {
    this(1, 1, k -> k % 8 == 4 && rangeTest(k + 1, k + 7) && rangeTest(k - 7, k - 1));
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param kStart first valueof k
   * @param pred predicate
   */
  public A400733(final int offset, final long kStart, final Predicate<Long> pred) {
    super(offset, kStart, pred);
  }

}
