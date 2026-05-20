package irvine.oeis.a395;

import irvine.math.predicate.Predicates;
import irvine.oeis.FilterNumberSequence;

/**
 * A395926 Grand-grand-kangaroo numbers: kangaroo numbers whose inner number is a grand-kangaroo number (A395761).
 * @author Sean A. Irvine
 */
public class A395926 extends FilterNumberSequence {

  private static long sK = 10000;
  private static long sM = 1000000;

  private static boolean isGrandKangaroo(final long n) {
    final String s = String.valueOf(n);
    final long m = Long.parseLong(s.substring(1, s.length() - 1));
    return m >= 110 && n % m == 0 && Predicates.KANGAROO.is(m);
  }

  /** Construct the sequence. */
  public A395926() {
    super(1, 1125000, k -> {
      if (k >= sM) {
        sK = sM;
        sM *= 10;
      }
      final long m = (k % sK) / 10;
      return m >= 11155 && k % m == 0 && isGrandKangaroo(m);
    });
  }
}
