package irvine.oeis.a400;
// manually 2026-10-07/filnum at 2026-10-07 

/**
 * A400734 Numbers k such that 4*(2*k+1)^2 is both preceded and followed by runs of 7 consecutive exponentially odd numbers (A268335).
 * @author Georg Fischer
 */
public class A400734 extends A400733 {

  /** Construct the sequence. */
  public A400734() {
    super(1, 1, k -> {
      final long m = 16 * k * (k + 1) + 4;
      return rangeTest(m + 1, m + 7) && rangeTest(m - 7, m - 1);
    });
  }
}
