package irvine.oeis.a395;

import irvine.oeis.FilterNumberSequence;

/**
 * A393490.
 * @author Sean A. Irvine
 */
public class A395926 extends FilterNumberSequence {

  private static long K = 10000;
  private static long M = 1000000;

  private static boolean isGrandKangaroo(final long n) {
    final String s = String.valueOf(n);
    final long m = Long.parseLong(s.substring(1, s.length() - 1));
    return m >= 110 && n % m == 0 && A395761.isKangaroo(m);
  }

  /** Construct the sequence. */
  public A395926() {
    super(1, 1125000, k -> {
      if (k >= M) {
        K = M;
        M *= 10;
      }
      final long m = (k % K) / 10;
      return m >= 11155 && k % m == 0 && isGrandKangaroo(m);
    });
  }
}
